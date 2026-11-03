package com.aspose.slides.internal.g1p;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D.Float;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.security.InvalidParameterException;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public final class n5 extends Graphics2D {
   private Double k5 = null;
   private Shape u3 = null;
   private Rectangle2D a6 = null;
   private Area u9 = null;
   private AffineTransform h0 = null;
   private Font c8 = null;
   private Stroke t2 = null;
   private Paint s7 = null;
   private Composite x8 = null;
   private Color n3 = Color.WHITE;
   private FontRenderContext y4 = null;
   private RenderingHints e2 = new RenderingHints(null);
   static BufferedImage n5 = new BufferedImage(16, 16, 5);
   static Graphics2D l6 = n5.createGraphics();

   public n5() {
   }

   private n5(n5 var1) {
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
      this.t2 = var1.t2;
      this.s7 = var1.s7;
      this.x8 = var1.x8;
      this.n3 = var1.n3;
      this.y4 = var1.y4;
      this.e2 = var1.e2;
   }

   @Override
   public void draw(Shape shape) {
      this.n5(shape);
   }

   @Override
   public boolean drawImage(Image image, AffineTransform imageToUser, ImageObserver imageObserver) {
      Shape var4 = new Rectangle(image.getWidth(imageObserver), image.getHeight(imageObserver));
      if (imageToUser != null) {
         var4 = imageToUser.createTransformedShape(var4);
      }

      this.n5(var4);
      return true;
   }

   @Override
   public void drawImage(BufferedImage arg0, BufferedImageOp arg1, int arg2, int arg3) {
   }

   @Override
   public void drawRenderedImage(RenderedImage image, AffineTransform imageToUser) {
      Double var3 = new Double(image.getMinX(), image.getMinY(), image.getWidth(), image.getHeight());
      this.n5(imageToUser.createTransformedShape(var3));
   }

   @Override
   public void drawRenderableImage(RenderableImage image, AffineTransform imageToUser) {
      Double var3 = new Double(image.getMinX(), image.getMinY(), image.getWidth(), image.getHeight());
      this.n5(imageToUser.createTransformedShape(var3));
   }

   @Override
   public void drawString(String string, int x, int y) {
      this.drawString(string, (float)x, (float)y);
   }

   @Override
   public void drawString(String string, float x, float y) {
      TextLayout var4 = new TextLayout(string, this.c8, this.getFontRenderContext());
      Rectangle2D var5 = this.c8.getStringBounds(string, this.getFontRenderContext());
      Rectangle2D var6 = var4.getBounds();
      this.n5(new Double(var6.getX() + x, var6.getY() + y, var6.getWidth(), var6.getHeight() + var4.getLeading()));
   }

   @Override
   public void drawString(AttributedCharacterIterator arg0, int x, int y) {
      this.drawString(arg0, (float)x, (float)y);
   }

   @Override
   public void drawString(AttributedCharacterIterator arg0, float x, float y) {
      TextLayout var4 = new TextLayout(arg0, this.getFontRenderContext());
      Rectangle2D var5 = var4.getBounds();
      this.n5(new Double(var5.getX() + x, var5.getY() + y, var5.getWidth(), var5.getHeight()));
   }

   @Override
   public void drawGlyphVector(GlyphVector glyphVector, float x, float y) {
      Rectangle2D var4 = glyphVector.getLogicalBounds();
      this.n5(new Double(var4.getX() + x, var4.getY() + y, var4.getWidth(), var4.getHeight()));
   }

   @Override
   public void fill(Shape shape) {
      this.n5(shape);
   }

   @Override
   public boolean hit(Rectangle deviceRect, Shape shape, boolean onStroke) {
      if (deviceRect == null || shape == null) {
         throw new InvalidParameterException("deviceRect and shape can't be null.");
      }

      if (this.u3 != null && !this.a6.intersects(deviceRect)) {
         return false;
      }

      if (onStroke) {
         if (this.t2 == null) {
            return false;
         }

         shape = this.t2.createStrokedShape(shape);
      }

      if (this.h0 != null) {
         shape = this.h0.createTransformedShape(shape);
      }

      Area var4 = new Area(shape);
      if (this.u3 != null) {
         var4.intersect(this.u9);
      }

      return var4.intersects(deviceRect);
   }

   @Override
   public GraphicsConfiguration getDeviceConfiguration() {
      return null;
   }

   @Override
   public void setComposite(Composite composite) {
      this.x8 = composite;
   }

   @Override
   public void setPaint(Paint paint) {
      this.s7 = paint;
   }

   @Override
   public void setStroke(Stroke stroke) {
      this.t2 = stroke;
   }

   @Override
   public void setRenderingHint(Key key, Object value) {
      this.e2.put(key, value);
   }

   @Override
   public Object getRenderingHint(Key key) {
      return this.e2.get(key);
   }

   @Override
   public void setRenderingHints(Map map) {
      this.e2 = new RenderingHints(map);
   }

   @Override
   public void addRenderingHints(Map map) {
      this.e2.add(new RenderingHints(map));
   }

   @Override
   public RenderingHints getRenderingHints() {
      return this.e2;
   }

   @Override
   public void translate(int dx, int dy) {
      this.translate((double)dx, (double)dy);
   }

   @Override
   public void translate(double dx, double dy) {
      AffineTransform var5 = new AffineTransform(this.h0);
      var5.translate(dx, dy);
      this.n5(var5);
   }

   @Override
   public void rotate(double angle) {
      AffineTransform var3 = new AffineTransform(this.h0);
      var3.rotate(angle);
      this.n5(var3);
   }

   @Override
   public void rotate(double angle, double x, double y) {
      AffineTransform var7 = new AffineTransform(this.h0);
      var7.rotate(angle, x, y);
      this.n5(var7);
   }

   @Override
   public void scale(double scaleX, double scaleY) {
      AffineTransform var5 = new AffineTransform(this.h0);
      var5.scale(scaleX, scaleY);
      this.n5(var5);
   }

   @Override
   public void shear(double shx, double shy) {
      AffineTransform var5 = new AffineTransform(this.h0);
      var5.shear(shx, shy);
      this.n5(var5);
   }

   @Override
   public void transform(AffineTransform transform) {
      AffineTransform var2 = new AffineTransform(this.h0);
      var2.concatenate(transform);
      this.n5(var2);
   }

   @Override
   public void setTransform(AffineTransform transform) {
      if (transform == null) {
         this.n5((AffineTransform)null);
      } else {
         this.n5(new AffineTransform(transform));
      }
   }

   @Override
   public AffineTransform getTransform() {
      return this.h0 == null ? null : (AffineTransform)this.h0.clone();
   }

   @Override
   public Paint getPaint() {
      return this.s7;
   }

   @Override
   public Composite getComposite() {
      return this.x8;
   }

   @Override
   public void setBackground(Color arg0) {
   }

   @Override
   public Color getBackground() {
      return this.n3;
   }

   @Override
   public Stroke getStroke() {
      return this.t2;
   }

   @Override
   public void clip(Shape clip) {
      if (this.h0 != null) {
         clip = this.h0.createTransformedShape(clip);
      }

      if (this.u3 != null) {
         Area var2 = new Area(clip);
         var2.intersect(this.u9);
         this.l6(var2);
      } else {
         this.l6(clip);
      }
   }

   @Override
   public FontRenderContext getFontRenderContext() {
      if (this.y4 == null) {
         this.y4 = new FontRenderContext(this.h0, false, false);
      }

      return this.y4;
   }

   @Override
   public Graphics create() {
      return new n5(this);
   }

   @Override
   public Color getColor() {
      return this.s7 instanceof Color ? (Color)this.s7 : null;
   }

   @Override
   public void setColor(Color color) {
      this.setPaint(color);
   }

   @Override
   public void setPaintMode() {
   }

   @Override
   public void setXORMode(Color arg0) {
   }

   @Override
   public Font getFont() {
      return this.c8;
   }

   @Override
   public void setFont(Font font) {
      this.c8 = font;
   }

   @Override
   public FontMetrics getFontMetrics(Font font) {
      return l6.getFontMetrics(font);
   }

   @Override
   public Rectangle getClipBounds() {
      return this.u3 == null
         ? null
         : new Rectangle((int)(this.a6.getX() + 0.5), (int)(this.a6.getY() + 0.5), (int)(this.a6.getWidth() + 0.5), (int)(this.a6.getHeight() + 0.5));
   }

   @Override
   public void clipRect(int x, int y, int width, int height) {
      Rectangle var5 = new Rectangle(x, y, width, height);
      if (this.u3 == null) {
         this.setClip(var5);
      } else {
         this.clip(var5);
      }
   }

   @Override
   public void setClip(int x, int y, int width, int height) {
      this.setClip(new Rectangle(x, y, width, height));
   }

   @Override
   public Shape getClip() {
      if (this.u3 != null && this.h0 != null) {
         try {
            AffineTransform var1 = this.h0.createInverse();
            return var1.createTransformedShape(this.u3);
         } catch (NoninvertibleTransformException var2) {
            return this.u3;
         }
      } else {
         return this.u3;
      }
   }

   @Override
   public void setClip(Shape clip) {
      if (this.h0 != null) {
         clip = this.h0.createTransformedShape(clip);
      }

      this.l6(clip);
   }

   @Override
   public void copyArea(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
   }

   @Override
   public void drawLine(int x1, int y1, int x2, int y2) {
      this.draw(new Float(x1, y1, x2, y2));
   }

   @Override
   public void fillRect(int x, int y, int width, int height) {
      this.fill(new Rectangle(x, y, width, height));
   }

   @Override
   public void clearRect(int x, int y, int width, int height) {
      this.fill(new Rectangle(x, y, width, height));
   }

   @Override
   public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
      this.draw(new java.awt.geom.RoundRectangle2D.Float(x, y, width, height, arcWidth, arcHeight));
   }

   @Override
   public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
      this.fill(new java.awt.geom.RoundRectangle2D.Float(x, y, width, height, arcWidth, arcHeight));
   }

   @Override
   public void drawOval(int x, int y, int width, int height) {
      this.draw(new java.awt.geom.Ellipse2D.Float(x, y, width, height));
   }

   @Override
   public void fillOval(int x, int y, int width, int height) {
      this.fill(new java.awt.geom.Ellipse2D.Float(x, y, width, height));
   }

   @Override
   public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
      this.draw(new java.awt.geom.Arc2D.Float(x, y, width, height, startAngle, arcAngle, 0));
   }

   @Override
   public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
      this.fill(new java.awt.geom.Arc2D.Float(x, y, width, height, startAngle, arcAngle, 2));
   }

   @Override
   public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
      GeneralPath var4 = new GeneralPath();
      nPoints = Math.min(Math.min(xPoints.length, yPoints.length), nPoints);
      if (nPoints > 0) {
         var4.moveTo(xPoints[0], yPoints[0]);

         for (int var5 = 1; var5 < nPoints; var5++) {
            var4.lineTo(xPoints[var5], yPoints[var5]);
         }

         this.draw(var4);
      }
   }

   @Override
   public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
      GeneralPath var4 = new GeneralPath();
      nPoints = Math.min(Math.min(xPoints.length, yPoints.length), nPoints);
      if (nPoints > 0) {
         var4.moveTo(xPoints[0], yPoints[0]);

         for (int var5 = 1; var5 < nPoints; var5++) {
            var4.lineTo(xPoints[var5], yPoints[var5]);
         }

         var4.closePath();
         this.draw(var4);
      }
   }

   @Override
   public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
      GeneralPath var4 = new GeneralPath();
      nPoints = Math.min(Math.min(xPoints.length, yPoints.length), nPoints);
      if (nPoints > 0) {
         var4.moveTo(xPoints[0], yPoints[0]);

         for (int var5 = 1; var5 < nPoints; var5++) {
            var4.lineTo(xPoints[var5], yPoints[var5]);
         }

         var4.closePath();
         this.fill(var4);
      }
   }

   @Override
   public boolean drawImage(Image image, int x, int y, ImageObserver imageObserver) {
      this.n5(new Rectangle(x, y, image.getWidth(imageObserver), image.getHeight(imageObserver)));
      return true;
   }

   @Override
   public boolean drawImage(Image image, int x, int y, int width, int height, ImageObserver imageObserver) {
      this.n5(new Rectangle(x, y, width, height));
      return true;
   }

   @Override
   public boolean drawImage(Image image, int x, int y, Color arg3, ImageObserver imageObserver) {
      return this.drawImage(image, x, y, imageObserver);
   }

   @Override
   public boolean drawImage(Image image, int x, int y, int width, int height, Color bgColor, ImageObserver imageObserver) {
      return this.drawImage(image, x, y, width, height, imageObserver);
   }

   @Override
   public boolean drawImage(Image image, int x, int y, int width, int height, int arg5, int arg6, int arg7, int arg8, ImageObserver imageObserver) {
      return this.drawImage(image, x, y, width, height, imageObserver);
   }

   @Override
   public boolean drawImage(Image image, int x, int y, int width, int height, int arg5, int arg6, int arg7, int arg8, Color arg9, ImageObserver imageObserver) {
      return this.drawImage(image, x, y, width, height, imageObserver);
   }

   @Override
   public void dispose() {
   }

   private void n5(Shape var1) {
      if (this.h0 != null) {
         var1 = this.h0.createTransformedShape(var1);
      }

      if (this.a6 != null) {
         Rectangle2D var2 = this.a6.createIntersection(var1.getBounds2D());
         this.n5(var2);
      } else {
         this.n5(var1.getBounds2D());
      }
   }

   private void l6(Shape var1) {
      this.u3 = var1;
      if (this.u3 != null) {
         this.a6 = this.u3.getBounds2D();
         this.u9 = new Area(this.u3);
      } else {
         this.a6 = null;
         this.u9 = null;
      }
   }

   private void n5(AffineTransform var1) {
      this.h0 = var1;
      this.y4 = null;
   }

   public Rectangle2D n5() {
      return this.k5 != null ? (Rectangle2D)this.k5.clone() : null;
   }

   private void n5(Rectangle2D var1) {
      if (this.k5 == null) {
         this.k5 = new Double(var1.getX(), var1.getY(), var1.getWidth(), var1.getHeight());
      } else {
         this.k5.add(var1);
      }
   }
}
