package com.aspose.slides.internal.t7k;

import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r5w.x8;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

abstract class n5 extends k5 {
   protected n5(x8 var1, com.aspose.slides.internal.o9b.u3 var2) {
      super(var1, var2);
   }

   @Override
   public void n5(Shape var1) {
      com.aspose.slides.internal.o9b.l6 var2 = this.l6(var1);
      com.aspose.slides.internal.o9b.l6 var3 = this.u3(var1);
      this.n5(var2, var3);
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2);

   protected final com.aspose.slides.internal.o9b.l6 n5() {
      Rectangle var1 = this.n5.m3().getBounds();
      return new com.aspose.slides.internal.o9b.l6(var1.width, var1.height, 2498570);
   }

   protected com.aspose.slides.internal.o9b.l6 l6(Shape var1) {
      com.aspose.slides.internal.o9b.l6 var2 = this.n5();
      z1 var3 = z1.n5(var2);
      com.aspose.slides.internal.x4g.x8 var4 = new com.aspose.slides.internal.x4g.x8(this.n5, null, false);
      var4.n5(var3);
      var3.n5(new m3(c8.n5(-16777216)), s7.n5((Object)(var1)));
      return var2;
   }

   private com.aspose.slides.internal.o9b.l6 u3(Shape var1) {
      com.aspose.slides.internal.o9b.l6 var2 = this.n5();
      z1 var3 = z1.n5(var2);
      com.aspose.slides.internal.x4g.x8 var4 = new com.aspose.slides.internal.x4g.x8(this.n5, null, false);
      var4.n5(var3);
      var3.l6(this.k5, this.k5(var1));
      return var2;
   }

   protected y1 k5(Shape var1) {
      Rectangle2D var2 = var1.getBounds2D();
      y1 var3 = new y1((float)var2.getX(), (float)var2.getY(), (float)var2.getWidth(), (float)var2.getHeight());
      var3.n5(1.0F, 1.0F);
      return var3;
   }
}
