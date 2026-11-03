package com.aspose.slides.internal.x1j;

import java.awt.geom.GeneralPath;

class t2 implements h0 {
   // $VF: synthetic field
   final GeneralPath n5;
   // $VF: synthetic field
   final c8 l6;

   t2(c8 var1, GeneralPath var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(float var1, float var2) {
      this.n5.moveTo(var1, var2);
   }

   @Override
   public void l6(float var1, float var2) {
      this.n5.lineTo(var1, var2);
   }

   @Override
   public void n5() {
      this.n5.closePath();
   }

   @Override
   public void l6() {
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5.curveTo(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.n5.quadTo(var1, var2, var3, var4);
   }
}
