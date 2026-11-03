package com.aspose.slides.internal.m6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.e7.y4;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.r7c.c8;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.internal.v2.t9;
import com.aspose.slides.internal.v2.x8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class k5 extends n5 {
   private final y4 n5 = new y4();
   private final List<x8> l6 = new List<>();
   private long k5;
   private com.aspose.slides.internal.v2.u3 u3;

   public final com.aspose.slides.internal.v2.u3 a6() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.v2.u3 var1) {
      this.u3 = var1;
   }

   public k5(t4 var1) {
      super(var1);
   }

   public com.aspose.slides.internal.v2.u3 u9() {
      this.u3 = new com.aspose.slides.internal.v2.u3();
      String var1 = this.z1();
      if (var1 == null) {
         return null;
      }

      this.u3.n5(var1);
      this.k5();
      boolean var2 = false;

      while (!this.n5().l6()) {
         try {
            var2 |= this.n3();
         } catch (RuntimeException var4) {
            if (var2) {
               break;
            }
         }

         this.n5().y4();
      }

      this.n5.n5(this.k5);
      this.u3.n5(this.n5.n5(), this.n5.l6());
      this.l6(this.u3);
      if (!this.u3.a6()) {
         this.u3.u9();
      }

      return this.u3;
   }

   private void l6(com.aspose.slides.internal.v2.u3 var1) {
      List$Enumerator var2 = var1.h0().iterator();

      try {
         while (var2.hasNext()) {
            s7 var3 = (s7)var2.next();
            s7 var4 = var3.t2();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, x8.class)) {
               x8 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, x8.class);
               if (this.l6.containsItem(var5)) {
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void k5() {
      c8 var1 = new c8("^\\d+\\s+\\d+\\s+obj.*", 0);
      long var2 = this.n5().n5();
      byte[] var4 = new byte[16];

      while (!this.n5().l6()) {
         int var5 = this.n5().n5(var4);
         if (var5 < 1) {
            break;
         }

         j5 var6 = j5.k5("US-ASCII");
         String var7 = var6.l6(var4);
         if (d1.l6(var7, "trailer") || d1.l6(var7, "xref") || d1.l6(var7, "startxref") || d1.l6(var7, "stream") || var1.u3(var7)) {
            this.n5().n5(var2);
            break;
         }

         int var8 = var5 - 1;
         this.n5().l6((long)var8);
         var2++;
      }
   }

   private s7 u3() {
      s7 var1 = this.h0();
      this.n5().y4();
      char var2 = this.n5().h0();
      if (var2 >= '0' && var2 <= '9') {
         s7 var3 = this.h0();
         this.n5().y4();
         char var4 = (char)this.n5().a6();
         com.aspose.slides.internal.f8y.n5.n5(var4 == 'R');
         t9 var5 = new t9(((t2)var1).k5(), ((t2)var3).k5());
         return this.u3.n5(var5);
      } else {
         return var1;
      }
   }

   private com.aspose.slides.internal.v2.k5 c8() {
      char var1 = (char)this.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var1 == '<', "Dictionary should start from <<");
      var1 = (char)this.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var1 == '<', "Dictionary should start from <<");
      this.n5().y4();
      com.aspose.slides.internal.v2.k5 var2 = new com.aspose.slides.internal.v2.k5();
      boolean var3 = false;

      while (!var3) {
         this.n5().y4();
         var1 = this.n5().h0();
         if (var1 == '>') {
            var3 = true;
         } else if (var1 != '/') {
            boolean var4 = this.t2();
            if (var4) {
               return var2;
            }
         } else {
            com.aspose.slides.internal.v2.k5 var7 = this.s7();
            var2.l6(var7);
         }
      }

      char var8 = (char)this.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var8 == '>');
      var8 = (char)this.n5().a6();
      com.aspose.slides.internal.f8y.n5.n5(var8 == '>');
      return var2;
   }

   private boolean t2() {
      int var1;
      for (var1 = this.n5().a6(); var1 != -1 && var1 != 47 && var1 != 62; var1 = this.n5().a6()) {
         if (var1 == 101) {
            var1 = this.n5().a6();
            if (var1 == 110) {
               var1 = this.n5().a6();
               if (var1 == 100) {
                  var1 = this.n5().a6();
                  boolean var2 = var1 == 115
                     && this.n5().a6() == 116
                     && this.n5().a6() == 114
                     && this.n5().a6() == 101
                     && this.n5().a6() == 97
                     && this.n5().a6() == 109;
                  boolean var3 = !var2 && var1 == 111 && this.n5().a6() == 98 && this.n5().a6() == 106;
                  if (var2 || var3) {
                     return true;
                  }
               }
            }
         }
      }

      if (var1 != -1) {
         this.n5().k5();
         return false;
      } else {
         return true;
      }
   }

   private com.aspose.slides.internal.v2.k5 s7() {
      com.aspose.slides.internal.v2.k5 var1 = new com.aspose.slides.internal.v2.k5();
      com.aspose.slides.internal.v2.c8 var2 = this.n5().t9();
      s7 var3 = this.u3();
      this.n5().y4();
      if (this.n5().h0() == 'd') {
         String var4 = this.n5().e2();
         if (var4 != null && !"def".equals(var4)) {
            long var5 = this.n5().n5() - var4.length();
            this.n5().n5(var5);
         } else {
            this.n5().y4();
         }
      }

      if (var2 != null && var3 != null) {
         var1.n5(var2, var3);
      }

      return var1;
   }

   private com.aspose.slides.internal.v2.n5 x8() {
      char var1 = (char)this.n5().a6();
      String var2 = d1.n5("expected='[' actual='{0}'", new Object[]{var1});
      com.aspose.slides.internal.f8y.n5.n5(var1 == '[', var2);
      com.aspose.slides.internal.v2.n5 var3 = new com.aspose.slides.internal.v2.n5();
      this.n5().y4();

      char var4;
      for (; (var4 = this.n5().h0()) > 0 && var4 != ']'; this.n5().y4()) {
         s7 var5 = this.h0();
         if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.u9.class)) {
            s7 var6 = var3.l6(var3.n5() - 1);
            if (com.aspose.slides.internal.v6g.k5.l6(var6, t2.class)) {
               t2 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, t2.class);
               var3.n5(var3.n5() - 1);
               s7 var8 = var3.l6(var3.n5() - 1);
               if (com.aspose.slides.internal.v6g.k5.l6(var8, t2.class)) {
                  t2 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, t2.class);
                  var3.n5(var3.n5() - 1);
                  t9 var10 = new t9(var9.k5(), var7.k5());
                  var5 = this.u3.n5(var10);
               } else {
                  var5 = null;
               }
            } else {
               var5 = null;
            }
         }

         if (var5 != null) {
            var3.n5(var5);
         } else {
            String var11 = this.n5().c8();
            if ("endobj".equals(var11) || "endstream".equals(var11)) {
               return var3;
            }
         }
      }

      this.n5().a6();
      this.n5().y4();
      return var3;
   }

   protected final s7 h0() {
      s7 var1 = null;
      this.n5().y4();
      char var2 = this.n5().h0();
      if (var2 == -1) {
         return null;
      }

      switch (var2) {
         case '(':
            var1 = this.n5().q0();
            break;
         case '/':
            var1 = this.n5().t9();
            break;
         case '<':
            this.n5().a6();
            var2 = this.n5().h0();
            this.n5().k5();
            if (var2 == '<') {
               var1 = this.c8();
               this.n5().y4();
            } else {
               var1 = this.n5().q0();
            }
            break;
         case 'R':
            this.n5().a6();
            var1 = new com.aspose.slides.internal.v2.u9(null);
            break;
         case '[':
            var1 = this.x8();
            break;
         case 'f':
            String var11 = this.n5().n5(5);
            if ("false".equals(var11)) {
               var1 = com.aspose.slides.internal.v2.l6.l6();
            }

            com.aspose.slides.internal.f8y.n5.n5("false".equals(var11));
            break;
         case 'n':
            String var10 = this.n5().e2();
            com.aspose.slides.internal.f8y.n5.n5("null".equals(var10), "'nul' string is expected");
            var1 = s7.c8();
            break;
         case 't':
            String var9 = this.n5().n5(4);
            if ("true".equals(var9)) {
               var1 = com.aspose.slides.internal.v2.l6.n5();
            }

            com.aspose.slides.internal.f8y.n5.n5("true".equals(var9));
            break;
         case '\uffff':
            return null;
         default:
            if (!com.aspose.slides.ms.System.t9.u3(var2) && var2 != '-' && var2 != '+' && var2 != '.') {
               long var4 = this.n5().n5();
               String var6 = this.n5().e2();
               com.aspose.slides.internal.f8y.n5.n5(!d1.n5(var6), "Unknown dir object ");
               if ("endobj".equals(var6) || "endstream".equals(var6)) {
                  this.n5().n5(var4);
               }
            } else {
               a5 var3 = new a5();

               for (var2 = (char)this.n5().a6();
                  com.aspose.slides.ms.System.t9.u3(var2) || var2 == '-' || var2 == '+' || var2 == '.' || var2 == 'E' || var2 == 'e';
                  var2 = (char)this.n5().a6()
               ) {
                  var3.n5(var2);
               }

               if (var2 != -1) {
                  this.n5().k5();
               }

               var1 = t2.l6(var3.toString());
            }
      }

      return var1;
   }

   private x8 n5(com.aspose.slides.internal.v2.k5 var1) {
      String var2 = this.n5().e2();
      com.aspose.slides.internal.f8y.n5.n5("stream".equals(var2));
      int var3 = this.n5().a6();

      while (var3 == 32) {
         var3 = this.n5().a6();
      }

      if (var3 == 13) {
         var3 = this.n5().a6();
         if (var3 != 10) {
            this.n5().k5();
         }
      } else if (var3 != 10) {
         this.n5().k5();
      }

      s7 var4 = var1.k5(com.aspose.slides.internal.v2.c8.a9);
      e2 var5 = new e2();
      int var6 = -1;
      if (com.aspose.slides.internal.v6g.k5.l6(var4, t2.class)) {
         t2 var7 = com.aspose.slides.internal.v6g.k5.n5(var4, t2.class);
         var6 = var7.k5();
      }

      if (var6 == -1) {
         List var15 = this.n5().t4();
         byte[] var8 = com.aspose.slides.internal.n2d.t4.n5(var15);
         var5.write(var8, 0, var8.length);
      } else {
         byte[] var16 = new byte[var6];
         this.n5().n5(var16);
         var5.write(var16, 0, var16.length);
      }

      this.n5().y4();
      long var9 = this.n5().n5();
      String var11 = this.n5().e2();
      if (!"endstream".equals(var11)) {
         if (d1.l6(var11, "endobj")) {
            this.n5().n5(var9);
         } else if (d1.l6(var11, "endstream")) {
            this.n5().n5(var9 + 9L);
         } else {
            List var12 = this.n5().t4();
            byte[] var13 = com.aspose.slides.internal.n2d.t4.n5(var12);
            var5.write(var13, 0, var13.length);
            var11 = this.n5().e2();
            com.aspose.slides.internal.f8y.n5.n5("endstream".equals(var11), "endstream is expected");
         }
      }

      return new x8(var1, var5);
   }

   private boolean n3() {
      long var1 = this.n5().n5();
      boolean var3 = false;
      this.n5().y4();

      char var4;
      for (var4 = this.n5().h0(); var4 == 'e'; var4 = this.n5().h0()) {
         this.n5().e2();
         this.n5().y4();
         var1 = this.n5().n5();
      }

      if (!this.n5().l6()) {
         if (var4 == 'x') {
            this.l6(var1);
         } else if (var4 != 't' && var4 != 's') {
            this.n5(var1);
         } else {
            if (var4 == 't') {
               this.e2();
               var4 = this.n5().h0();
            }

            if (var4 == 's') {
               this.y4();

               while (com.aspose.slides.internal.e7.x8.u3(this.n5().h0()) && !this.n5().l6()) {
                  this.n5().a6();
               }

               String var5 = "";
               if (!this.n5().l6()) {
                  var5 = this.n5().u3();
               }

               if (!"%%EOF".equals(var5)) {
                  j5 var6 = j5.k5("ISO-8859-1");
                  if (d1.l6(var5, "%%EOF")) {
                     this.n5().k5();
                     String var7 = d1.k5(var5, 5);
                     byte[] var8 = var6.u3(var7);
                     this.n5().l6((long)var8.length);
                  } else {
                     this.n5().k5();
                     byte[] var9 = var6.u3(var5);
                     this.n5().l6((long)var9.length);
                  }
               }

               var3 = true;
            }
         }
      }

      return var3;
   }

   private void n5(long var1) {
      long var3 = -1L;
      boolean var5 = false;

      try {
         char var6 = this.n5().h0();
         if (var6 == '<') {
            var5 = true;
         } else {
            var3 = this.n5().t2();
         }
      } catch (IOException var16) {
         var3 = this.n5().t2();
      }

      int var7;
      if (!var5) {
         this.n5().y4();
         var7 = this.n5().s7();
         String var17 = this.n5().n5(3);
         com.aspose.slides.internal.f8y.n5.n5("obj".equals(var17) || "o".equals(var17));
      } else {
         var3 = -1L;
         var7 = -1;
      }

      this.n5().y4();
      s7 var18 = this.h0();
      long var8 = this.n5().n5();
      String var10 = this.n5().e2();
      if ("stream".equals(var10)) {
         this.n5().n5(var8);
         if (!com.aspose.slides.internal.v6g.k5.l6(var18, com.aspose.slides.internal.v2.k5.class)) {
            throw new IOException("Stream not preceded by dictionary");
         }

         com.aspose.slides.internal.v2.k5 var11 = com.aspose.slides.internal.v6g.k5.n5(var18, com.aspose.slides.internal.v2.k5.class);
         var18 = this.n5(var11);
         x8 var12 = (x8)var18;
         s7 var13 = var12.k5(com.aspose.slides.internal.v2.c8.a9);
         int var14 = -1;
         if (var13 != null && com.aspose.slides.internal.v6g.k5.l6(var13, t2.class)) {
            t2 var15 = com.aspose.slides.internal.v6g.k5.n5(var13, t2.class);
            var14 = var15.k5();
         }

         if (var14 == -1) {
            this.l6.addItem(var12);
         }

         com.aspose.slides.internal.v2.c8 var21 = var12.a6(com.aspose.slides.internal.v2.c8.g2x);
         if (var21 != null && var21 == com.aspose.slides.internal.v2.c8.y5s) {
            this.n5(var12, var1);
         }

         this.n5().y4();
         var10 = this.n5().u3();
      }

      t9 var19 = new t9(var3, var7);
      com.aspose.slides.internal.v2.u9 var20 = this.u3.n5(var19);
      if (var20.k5() == null) {
         var20.n5(var18);
      } else {
         this.n5(var1, var3, var7, var18);
      }

      if (!"endobj".equals(var10)) {
         if (d1.l6(var10, "endobj")) {
            this.n5().n5(this.n5().n5() - (var10.length() - 6));
            this.n5().k5();
         } else if (!d1.k5(d1.l6(var10), "endobj") && !this.n5().l6()) {
            this.n5().n5(this.n5().n5() - var10.length());
            this.n5().k5();
         }
      }

      this.n5().y4();
   }

   private void n5(x8 var1, long var2) {
      this.n5(var1, var2, true);
   }

   private void n5(x8 var1, long var2, boolean var4) {
      if (var4) {
         this.n5.l6(var2);
         this.n5.n5(var1);
      }

      u9 var5 = new u9(var1, this.u3, this.n5);
      var5.u9();
   }

   private void n5(long var1, long var3, int var5, s7 var6) {
      throw new NotImplementedException();
   }

   private boolean y4() {
      if (this.n5().h0() != 's') {
         return false;
      }

      String var1 = this.n5().e2();
      if (!"startxref".equals(d1.l6(var1))) {
         return false;
      }

      this.n5().y4();
      this.k5 = this.n5().x8();
      return true;
   }

   private boolean e2() {
      char var1 = this.n5().h0();
      if (var1 != 't') {
         return false;
      }

      String var2 = this.n5().c8();
      String var3 = d1.l6(var2);
      if (!"trailer".equals(var3) && !d1.l6(var2, "trailer")) {
         return false;
      }

      var2 = this.n5().e2();
      this.n5().y4();
      com.aspose.slides.internal.v2.k5 var4 = this.c8();
      this.n5.n5(var4);
      this.n5().y4();
      return true;
   }

   private boolean l6(long var1) {
      char var3 = this.n5().h0();
      if (var3 != 'x') {
         return false;
      }

      String var4 = this.n5().e2();
      String var5 = d1.l6(var4);
      if (!"xref".equals(var5)) {
         return false;
      }

      String var6 = this.n5().c8();
      this.n5.l6(var1);
      if (d1.l6(var6, "trailer")) {
         return false;
      }

      this.t9();
      return true;
   }

   private void t9() {
      char var10;
      do {
         long var1 = this.n5().t2();
         long var3 = this.n5().x8();
         this.n5().y4();

         for (int var5 = 0; var5 < var3; var5++) {
            char var6 = this.n5().h0();
            boolean var7 = com.aspose.slides.internal.e7.x8.n5(var6);
            if (this.n5().l6() || var7 || this.n5().h0() == 't') {
               break;
            }

            String var8 = this.n5().u3();
            String[] var9 = d1.n5(var8, ' ');
            if (var9.length < 3) {
               break;
            }

            if ("n".equals(var9[var9.length - 1])) {
            }

            var1++;
            this.n5().y4();
         }

         this.n5().y4();
         var10 = this.n5().h0();
      } while (var10 >= '0' && var10 <= '9');
   }

   private String z1() {
      String var1 = this.n5().u3();
      if (d1.n5(var1)) {
         return null;
      }

      if (!d1.t2(var1, "%PDF-") && !d1.t2(var1, "%FDF-")) {
         var1 = this.n5().u3();
         if (d1.n5(var1)) {
            return null;
         }

         while (!d1.t2(var1, "%PDF-") && !d1.t2(var1, "%FDF-") && (var1.length() <= 0 || !com.aspose.slides.ms.System.t9.u3(var1.charAt(0)))) {
            var1 = this.n5().u3();
         }
      }

      if (d1.c8(var1, "%PDF-") == -1 && d1.c8(var1, "%FDF-") == -1) {
         return null;
      }

      int var2 = d1.c8(var1, "%PDF-");
      if (var2 == -1) {
         var2 = d1.c8(var1, "%FDF-");
      }

      if (var2 > 0) {
         var1 = d1.l6(var1, var2, var1.length() - var2);
      }

      if (d1.l6(var1, "%PDF-")) {
         if (!c8.u3(var1, d1.n5(new String[]{"%PDF-", "\\d.\\d"}))) {
            if (var1.length() < "%PDF-".length() + 3) {
               var1 = d1.n5(new String[]{"%PDF-", "1.4"});
            } else {
               var1 = d1.l6(var1, 0, "%PDF-".length() + 3);
            }
         }
      } else if (!c8.u3(var1, d1.n5(new String[]{"%FDF-", "\\d.\\d"}))) {
         if (var1.length() < "%FDF-".length() + 3) {
            var1 = d1.n5(new String[]{"%FDF-", "1.0"});
         } else {
            var1 = d1.l6(var1, 0, "%FDF-".length() + 3);
         }
      }

      return var1;
   }
}
