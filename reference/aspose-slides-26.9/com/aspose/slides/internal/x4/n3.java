package com.aspose.slides.internal.x4;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public abstract class n3 {
   private com.aspose.slides.internal.g0.k5 k5;
   private com.aspose.slides.internal.y3.u3 u3;
   protected x8 n5;
   private k5 a6;
   private Stack<k5> u9;
   private u3 h0;
   private y1 c8 = y1.n5.y4();
   private w1 t2 = w1.n5.u3();
   protected boolean l6;

   public static n3 n5(int var0) {
      switch (var0) {
         case 1:
         case 2:
            return new e2();
         case 3:
         case 4:
         case 5:
            return new y4();
         default:
            throw new InvalidOperationException("Unknown metafile type.");
      }
   }

   public final void n5(com.aspose.slides.internal.y3.u3 var1, x8 var2, com.aspose.slides.internal.g0.k5 var3, y1 var4) {
      this.n5(var3);
      this.u3 = var1;
      this.n5 = var2;
      switch (this.u3.z1()) {
         case 1:
         case 2:
            this.h0 = new u3(false);
            this.x8();
            break;
         case 3:
         case 4:
         case 5:
            this.h0 = new u3(true);
            this.y4();
            break;
         default:
            throw new InvalidOperationException("Unknown metafile type.");
      }

      this.a6 = new k5(this, var1);
      this.u9 = new Stack<>();
      var4.a6(this.c8);
      if (this.u3.z1() != 1 && this.n5 != null) {
         this.n5.n5();
      }

      this.n5();
      var3.n5(this.t2());
   }

   private void x8() {
      for (long var1 = 0L; (var1 & 4294967295L) < this.u3.t4(); var1++) {
         this.h0.n5(null);
      }
   }

   protected abstract void n5();

   public final void l6() {
      this.a6.n5(this.c8.y4());
      this.u9.push(this.a6);
      this.a6 = this.a6.n5();
      this.n5.s7();
   }

   public final void k5() {
      this.n5.n3();
      this.a6 = this.u9.pop();
      this.a6.e2().a6(this.c8);
   }

   public final void n5(w1 var1) {
      this.c8 = new y1(var1.l6(), var1.k5(), this.c8.s7(), this.c8.k5());
   }

   public final void n5(f2 var1) {
      this.c8 = new y1(this.c8.x8(), this.c8.n3(), var1.l6(), var1.k5());
   }

   private void k5(com.aspose.slides.internal.p1s.n5 var1) {
      a6 var2 = new a6();
      if (com.aspose.slides.internal.p1s.n5.k5(var1, com.aspose.slides.internal.p1s.n5.b2)) {
         var2.l6(1);
      } else {
         var2.n5(var1);
      }

      this.h0.n5(var2);
   }

   private void u3(com.aspose.slides.internal.p1s.n5 var1) {
      t2 var2 = new t2();
      if (com.aspose.slides.internal.p1s.n5.k5(var1, com.aspose.slides.internal.p1s.n5.b2)) {
         var2.l6(5);
      } else {
         var2.l6(var1);
      }

      this.h0.n5(var2);
   }

   private void l6(String var1) {
      h0 var2 = new h0();
      var2.n5(var1);
      this.h0.n5(var2);
   }

   private void n3() {
      u9 var1 = new u9();
      this.h0.n5(var1);
   }

   private void y4() {
      this.k5(com.aspose.slides.internal.p1s.n5.b4);
      this.k5(com.aspose.slides.internal.p1s.n5.c8);
      this.k5(com.aspose.slides.internal.p1s.n5.x9);
      this.k5(new com.aspose.slides.internal.p1s.n5(64, 64, 64));
      this.k5(com.aspose.slides.internal.p1s.n5.c8);
      this.k5(com.aspose.slides.internal.p1s.n5.b2);
      this.u3(com.aspose.slides.internal.p1s.n5.b4);
      this.u3(com.aspose.slides.internal.p1s.n5.c8);
      this.u3(com.aspose.slides.internal.p1s.n5.b2);
      this.u3(com.aspose.slides.internal.p1s.n5.b2);
      this.l6("Microsoft Sans Serif");
      this.l6("Courier New");
      this.l6("Microsoft Sans Serif");
      this.l6("Tahoma");
      this.l6("Microsoft Sans Serif");
      this.h0.n5(new c8());
      this.l6("Microsoft Sans Serif");
      this.l6("Microsoft Sans Serif");
      this.n3();
      this.n3();
   }

   public final com.aspose.slides.internal.y3.u3 u3() {
      return this.u3;
   }

   public final k5 a6() {
      return this.a6;
   }

   public static String n5(String var0) {
      if (var0 != null && var0.length() != 0) {
         char[] var1 = new char[var0.length()];
         if (var0.length() == 1) {
            switch (var0.charAt(0)) {
               case '(':
                  var1[0] = ')';
                  break;
               case ')':
                  var1[0] = '(';
            }
         } else {
            int var2 = 0;

            for (int var3 = var0.length() - 1; var2 < var0.length(); var3--) {
               if (var0.charAt(var3) >= '\udc00'
                  && var0.charAt(var3) <= '\udfff'
                  && var3 > 0
                  && var0.charAt(var3 - 1) >= '\ud800'
                  && var0.charAt(var3 - 1) <= '\udbff') {
                  var1[var2 + 1] = var0.charAt(var3);
                  var1[var2] = var0.charAt(var3 - 1);
                  var2++;
                  var3--;
               } else {
                  var1[var2] = var0.charAt(var3);
               }

               var2++;
            }
         }

         return d1.n5(var1);
      } else {
         return "";
      }
   }

   public final y1 u9() {
      return this.c8;
   }

   protected final void n5(y1 var1) {
      this.n5.a6(this.u3(var1.y4()).y4());
   }

   protected final void l6(y1 var1) {
      this.n5.u9(this.u3(var1.y4()).y4());
   }

   protected final void l6(f2 var1) {
      this.a6().t4().l6(var1.l6() * this.a6().z1().u3(), var1.k5() * this.a6().z1().h0());
   }

   protected final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      this.a6().n5(var1);
   }

   protected final void l6(int var1) {
      this.a6().a6(var1);
      this.a6().t9();
   }

   protected final void l6(w1 var1) {
      this.a6().n5(var1.u3());
      this.a6().t9();
   }

   protected final void k5(f2 var1) {
      this.a6().n5(var1.a6());
      this.a6().t9();
   }

   protected final void k5(w1 var1) {
      this.n5(var1.u3());
      this.a6().t9();
   }

   protected final void u3(f2 var1) {
      this.n5(var1.a6());
      this.a6().t9();
   }

   protected final void n5(l6 var1) {
      this.c8().n5(var1);
   }

   protected final void k5(int var1) {
      this.a6().n5(var1);
   }

   protected final void u3(int var1) {
      this.c8().l6(var1);
   }

   protected final void a6(int var1) {
      this.a6().k5(var1);
   }

   protected final void l6(com.aspose.slides.internal.p1s.n5 var1) {
      this.a6().l6(var1);
   }

   protected final void u9(int var1) {
      this.a6().u3(var1);
   }

   protected final void u3(w1 var1) {
      this.u9(var1.u3());
      this.n5.n5(false);
   }

   protected final void a6(w1 var1) {
      this.n5.n5(var1.u3());
      this.u9(var1.u3());
   }

   protected final void k5(y1 var1) {
      this.n5.n5(var1.y4());
   }

   public final w1 h0() {
      return this.t2;
   }

   public final void u9(w1 var1) {
      var1.n5(this.t2);
   }

   public final u3 c8() {
      return this.h0;
   }

   public static int h0(int var0) {
      switch (var0) {
         case 1:
            return 0;
         case 2:
            return 1;
         default:
            throw new InvalidOperationException(d1.n5("Unknown GDI fill mode[{0}].", new Object[]{s3.n5(n5.class, var0)}));
      }
   }

   private y1 u3(y1 var1) {
      w1[] var2 = new w1[]{new w1(var1.x8(), var1.n3()), new w1(var1.x8() + var1.s7(), var1.n3() + var1.k5())};
      this.a6().z1().n5(var2);
      return y1.n5(var2[0].l6(), var2[0].k5(), var2[1].l6(), var2[1].k5());
   }

   protected final void a6(f2 var1) {
      f2 var2 = var1.a6();
      this.n5(var2.a6());
      this.a6().l6(var2.a6());
      this.a6().t9();
   }

   public final boolean t2() {
      return this.l6;
   }

   public final com.aspose.slides.internal.g0.k5 s7() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.g0.k5 var1) {
      this.k5 = var1;
   }
}
