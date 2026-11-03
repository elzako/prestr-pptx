package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;

public class s7 extends l6 {
   protected int t2;
   protected int s7;
   private boolean c8;
   private boolean n3;
   private boolean y4;
   private boolean e2;
   protected List<l6> x8 = null;

   @Override
   public void n5(l6 var1) {
      if (this.x8 == null) {
         this.x8 = new List<>();
      }

      var1.l6(this);
      this.x8.addItem(var1);
   }

   public void l6(t2 var1) {
      this.n5(var1);
   }

   public final List<l6> c4() {
      return this.x8;
   }

   public boolean y2() {
      return this.x8 == null || this.x8.size() == 0;
   }

   public final void n5(int var1, boolean var2, boolean var3) {
      this.t2 = var1;
      this.c8 = var2;
      this.n3 = var3;
   }

   public final void l6(int var1, boolean var2, boolean var3) {
      this.s7 = var1;
      this.y4 = var2;
      this.e2 = var3;
   }

   public final int y1() {
      return this.t2;
   }

   public final boolean a0() {
      return this.y4;
   }

   public final boolean d2() {
      return this.e2;
   }

   public final int d5() {
      return this.s7;
   }

   public final boolean s3() {
      return this.c8;
   }

   public final boolean p8() {
      return this.n3;
   }
}
