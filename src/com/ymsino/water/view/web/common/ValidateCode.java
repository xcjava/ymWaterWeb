package com.ymsino.water.view.web.common;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateCode extends ActionSupport {

	private static final long serialVersionUID = -7427389730037711903L;

	//验证码图片的宽度。
	private int width; 
	//验证码图片的高度。
	private int height; 
	//验证码字符个数
	private int codeCount; 
	//干扰线条数
	private int interferentialLineCount;
	//Session属性的名称
	private String sessionAttribute;
	
	private int x=0; 
	//字体高度
	private int fontHeight; 
	private int codeY; 
	
	private char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
			'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
			'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	

	@Override
	public String execute() throws Exception {
		
		x=width/(codeCount+1);
		fontHeight=height-2;
		codeY=height-4;
		
		//定义图像buffer
		BufferedImage buffImg = new BufferedImage(
		width, height,BufferedImage.TYPE_INT_RGB); 
		Graphics2D g = buffImg.createGraphics(); 
		
		//创建一个随机数生成器类
		Random random = new Random(); 
		
		//将图像填充为白色
		g.setColor(getRandColor(200,250)); 
		g.fillRect(0, 0, width, height); 
		
		//创建字体，字体的大小应该根据图片的高度来定。
		Font font = new Font("Fixedsys", Font.PLAIN, fontHeight); 
		//设置字体。
		g.setFont(font); 
		
		//画边框。
		g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110))); 
		g.drawRect(0, 0, width - 1, height - 1); 
		
		//随机产生条干扰线，使图象中的认证码不易被其它程序探测到。
		g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110))); 
		for(int i = 0; i < interferentialLineCount; i++) 
		{
			int x = random.nextInt(width); 
			int y = random.nextInt(height); 
			int xl = random.nextInt(12); 
			int yl = random.nextInt(12); 
			g.drawLine(x, y, x + xl, y + yl); 
		}
		
		//randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
		StringBuffer randomCode = new StringBuffer(); 
		int red = 0, green = 0, blue = 0; 
		
		//随机产生codeCount数字的验证码。
		for (int i = 0; i < codeCount; i++) {
			//得到随机产生的验证码数字。
			String strRand = String.valueOf(codeSequence[random.nextInt(codeSequence.length)]); 
			//产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
			red = random.nextInt(255); 
			green = random.nextInt(255); 
			blue = random.nextInt(255); 
			
			//用随机产生的颜色将验证码绘制到图像中。
			g.setColor(new Color(000000)); 
			g.drawString(strRand, 13*i+6,16);
			
			//将产生的四个随机数组合在一起。
			randomCode.append(strRand); 
		}
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		HttpServletResponse response = ServletActionContext.getResponse();
		// 将四位数字的验证码保存到Session中。
		session.setAttribute(sessionAttribute, randomCode.toString().toLowerCase());
		
		// 禁止图像缓存。
		response.setHeader("Pragma", "no-cache"); 
		response.setHeader("Cache-Control", "no-cache"); 
		response.setDateHeader("Expires", 0); 
		
		response.setContentType("image/jpeg"); 
		
		//将图像输出到Servlet输出流中。
		ServletOutputStream sos = response.getOutputStream(); 
		ImageIO.write(buffImg, "jpeg", sos); 
		sos.close(); 
		
		return null;
	}
	
	public Color getRandColor(int fc,int bc){
		Random random = new Random();
        if(fc>255) fc=255;
        if(bc>255) bc=255;
        int r=fc+random.nextInt(bc-fc);
        int g=fc+random.nextInt(bc-fc);
        int b=fc+random.nextInt(bc-fc);
        return new Color(r,g,b);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCodeCount() {
		return codeCount;
	}

	public void setCodeCount(int codeCount) {
		this.codeCount = codeCount;
	}

	public int getInterferentialLineCount() {
		return interferentialLineCount;
	}

	public void setInterferentialLineCount(int interferentialLineCount) {
		this.interferentialLineCount = interferentialLineCount;
	}

	public String getSessionAttribute() {
		return sessionAttribute;
	}

	public void setSessionAttribute(String sessionAttribute) {
		this.sessionAttribute = sessionAttribute;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getFontHeight() {
		return fontHeight;
	}

	public void setFontHeight(int fontHeight) {
		this.fontHeight = fontHeight;
	}

	public int getCodeY() {
		return codeY;
	}

	public void setCodeY(int codeY) {
		this.codeY = codeY;
	}

	public char[] getCodeSequence() {
		return codeSequence;
	}

	public void setCodeSequence(char[] codeSequence) {
		this.codeSequence = codeSequence;
	}
	
}
