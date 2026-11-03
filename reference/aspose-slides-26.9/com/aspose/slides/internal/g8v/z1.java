package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.InvalidOperationException;

class z1 {
   static com.aspose.slides.internal.o8m.i9 n5 = com.aspose.slides.internal.o8m.i9.n5();
   private com.aspose.slides.ms.System.j5 l6 = new com.aspose.slides.ms.System.j5();
   private int k5 = 1;
   private com.aspose.slides.internal.o8m.f2 u3;
   private t9 a6;
   private String u9;

   public z1() {
      com.aspose.slides.ms.System.j5.s7().u3(this.l6);
   }

   public String n5() {
      return this.a6.u3();
   }

   public String l6() {
      return this.a6.n5();
   }

   public String k5() {
      return this.a6.k5();
   }

   public String u3() {
      return this.a6.l6();
   }

   public String a6() {
      return this.a6.a6();
   }

   public String u9() {
      if (this.u9 == null) {
         byte[] var1 = new byte[15];
         n5.n5(var1);
         this.u9 = com.aspose.slides.ms.System.z3.n5(var1);
         com.aspose.slides.ms.System.u3.n5(var1, 0, var1.length);
      }

      return this.u9;
   }

   public boolean n5(String var1) {
      this.a6 = new t9(var1);
      if (!this.a6.u9()) {
         return false;
      }

      if (this.a6.u3() == null || com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.t2(this.a6.u3()), "MD5")) {
         this.u3 = com.aspose.slides.internal.o8m.z7.a6();
      }

      return true;
   }

   private String l6(String var1) {
      if (this.u3 == null) {
         return null;
      }

      this.u3.t2();
      byte[] var2 = this.u3.l6(com.aspose.slides.internal.l7h.j5.e2().u3(var1));
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      for (byte var7 : var2) {
         var3.n5(com.aspose.slides.ms.System.e2.n5(var7, "x2"));
      }

      return var3.toString();
   }

   private String n5(String var1, String var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5("{0}:{1}:{2}",new Object[]{ var1, this.l6(), var2});
      if (this.n5() != null && "md5-sess".equals(com.aspose.slides.ms.System.d1.u9(this.n5()))) {
         var3 = com.aspose.slides.ms.System.d1.n5("{0}:{1}:{2}",new Object[]{ this.l6(var3), this.k5(), this.u9()});
      }

      return this.l6(var3);
   }

   private String n5(w1 var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ var1.n3(), var1.e2().n3()});
      if ("auth-int".equals(this.a6())) {
      }

      return this.l6(var2);
   }

   private String n5(String var1, String var2, w1 var3) {
      String var4 = com.aspose.slides.ms.System.d1.n5("{0}:{1}:",new Object[]{ this.n5(var1, var2), this.k5()});
      if (this.a6() != null) {
         var4 = com.aspose.slides.ms.System.d1.n5(
            var4, com.aspose.slides.ms.System.d1.n5("{0}:{1}:{2}:",new Object[]{ com.aspose.slides.ms.System.a3.n5(this.k5, "X8"), this.u9(), this.a6()})
         );
      }

      var4 = com.aspose.slides.ms.System.d1.n5(var4, this.n5(var3));
      return this.l6(var4);
   }

   public l6 n5(b5 var1, f2 var2) {
      if (this.a6 == null) {
         throw new InvalidOperationException();
      }

      w1 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, w1.class);
      if (var3 == null) {
         return null;
      }

      com.aspose.slides.ms.System.j5.s7().u3(this.l6);
      a5 var4 = var2.n5(var3.e2(), "digest");
      if (var4 == null) {
         return null;
      }

      String var5 = var4.l6();
      if (var5 != null && !"".equals(var5)) {
         String var6 = var4.k5();
         com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5();
         var7.n5("Digest username=\"{0}\", ",new Object[]{ var5});
         var7.n5("realm=\"{0}\", ",new Object[]{ this.l6()});
         var7.n5("nonce=\"{0}\", ",new Object[]{ this.k5()});
         var7.n5("uri=\"{0}\", ",new Object[]{ var3.n5().n3()});
         if (this.n5() != null) {
            var7.n5("algorithm=\"{0}\", ",new Object[]{ this.n5()});
         }

         var7.n5("response=\"{0}\", ",new Object[]{ this.n5(var5, var6, var3)});
         if (this.a6() != null) {
            var7.n5("qop=\"{0}\", ",new Object[]{ this.a6()});
         }

         synchronized (this) {
            if (this.a6() != null) {
               var7.n5("nc={0:X8}, ",new Object[]{ com.aspose.slides.internal.v6g.k5.l6(this.k5)});
               this.k5++;
            }
         }

         if (this.u9() != null) {
            var7.n5("cnonce=\"{0}\", ",new Object[]{ this.u9()});
         }

         if (this.u3() != null) {
            var7.n5("opaque=\"{0}\", ",new Object[]{ this.u3()});
         }

         var7.n5(var7.l6() - 2);
         return new l6(var7.toString());
      } else {
         return null;
      }
   }

   public com.aspose.slides.ms.System.j5 h0() {
      return this.l6;
   }
}
