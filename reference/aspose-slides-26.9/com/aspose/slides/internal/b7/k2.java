package com.aspose.slides.internal.b7;

public abstract class k2 extends n9 {
   private final n8 n5 = new n8();
   private final int l6;
   private boolean k5;
   private int u3;
   private v5 a6;

   protected k2(int var1) {
      this.l6 = var1;
      this.k5 = true;
      this.u3 = 0;
   }

   public n8 l6() {
      return this.n5;
   }

   public boolean k5() {
      return this.k5;
   }

   public void n5(boolean var1) {
      this.k5 = var1;
   }

   public int u3() {
      return this.u3;
   }

   public void n5(int var1) {
      this.u3 = var1;
   }

   public v5 a6() {
      return this.a6;
   }

   public void n5(v5 var1) {
      this.a6 = var1;
   }

   protected void n5(k2 var1) {
      var1.l6().l6();

      for (int var2 = 0; var2 < this.l6().n5(); var2++) {
         var1.l6().n5(this.l6().n5(var2).k5());
      }

      var1.n5(this.k5());
      var1.n5(this.u3());
      var1.n5(this.a6() != null ? this.a6().a6() : null);
   }
}
