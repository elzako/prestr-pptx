package com.aspose.slides.internal.x4g;

import com.aspose.slides.ms.System.IDisposable;

public class l6 extends u9 implements IDisposable {
   private boolean s7;
   private float x8;
   private float n3;
   private float y4;

   l6(u9 var1) {
      com.aspose.slides.internal.x4g.u9.n5(var1, this);
      if (var1 instanceof l6) {
         l6 var2 = (l6)var1;
         this.k5(var2.u3());
         this.n5(var2.n5());
         this.n5(var2.l6());
         this.l6(var2.k5());
      }
   }

   public l6(float var1, float var2) {
      this(var1, var2, true);
   }

   public l6(float var1, float var2, boolean var3) {
      this.a6();
      this.y4 = var1;
      this.x8 = var2;
      this.s7 = var3;
      this.e2();
      this.t9();
   }

   private void e2() {
      this.l6 = this.x8 / this.y4;
   }

   public float n5() {
      return this.x8;
   }

   public void n5(float var1) {
      if (var1 != this.x8) {
         this.x8 = var1;
         this.e2();
         this.t9();
      }
   }

   public boolean l6() {
      return this.s7;
   }

   public void n5(boolean var1) {
      this.s7 = var1;
   }

   public float k5() {
      return this.n3;
   }

   public void l6(float var1) {
      if (var1 != this.n3) {
         this.n3 = var1;
         this.t9();
      }
   }

   public float u3() {
      return this.y4;
   }

   public void k5(float var1) {
      if (var1 != this.y4) {
         this.y4 = var1;
         this.e2();
         this.t9();
      }
   }

   void a6() {
      this.s7();
      this.n5 = 3;
      this.l6 = 1.0F;
      this.u3 = 1.0F;
      this.s7 = true;
      this.n3 = 0.0F;
      this.y4 = 0.0F;
      this.x8 = 0.0F;
   }

   @Override
   public Object deepClone() {
      l6 var1 = new l6(this.y4, this.x8, this.s7);
      com.aspose.slides.internal.x4g.u9.n5(this, var1);
      var1.n3 = this.n3;
      return var1;
   }

   private void t9() {
      if (this.s7) {
         this.u9 = this.z1();
      } else {
         this.h0 = this.t4();
      }
   }

   private s7 z1() {
      float var1 = this.y4 * 0.5F;
      float var2 = this.x8;
      float var3 = this.n3;
      s7 var4 = new s7();
      var4.l6(-var1, -var2, 0.0F, 0.0F);
      var4.l6(0.0F, 0.0F, var1, -var2);
      if (var3 != 0.0F) {
         var4.l6(var1, -var2, 0.0F, -var2 + var3);
      }

      var4.n3();
      return var4;
   }

   private s7 t4() {
      float var1 = this.y4 * 0.5F;
      float var2 = this.x8;
      s7 var3 = new s7();
      var3.l6(-var1, -var2, 0.0F, 0.0F);
      var3.l6(0.0F, 0.0F, var1, -var2);
      return var3;
   }
}
