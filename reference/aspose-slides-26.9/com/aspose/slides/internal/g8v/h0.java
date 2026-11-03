package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.exceptions.Exception;

@com.aspose.slides.ms.System.j3
public final class h0 {
   private String u3;
   private com.aspose.slides.ms.System.r8 a6;
   private boolean u9;
   private String h0;
   private com.aspose.slides.ms.System.j5 c8 = new com.aspose.slides.ms.System.j5();
   private boolean t2;
   private String s7;
   private String x8;
   private String n3;
   private int[] y4;
   private boolean e2;
   private com.aspose.slides.ms.System.j5 t9 = new com.aspose.slides.ms.System.j5();
   private String z1;
   private int t4;
   static char[] n5 = new char[]{' ', '=', ';', ',', '\n', '\r', '\t'};
   static char[] l6 = new char[]{'"', ','};
   static String k5 = "()<>@,;:\\\"/[]?={} \t";
   private boolean q0;

   public h0() {
      com.aspose.slides.ms.System.j5.l6.u3(this.c8);
      com.aspose.slides.ms.System.j5.s7().u3(this.t9);
      this.h0 = com.aspose.slides.ms.System.d1.n5;
      this.s7 = com.aspose.slides.ms.System.d1.n5;
      this.z1 = com.aspose.slides.ms.System.d1.n5;
      this.u3 = com.aspose.slides.ms.System.d1.n5;
      this.n3 = com.aspose.slides.ms.System.d1.n5;
   }

   public h0(String var1, String var2) {
      this();
      this.k5(var1);
      this.u9(var2);
   }

   public String n5() {
      return this.u3;
   }

   public void n5(String var1) {
      this.u3 = var1 == null ? com.aspose.slides.ms.System.d1.n5 : var1;
   }

   public com.aspose.slides.ms.System.r8 l6() {
      return this.a6;
   }

   public void n5(com.aspose.slides.ms.System.r8 var1) {
      this.a6 = var1;
   }

   public boolean k5() {
      return this.u9;
   }

   public void n5(boolean var1) {
      this.u9 = var1;
   }

   public String u3() {
      return this.h0;
   }

   public void l6(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         this.h0 = com.aspose.slides.ms.System.d1.n5;
         this.l6(false);
      } else {
         this.h0 = var1;
         i1 var2 = null;
         i1[] var3 = new i1[]{var2};
         boolean var4 = i1.n5(var1, var3);
         var2 = var3[0];
         if (var4) {
            this.l6(false);
         } else {
            this.l6(true);
         }
      }
   }

   boolean a6() {
      return this.q0;
   }

   void l6(boolean var1) {
      this.q0 = var1;
   }

   public boolean u9() {
      return com.aspose.slides.ms.System.j5.u3(this.c8, com.aspose.slides.ms.System.j5.s7())
         && com.aspose.slides.ms.System.j5.c8(this.c8, com.aspose.slides.ms.System.j5.l6);
   }

   public com.aspose.slides.ms.System.j5 h0() {
      return this.c8;
   }

   public void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.c8);
   }

   public boolean c8() {
      return this.t2;
   }

   public void k5(boolean var1) {
      this.t2 = var1;
   }

   public String t2() {
      return this.s7;
   }

   public void k5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new s7("Name cannot be empty");
      }

      if (var1.charAt(0) != '$' && com.aspose.slides.ms.System.d1.n5(var1, n5) == -1) {
         this.s7 = var1;
      } else {
         this.s7 = com.aspose.slides.ms.System.d1.n5;
         throw new s7("Name contains invalid characters");
      }
   }

   public String s7() {
      return this.x8 == null ? com.aspose.slides.ms.System.d1.n5 : this.x8;
   }

   public void u3(String var1) {
      this.x8 = var1 == null ? com.aspose.slides.ms.System.d1.n5 : var1;
   }

   public String x8() {
      return this.n3;
   }

   public void a6(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         this.n3 = com.aspose.slides.ms.System.d1.n5;
      } else if (var1.charAt(0) == '"' && var1.charAt(var1.length() - 1) == '"') {
         this.n3 = var1;
         String[] var2 = com.aspose.slides.ms.System.d1.u9(this.n3, l6);
         this.y4 = new int[com.aspose.slides.ms.System.u3.n5((Object)(var2)).a6()];

         for (int var3 = 0; var3 < com.aspose.slides.ms.System.u3.n5((Object)(this.y4)).a6(); var3++) {
            this.y4[var3] = Integer.MIN_VALUE;
            if (var2[var3].length() != 0) {
               try {
                  this.y4[var3] = com.aspose.slides.ms.System.a3.n5(var2[var3]);
               } catch (Exception var5) {
                  throw new s7(com.aspose.slides.ms.System.d1.n5(new String[]{"The 'Port'='", var1, "' part of the cookie is invalid. Invalid value: ", var2[var3]}), var5);
               }
            }
         }

         this.n5(1);
      } else {
         throw new s7(com.aspose.slides.ms.System.d1.n5(new String[]{"The 'Port'='", var1, "' part of the cookie is invalid. Port must be enclosed by double quotes."}));
      }
   }

   int[] n3() {
      return this.y4;
   }

   void n5(int[] var1) {
      this.y4 = var1;
   }

   public boolean y4() {
      return this.e2;
   }

   public void u3(boolean var1) {
      this.e2 = var1;
   }

   public com.aspose.slides.ms.System.j5 e2() {
      return this.t9;
   }

   public String t9() {
      return this.z1;
   }

   public void u9(String var1) {
      if (var1 == null) {
         this.z1 = com.aspose.slides.ms.System.d1.n5;
      } else {
         this.z1 = var1;
      }
   }

   public int z1() {
      return this.t4;
   }

   public void n5(int var1) {
      if (var1 >= 0 && var1 <= 10) {
         this.t4 = var1;
      } else {
         this.t4 = 0;
      }
   }

   @Override
   public boolean equals(Object comparand) {
      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(comparand, h0.class);
      return var2 != null
         && com.aspose.slides.ms.System.d1.n5(this.s7, var2.s7, true, com.aspose.slides.internal.x7n.l6.k5()) == 0
         && com.aspose.slides.ms.System.d1.n5(this.z1, var2.z1, false, com.aspose.slides.internal.x7n.l6.k5()) == 0
         && com.aspose.slides.ms.System.d1.n5(this.s7(), var2.s7(), false, com.aspose.slides.internal.x7n.l6.k5()) == 0
         && com.aspose.slides.ms.System.d1.n5(this.h0, var2.h0, true, com.aspose.slides.internal.x7n.l6.k5()) == 0
         && this.t4 == var2.t4;
   }

   @Override
   public int hashCode() {
      return n5(
         CaseInsensitiveHashCodeProvider.getDefaultInvariant().hashCode(this.s7),
         this.z1.hashCode(),
         this.s7().hashCode(),
         CaseInsensitiveHashCodeProvider.getDefaultInvariant().hashCode(this.h0),
         this.t4
      );
   }

   private static int n5(int var0, int var1, int var2, int var3, int var4) {
      return var0 ^ (var1 << 13 | var1 >> 19) ^ (var2 << 26 | var2 >> 6) ^ (var3 << 7 | var3 >> 25) ^ (var4 << 20 | var4 >> 12);
   }

   @Override
   public String toString() {
      return this.l6((com.aspose.slides.ms.System.r8)null);
   }

   String l6(com.aspose.slides.ms.System.r8 var1) {
      if (this.s7.length() == 0) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(64);
      if (this.t4 > 0) {
         var2.n5("$Version=").k5(this.t4).n5("; ");
      }

      var2.n5(this.s7).n5("=").n5(this.z1);
      if (this.t4 == 0) {
         return var2.toString();
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.x8)) {
         var2.n5("; $Path=").n5(this.x8);
      }

      boolean var3 = var1 == null || !com.aspose.slides.ms.System.d1.a6(var1.a6(), this.h0);
      if (var3 && !com.aspose.slides.ms.System.d1.n5(this.h0)) {
         var2.n5("; $Domain=").n5(this.h0);
      }

      if (this.n3 != null && this.n3.length() != 0) {
         var2.n5("; $Port=").n5(this.n3);
      }

      return var2.toString();
   }
}
