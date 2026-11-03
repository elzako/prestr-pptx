package com.aspose.slides.internal.g4;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import java.util.Iterator;

public class y4 {
   private final com.aspose.slides.internal.h7.x8[] n5;
   private String l6;
   private boolean k5;
   private boolean u3;
   private y1 a6 = new y1();

   public final String n5() {
      return this.l6;
   }

   private void l6(String var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.u1.u3 l6() {
      if (this.n5 != null) {
         return this.n5.length > 0 ? this.n5[0].c8() : null;
      } else {
         return null;
      }
   }

   public final com.aspose.slides.internal.o9b.c8 k5() {
      return this.n5 != null ? (this.n5.length > 0 ? this.n5[0].x8() : com.aspose.slides.internal.o9b.c8.m3()).o8() : com.aspose.slides.internal.o9b.c8.m3();
   }

   public final String u3() {
      if (this.n5 != null) {
         Object var1 = null;
         return (String)(this.n5.length > 0 ? this.n5[0].c8().t9() : var1);
      } else {
         return null;
      }
   }

   public final String a6() {
      return k5(this.u3());
   }

   public final String u9() {
      String var1 = d1.n5;
      com.aspose.slides.internal.u1.a6 var2 = this.l6().t4();
      if (var2 != null) {
         String var3 = var2.c8();
         String var4 = u3(var3);
         if (var4 == null) {
            var4 = this.a6();
         }

         var1 = var4;
      } else {
         var1 = this.a6();
      }

      return var1;
   }

   public final boolean h0() {
      boolean var1 = false;
      com.aspose.slides.internal.u1.a6 var2 = this.l6().t4();
      if (var2 != null) {
         float var3 = var2.s7();
         float var4 = q1.n5(var3);
         if (var4 > 0.01F) {
            var1 = true;
         }
      }

      return var1;
   }

   public final boolean c8() {
      boolean var1 = false;
      com.aspose.slides.internal.u1.a6 var2 = this.l6().t4();
      if (var2 != null) {
         float var3 = var2.x8();
         if (var3 > 699.0F) {
            var1 = true;
         }
      }

      return var1;
   }

   public final boolean t2() {
      return this.k5;
   }

   public final boolean s7() {
      return this.u3;
   }

   public final float x8() {
      if (this.n5 != null) {
         return this.n5.length > 0 ? this.n5[0].t2() : 0.0F;
      } else {
         return 0.0F;
      }
   }

   public final y1 n3() {
      return this.a6.y4();
   }

   private void n5(y1 var1) {
      this.a6 = var1.y4();
   }

   public final float y4() {
      return this.n5.length == 0 ? 0.0F : this.n5[0].a6();
   }

   public final String e2() {
      return this.n5.length == 0 ? d1.n5 : this.n5[0].h0();
   }

   public y4(com.aspose.slides.internal.h7.x8[] var1) {
      this.n5 = var1;
      a5 var2 = new a5();
      y1 var3 = y1.n5.y4();
      boolean var4 = var1.length > 1 && n5(var1[0].s7());

      for (com.aspose.slides.internal.h7.x8 var8 : var1) {
         y1 var9 = new y1(var8.n5(), var8.l6(), var8.u3(), var8.k5());
         (y1.k5(var3, y1.n5) ? var9 : y1.l6(var3.y4(), var9.y4())).a6(var3);
         if (var4) {
            var2.n5(0, var8.s7());
         } else {
            var2.n5(var8.s7());
         }
      }

      if (var1.length > 0 && !var1[0].u9().n5()) {
         var3 = new y1(var1[0].u9().u3(), var3.c8().a6());
      }

      this.n5(var3.y4());
      this.l6(a6(var2.toString()));
   }

   public static boolean n5(String var0) {
      if (d1.n5(var0)) {
         return false;
      }

      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if (com.aspose.slides.internal.n2d.u9.y4(var2) == 2) {
            return true;
         }
      }

      return false;
   }

   private static String k5(String var0) {
      if (var0 == null) {
         return null;
      }

      if (d1.t2(var0, "+")) {
         var0 = d1.n5(var0, '+')[1];
      }

      String var1 = d1.n5(var0, "-", " ");
      return u3(var1);
   }

   private static String u3(String var0) {
      if (var0 == null) {
         return null;
      }

      String var1 = d1.n5;
      com.aspose.slides.internal.r7c.u9 var2 = com.aspose.slides.internal.r7c.c8.l6(var0, "(MT)|([A-Z]+(?=Bold))|([A-Z]+[a-z]*)");
      Iterator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.r7c.u3 var4 = (com.aspose.slides.internal.r7c.u3)var3.next();
            var1 = d1.n5(var1, d1.n5(new String[]{var4.k5(), " "}));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      if (var1.length() > 0) {
         var1 = d1.n5(var1, var1.length() - 1, 1);
      }

      return var1;
   }

   private static String a6(String var0) {
      return d1.n5(var0, "\uffff", "�");
   }
}
