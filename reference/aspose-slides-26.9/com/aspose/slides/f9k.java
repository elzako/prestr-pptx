package com.aspose.slides;

class f9k extends com.aspose.slides.internal.v6g.h0<f9k> {
   long n5;
   long l6;
   long k5;
   long u3;

   public f9k() {
   }

   @Override
   public boolean equals(Object obj) {
      Object[] var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Object[].class);
      if (var2 != null && var2.length == 3) {
         s4e var3 = new s4e();
         var3.n5 = com.aspose.slides.internal.v6g.k5.u3(var2[1], boolean.class) ? i7t.k5 : i7t.l6;
         var3.l6 = var2[2];
         long var4 = 9668980647L;
         long var6 = 12160060526L;
         long var8 = 8555088816L;
         long var10 = 11312374243L;
         var3.k5 = var3.hashCode() ^ 9668980647L ^ 12160060526L ^ 8555088816L ^ 11312374243L;
         Object var12 = var2[0];
         if (com.aspose.slides.internal.v6g.k5.l6(var12, Presentation.class)) {
            ((Presentation)var12).n5(var3);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var12, LoadOptions.class)) {
            ((LoadOptions)var12).n5(var3);
         }
      }

      return super.equals(obj);
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   f9k(Long var1, Long var2, Long var3, Long var4) {
      if (var1 == null && var2 == null && var3 == null && var4 == null) {
         var1 = 9937416103L;
         var2 = 12160126062L;
         var3 = 8555092912L;
         var4 = 11312394723L;
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public void n5(f9k var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public f9k n5() {
      f9k var1 = new f9k();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f9k Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f9k bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
