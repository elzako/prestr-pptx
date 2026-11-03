package com.aspose.slides.internal.v7y;

public final class u8 extends v3 {
   private j9 n5;
   private int l6;

   public u8(int var1, j9 var2) {
      this.n5 = var2;
      this.l6 = var1;
   }

   private u8(u8 var1) {
      super(var1);
      this.n5 = n5(var1.n5);
      this.l6 = var1.l6;
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      if (this.n5 != null) {
         this.n5.n5(var1);
      }
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      switch (this.l6) {
         case 8:
            return this.k5(var1);
         case 9:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         default:
            return false;
         case 10:
            return true;
         case 11:
            return false;
         case 12:
            return this.u3(var1);
         case 22:
            return this.a6(var1);
      }
   }

   public static boolean n5(double var0) {
      return var0 != 0.0 && !com.aspose.slides.ms.System.d2.k5(var0);
   }

   public static boolean n5(String var0) {
      return var0.length() > 0;
   }

   public final boolean k5(com.aspose.slides.internal.x6s.h0 var1) {
      Object var2 = this.n5.n5(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.x6s.h0.class)) {
         return this.n5.h0() != null;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, String.class)) {
         return n5((String)var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, Double.class)) {
         return n5(((Double)com.aspose.slides.internal.v6g.k5.u3(var2, double.class)).doubleValue());
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var2, Boolean.class) ? com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class) : true;
      }
   }

   @Override
   public int u9() {
      return 2;
   }

   private boolean u3(com.aspose.slides.internal.x6s.h0 var1) {
      return !com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(var1), boolean.class);
   }

   private boolean a6(com.aspose.slides.internal.x6s.h0 var1) {
      String var2 = this.n5.n5(var1).toString();
      String var3 = var1.k5().x8();
      return com.aspose.slides.ms.System.d1.n5(var3, var2, (short)5) && (var3.length() == var2.length() || var3.charAt(var2.length()) == '-');
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new u8(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
