package com.aspose.slides.internal.g7;

public class e3 extends z1 {
   private w3 a6;

   public e3(u7 var1) {
      super(var1, null);
      super.n5(new z1[]{new p4(var1, this, true, true)});
      super.l6 = new byte[0][];
      super.n5 = new byte[0][];
   }

   public final w3 n5() {
      return this.a6;
   }

   public final void n5(w3 var1) {
      this.a6 = var1;
   }

   @Override
   public void k5() {
      this.n5(new w3());
      super.k5();
   }

   @Override
   public void n5(Object var1) {
      p4 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, p4.class);
      if (var2 != null) {
         this.n5().n5(var2.n5());
      }

      super.n5(var1);
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }
}
