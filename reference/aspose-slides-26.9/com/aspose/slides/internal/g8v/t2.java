package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

@com.aspose.slides.ms.System.j3
public class t2 {
   private int n5;
   private int l6;
   private int k5;
   private c8 u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "path", "$path", "domain", "$domain", "expires", "$expires", "httponly", "secure"
   );

   private void n5(h0 var1) {
      if (var1.u3().length() == 0) {
         throw new ArgumentException("Cookie domain not set.", "cookie.Domain");
      }

      if (var1.t9().length() > this.k5) {
         throw new s7("value is larger than MaxCookieSize.");
      }

      if (var1.z1() == 1 && var1.u3().charAt(0) != '.') {
         throw new s7(com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid cookie domain: ", var1.u3()}));
      }

      if (var1.a6() && !n5(var1.u3())) {
         throw new s7(com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid cookie domain: ", var1.u3()}));
      }

      if (this.u3 == null) {
         this.u3 = new c8();
      }

      if (this.u3.size() >= this.n5) {
         this.k5(null);
      }

      if (this.u3.size() >= this.l6 && this.l6(var1.u3()) >= this.l6) {
         this.k5(var1.u3());
      }

      h0 var2 = new h0(var1.t2(), var1.t9());
      var2.u3(var1.s7());
      var2.l6(var1.u3());
      var2.l6(var1.a6());
      var2.n5(var1.z1());
      var2.n5(var1.h0().m3());
      var2.n5(var1.l6());
      var2.n5(var1.n5());
      var2.n5(var1.k5());
      var2.k5(var1.c8());
      var2.u3(var1.y4());
      this.u3.n5(var2);
      this.n5();
   }

   private int l6(String var1) {
      int var2 = 0;

      for (Object recoveredElement$var4$1724 : this.u3) {
         h0 var4 = (h0)recoveredElement$var4$1724;
         if (n5(var1, var4.u3(), true)) {
            var2++;
         }
      }

      return var2;
   }

   private void k5(String var1) {
      int var2 = 0;
      com.aspose.slides.ms.System.j5 var3 = com.aspose.slides.ms.System.j5.k5.m3();

      for (int var4 = 0; var4 < this.u3.size(); var4++) {
         h0 var5 = this.u3.n5(var4);
         if (com.aspose.slides.ms.System.j5.k5(var5.e2(), var3) && (var1 == null || com.aspose.slides.ms.System.d1.a6(var1, var5.u3()))) {
            var5.e2().u3(var3);
            var2 = var4;
         }
      }

      this.u3.n5().removeAt(var2);
   }

   private void n5() {
      if (this.u3 != null) {
         for (int var1 = this.u3.size() - 1; var1 >= 0; var1--) {
            h0 var2 = this.u3.n5(var1);
            if (var2.u9()) {
               this.u3.n5().removeAt(var1);
            }
         }
      }
   }

   private void l6(com.aspose.slides.ms.System.r8 var1, h0 var2) {
      if (com.aspose.slides.ms.System.d1.n5(var2.t2())) {
         throw new s7("Invalid cookie: name");
      }

      if (var2.t9() == null) {
         throw new s7("Invalid cookie: value");
      }

      if (var1 != null) {
         if (var2.u3().length() == 0) {
            var2.l6(var1.a6());
            var2.l6(false);
         } else if (var2.a6() && !n5(var1, var2.u3())) {
            throw new s7(com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid cookie domain: ", var2.u3()}));
         }
      }

      if (var2.z1() == 0 && com.aspose.slides.ms.System.d1.n5(var2.s7())) {
         if (var1 != null) {
            var2.u3(var1.n5());
         } else {
            var2.u3("/");
         }
      }

      if (var2.z1() == 1 && var2.x8().length() == 0 && var1 != null && !var1.h0()) {
         var2.n5(new int[]{var1.y4()});
      }
   }

   public void n5(com.aspose.slides.ms.System.r8 var1, h0 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("uri");
      }

      if (var2 == null) {
         throw new ArgumentNullException("cookie");
      }

      if (!var2.u9()) {
         this.l6(var1, var2);
         this.n5(var2);
      }
   }

   public String n5(com.aspose.slides.ms.System.r8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("uri");
      }

      c8 var2 = this.l6(var1);
      if (var2.size() == 0) {
         return "";
      }

      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      for (Object recoveredElement$var5$4186 : var2) {
         h0 var5 = (h0)recoveredElement$var5$4186;
         var3.n5(var5.l6(var1));
         var3.n5("; ");
      }

      if (var3.l6() > 0) {
         var3.n5(var3.l6() - 2);
      }

      return var3.toString();
   }

   static boolean n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return true;
      }

      i1 var1 = null;
      i1[] var2 = new i1[]{var1};
      boolean var3 = i1.n5(var0, var2);
      var1 = var2[0];
      if (var3) {
         return var0.charAt(0) != '.';
      }

      if (var0.charAt(0) == '.') {
         var0 = com.aspose.slides.ms.System.d1.k5(var0, 1);
      }

      if (com.aspose.slides.ms.System.d1.u3(var0, "localhost", (short)3)) {
         return true;
      }

      String[] var4 = com.aspose.slides.ms.System.d1.n5(var0, '.');
      return com.aspose.slides.ms.System.u3.n5((Object)(var4)).a6() >= 2;
   }

   static boolean n5(com.aspose.slides.ms.System.r8 var0, String var1) {
      if (!n5(var1)) {
         return false;
      }

      i1 var2 = null;
      i1[] var3 = new i1[]{var2};
      boolean var4 = i1.n5(var1, var3);
      var2 = var3[0];
      if (var4) {
         if (var1.charAt(0) == '.') {
            return false;
         }

         for (i1 var8 : t4.k5(var0.q0())) {
            if (var2.equals(var8)) {
               return true;
            }
         }

         return false;
      } else {
         return n5(var1, var0.a6(), false);
      }
   }

   static boolean n5(String var0, String var1, boolean var2) {
      if (var0.length() == 0) {
         return false;
      }

      String var3 = var0.charAt(0) == '.' ? com.aspose.slides.ms.System.d1.k5(var0, 1) : var0;
      if (var2) {
         return com.aspose.slides.ms.System.d1.a6(var1, var3, (short)3) == 0;
      }

      if (!com.aspose.slides.ms.System.d1.l6(var1, var3, (short)3)) {
         return false;
      }

      int var4 = var1.length() - var3.length() - 1;
      return var4 < 0 ? true : var1.charAt(var4) == '.';
   }

   static boolean n5(String var0, String var1) {
      if (var0.length() == 0) {
         return false;
      }

      String var2 = var0.charAt(0) == '.' ? com.aspose.slides.ms.System.d1.k5(var0, 1) : var0;
      return com.aspose.slides.ms.System.d1.a6(var1, var2, (short)3) == 0;
   }

   public c8 l6(com.aspose.slides.ms.System.r8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("uri");
      }

      this.n5();
      c8 var2 = new c8();
      if (this.u3 == null) {
         return var2;
      }

      for (Object recoveredElement$var4$6685 : this.u3) {
         h0 var4 = (h0)recoveredElement$var4$6685;
         String var5 = var4.u3();
         if ((var4.z1() == 1 ? n5(var5, var1.a6()) : n5(var5, var1.a6(), !var4.a6()))
            && (
               var4.x8().length() <= 0
                  || var4.n3() == null
                  || var1.y4() == -1
                  || com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var4.n3())), var1.y4()) != -1
            )) {
            String var6 = var4.s7();
            String var7 = var1.n5();
            if ((
                  "".equals(var6)
                     || "/".equals(var6)
                     || com.aspose.slides.ms.System.d1.a6(var7, var6)
                     || com.aspose.slides.ms.System.d1.l6(var7, var6)
                        && (var6.charAt(var6.length() - 1) == '/' || var7.length() <= var6.length() || var7.charAt(var6.length()) == '/')
               )
               && (!var4.y4() || "https".equals(var1.t9()))) {
               var2.n5(var4);
            }
         }
      }

      var2.l6();
      return var2;
   }
}
