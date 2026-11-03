package com.aspose.slides.internal.t9z;

import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class n5 implements k5 {
   private GeneralPath n5 = new GeneralPath();

   @Override
   public void n5(float var1, float var2) {
      this.n5.moveTo(var1, var2);
   }

   @Override
   public void l6(float var1, float var2) {
      this.n5.lineTo(var1, var2);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.n5.quadTo(var1, var2, var3, var4);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5.curveTo(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void n5() {
      if (this.n5.getCurrentPoint() != null) {
         this.n5.closePath();
      }
   }

   @Override
   public void l6() {
   }

   public Shape k5() {
      return this.n5;
   }
}
