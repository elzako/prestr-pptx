package com.aspose.slides.internal.c9b;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class h0 implements Shape, Cloneable {
   private GeneralPath n5;

   public GeneralPath y4() {
      return this.n5;
   }

   public h0() {
      this.n5 = new GeneralPath();
   }

   public h0(Shape var1) {
      this.n5 = new GeneralPath(var1);
   }

   public h0(GeneralPath var1) {
      this.n5 = var1;
   }

   @Override
   public boolean contains(double x, double y) {
      return this.n5.contains(x, y);
   }

   @Override
   public boolean contains(double x, double y, double w, double h) {
      return this.n5.contains(x, y, w, h);
   }

   @Override
   public boolean contains(Point2D p) {
      return this.n5.contains(p);
   }

   @Override
   public boolean contains(Rectangle2D r) {
      return this.n5.contains(r);
   }

   @Override
   public Rectangle getBounds() {
      return this.n5.getBounds();
   }

   @Override
   public Rectangle2D getBounds2D() {
      return this.n5.getBounds2D();
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at) {
      return this.n5.getPathIterator(at);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at, double flatness) {
      return this.n5.getPathIterator(at, flatness);
   }

   @Override
   public boolean intersects(double x, double y, double w, double h) {
      return this.n5.intersects(x, y, w, h);
   }

   @Override
   public boolean intersects(Rectangle2D r) {
      return this.n5.intersects(r);
   }

   public void n5(PathIterator var1, boolean var2) {
      this.n5.append(var1, var2);
   }

   public void n5(Shape var1, boolean var2) {
      this.n5.append(var1, var2);
   }

   @Override
   public Object clone() {
      return new h0((GeneralPath)this.n5.clone());
   }

   public void e2() {
      this.n5.closePath();
   }

   public void n5(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.n5.curveTo((float)var1, (float)var3, (float)var5, (float)var7, (float)var9, (float)var11);
   }

   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5.curveTo(var1, var2, var3, var4, var5, var6);
   }

   public void n5(double var1, double var3) {
      this.n5.lineTo((float)var1, (float)var3);
   }

   public void n5(float var1, float var2) {
      this.n5.lineTo(var1, var2);
   }

   public void l6(double var1, double var3) {
      this.n5.moveTo((float)var1, (float)var3);
   }

   public void l6(float var1, float var2) {
      this.n5.moveTo(var1, var2);
   }

   public void n5(double var1, double var3, double var5, double var7) {
      this.n5.quadTo((float)var1, (float)var3, (float)var5, (float)var7);
   }

   public void n5(float var1, float var2, float var3, float var4) {
      this.n5.quadTo(var1, var2, var3, var4);
   }

   public void n5(AffineTransform var1) {
      this.n5.transform(var1);
   }

   public int t9() {
      return this.n5.getWindingRule();
   }

   public void k5(int var1) {
      this.n5.setWindingRule(var1);
   }

   public void c8() {
      this.n5.reset();
   }
}
