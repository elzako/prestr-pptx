package com.aspose.slides.internal.i4;

import com.aspose.slides.exceptions.ArgumentException;

public class f5 {
   public final i1 n5;

   public final j9 n5() {
      return this.n5.u3();
   }

   public static u5 n5(String var0) {
      u5 var1 = null;
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         com.aspose.slides.internal.q2.n5 var2 = new com.aspose.slides.internal.q2.n5(new com.aspose.slides.internal.n5.k5(var0));
         com.aspose.slides.internal.q2.l6 var3 = new com.aspose.slides.internal.q2.l6(new com.aspose.slides.internal.n5.s7(var2));

         try {
            var1 = var3.w8().k5;
         } catch (com.aspose.slides.internal.n5.w1 var5) {
            throw new j3(var5.getMessage());
         }

         if (var3.h0() != null && var3.h0().size() > 0) {
            throw new j3(com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.p8.k5(), var3.h0().toArray(new String[0])));
         }
      }

      return var1;
   }

   private g7 n5(u5 var1) {
      this.n5.n5(var1);
      return this.n5.t2();
   }

   public final g7 l6(String var1) {
      if (var1 == null) {
         throw new ArgumentException("Script can't be null", "script");
      }

      try {
         u5 var2 = n5(var1);
         return this.n5(var2);
      } catch (n1 var5) {
         s3 var3 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(), s3.class);
         String var4;
         if (var3 != null) {
            var4 = var3.C_().toString();
         } else {
            var4 = var5.getMessage();
         }

         throw new j3(this.k5(var4), var5);
      } catch (RuntimeException var6) {
         throw new j3(this.k5(var6.getMessage()), var6);
      }
   }

   private String k5(String var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

      while (this.n5.n5().size() > 0) {
         var2.l6(this.n5.n5().pop());
      }

      if (var2.l6() > 0) {
         var2.n5(0, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.p8.k5(), "------ Stack Trace:", com.aspose.slides.ms.System.p8.k5()}));
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var1, com.aspose.slides.ms.System.p8.k5()}) + var2;
   }

   private f5(int var1) {
      this.n5 = new i1(var1);
   }

   public f5() {
      this(5);
   }

   public final void n5(com.aspose.slides.internal.q3.k5 var1) {
      this.n5().n5(var1);
   }
}
