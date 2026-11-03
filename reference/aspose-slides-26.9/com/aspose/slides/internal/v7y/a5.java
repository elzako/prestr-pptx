package com.aspose.slides.internal.v7y;

public final class a5 extends v3 {
   private j9 n5 = null;
   private int l6;

   public a5(int var1, j9 var2) {
      this.n5 = var2;
      this.l6 = var1;
   }

   private a5(a5 var1) {
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

   public static double n5(boolean var0) {
      return var0 ? 1.0 : 0.0;
   }

   public static double n5(String var0) {
      return com.aspose.slides.ms.System.Xml.f4.n5((Object)var0);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      switch (this.l6) {
         case 9:
            return this.k5(var1);
         case 23:
            return this.u3(var1);
         case 24:
            return this.a6(var1);
         case 25:
            return this.u9(var1);
         case 26:
            return this.h0(var1);
         default:
            return null;
      }
   }

   private double k5(com.aspose.slides.internal.x6s.h0 var1) {
      if (this.n5 == null) {
         return com.aspose.slides.ms.System.Xml.f4.n5((Object)var1.k5().c8());
      }

      Object var2 = this.n5.n5(var1);
      switch (this.n5(var2)) {
         case 0:
            return com.aspose.slides.internal.v6g.k5.u3(var2, double.class);
         case 1:
            return n5((String)var2);
         case 2:
            return n5(((Boolean)com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class)).booleanValue());
         case 3:
            com.aspose.slides.internal.x6s.a6 var3 = this.n5.h0();
            if (var3 != null) {
               return n5(var3.c8());
            }
         default:
            return Double.NaN;
         case 4:
            return n5(((com.aspose.slides.internal.x6s.a6)var2).c8());
      }
   }

   private double u3(com.aspose.slides.internal.x6s.h0 var1) {
      double var2 = 0.0;
      this.n5.n5(var1);

      com.aspose.slides.internal.x6s.a6 var4;
      while ((var4 = this.n5.h0()) != null) {
         var2 += n5(var4.c8());
      }

      return var2;
   }

   private double a6(com.aspose.slides.internal.x6s.h0 var1) {
      return com.aspose.slides.ms.System.q1.k5(com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(var1), double.class));
   }

   private double u9(com.aspose.slides.internal.x6s.h0 var1) {
      return com.aspose.slides.ms.System.q1.l6(com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(var1), double.class));
   }

   private double h0(com.aspose.slides.internal.x6s.h0 var1) {
      double var2 = com.aspose.slides.ms.System.Xml.f4.n5(this.n5.n5(var1));
      return com.aspose.slides.ms.System.Xml.f4.l6(var2);
   }

   @Override
   public int u9() {
      return 0;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new a5(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
