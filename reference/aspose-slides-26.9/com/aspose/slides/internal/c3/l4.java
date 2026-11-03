package com.aspose.slides.internal.c3;

public class l4 {
   private j3 n5;
   private com.aspose.slides.internal.j3.s7 l6;
   private com.aspose.slides.internal.i6.d1 k5;
   private com.aspose.slides.internal.l7h.a5 u3 = new com.aspose.slides.internal.l7h.a5();
   private y8 a6;
   private boolean u9 = false;
   private n5 h0;
   private a6 c8;
   private h0 t2;
   private com.aspose.slides.internal.l7h.a5 s7;
   private h6 x8;
   private boolean n3 = true;

   public l4(com.aspose.slides.internal.p6.l6 var1, com.aspose.slides.internal.j3.s7 var2) {
      this.n5 = new j3(var1);
      this.k5 = com.aspose.slides.internal.i6.d1.n5;
      this.l6 = var2;
   }

   public final y8 n5() {
      if (!this.n3) {
         this.l6("Self closing flag is not acknowledged.");
         this.n3 = true;
      }

      while (!this.u9) {
         this.k5.n5(this, this.n5);
      }

      if (this.u3.l6() > 0) {
         u3 var1 = new u3(this.u3.toString());
         this.u3.l6(0, this.u3.l6());
         return var1;
      } else {
         this.u9 = false;
         return this.a6;
      }
   }

   public final void l6() {
      this.n5.c8();
      this.k5.n5(this, this.n5);
   }

   public final void n5(y8 var1) {
      this.a6 = var1;
      this.u9 = true;
      if (var1.u9() == 0) {
         h6 var2 = (h6)var1;
         this.x8 = var2;
         if (var2.l6()) {
            this.n3 = false;
         }
      } else if (var1.u9() == 1) {
         s7 var3 = (s7)var1;
      }
   }

   public final void n5(String var1) {
      this.u3.n5(var1);
   }

   public final void n5(char[] var1) {
      this.u3.n5(var1);
   }

   public final void n5(char var1) {
      this.u3.n5(var1);
   }

   public final n5 n5(boolean var1) {
      if (var1) {
         this.h0 = new h6();
      } else {
         this.h0 = new s7();
      }

      return this.h0;
   }

   public final void k5() {
      this.h0.n5(this.l6);
      this.n5(this.h0);
   }

   public final void u3() {
      this.c8 = new a6();
   }

   public final void a6() {
      this.n5(this.c8);
   }

   public final void u9() {
      this.t2 = new h0();
   }

   public final void h0() {
      this.n5(this.t2);
   }

   public final void c8() {
      this.s7 = new com.aspose.slides.internal.l7h.a5();
   }

   public final n5 t2() {
      return this.h0;
   }

   public final a6 s7() {
      return this.c8;
   }

   public final h0 x8() {
      return this.t2;
   }

   public final com.aspose.slides.internal.l7h.a5 n3() {
      return this.s7;
   }

   public final j3 y4() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.i6.d1 var1) {
      this.k5 = var1;
   }

   public final char[] n5(com.aspose.slides.ms.System.o5<Character> var1, boolean var2) {
      if (this.n5.k5()) {
         return null;
      }

      if (com.aspose.slides.ms.System.o5.l6(var1, null) && com.aspose.slides.ms.System.o5.n5(var1, new com.aspose.slides.ms.System.o5<>(this.n5.l6()))) {
         return null;
      }

      if (this.n5.k5('\t', '\n', '\r', '\f', ' ', '<', '&')) {
         return null;
      }

      this.n5.x8();
      if (this.n5.k5("#", true)) {
         boolean var9 = this.n5.u9("X");
         String var10 = var9 ? this.n5.y4() : this.n5.e2();
         if (var10.length() == 0) {
            this.u3("numeric reference with no numerals");
            this.n5.n3();
            return null;
         }

         if (!this.n5.u3(";")) {
            this.u3("missing semicolon");
         }

         int var12 = 0;
         int var14 = var9 ? 515 : 111;
         int[] var15 = new int[]{0};
         boolean var8 = !com.aspose.slides.ms.System.a3.n5(var10, var14, com.aspose.slides.internal.f5.c8.l6, var15)
            || var15[0] >= 55296 && var15[0] <= 57343
            || var15[0] > 1114111;
         var12 = var15[0];
         if (var8) {
            this.u3("character outside of valid range");
            return new char[]{'�'};
         } else {
            return new char[]{(char)var12};
         }
      } else {
         String var3 = this.n5.t9();
         boolean var4 = this.n5.n5(';');
         char[] var5 = null;
         char[][] var6 = new char[][]{(char[])var5};
         boolean var7 = com.aspose.slides.internal.c3.x8.n5(var3, var6);
         var5 = var6[0];
         if (!var7) {
            this.n5.n3();
            if (var4) {
               this.u3(com.aspose.slides.ms.System.d1.n5("invalid named referenece '{0}'", new Object[]{var3}));
            }

            return null;
         } else if (!var2 || !this.n5.z1() && !this.n5.t4() && !this.n5.k5('=', '-', '_')) {
            if (!this.n5.u3(";")) {
               this.u3("missing semicolon");
            }

            return (char[])var5;
         } else {
            this.n5.n3();
            return null;
         }
      }
   }

   public final void l6(String var1) {
      if (this.l6 != null) {
         this.l6
            .n5(
               new com.aspose.slides.internal.f5.t2(
                  (byte)1, var1, "", null, null, new com.aspose.slides.internal.f5.y4(-1L, -1L, this.n5.n5(), -1L, null, null)
               )
            );
      }
   }

   public final void l6(com.aspose.slides.internal.i6.d1 var1) {
      if (this.l6 != null) {
         this.l6
            .n5(
               new com.aspose.slides.internal.f5.t2(
                  (byte)2,
                  com.aspose.slides.ms.System.d1.n5("Unexpected character '{0}' in input state [{1}]", this.n5.n5(), var1),
                  "",
                  null,
                  null,
                  new com.aspose.slides.internal.f5.y4(-1L, -1L, this.n5.n5(), -1L, null, null)
               )
            );
      }
   }

   private void u3(String var1) {
      if (this.l6 != null) {
         this.l6
            .n5(
               new com.aspose.slides.internal.f5.t2(
                  (byte)2,
                  com.aspose.slides.ms.System.d1.n5("Invalid character reference: {0}", new Object[]{var1}),
                  "",
                  null,
                  null,
                  new com.aspose.slides.internal.f5.y4(-1L, -1L, this.n5.n5(), -1L, null, null)
               )
            );
      }
   }

   public final boolean e2() {
      return this.x8 == null ? false : com.aspose.slides.ms.System.d1.a6(this.h0.n5(), this.x8.n5());
   }

   public final void t9() {
      this.n3 = true;
   }

   public final void z1() {
      this.n5.a6();
   }

   public final void t4() {
      this.n5.u9();
   }

   public final void k5(String var1) {
      this.n5.n5(var1);
   }
}
