package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.b8c.v2;

public final class s8 extends c7 implements a3, f0 {
   private c7 l6;
   private b0 k5;
   private a3 u3;
   private int a6;
   private com.aspose.slides.internal.b8c.c8 u9;
   private v2 h0;
   private boolean c8;
   private int t2 = 1;
   private s8$n5 s7;
   private b1 x8;
   private w2 n3;
   private c7 y4;
   private com.aspose.slides.internal.b8c.b4 e2;
   public final com.aspose.slides.internal.v6g.n5<com.aspose.slides.internal.b8c.b4> n5 = new q6(this);
   private static o8 t9;

   public s8(c7 var1, com.aspose.slides.internal.b8c.b4 var2, boolean var3) {
      this.y4 = this;
      this.l6 = var1;
      this.k5 = com.aspose.slides.internal.v6g.k5.n5(var1, b0.class);
      if (this.k5 == null) {
         p5 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, p5.class);
         if (var4 != null) {
            this.k5 = var4.u6();
         }
      }

      if (this.k5 == null) {
         throw new ArgumentException(
            v3.n5("The XmlReader passed in to construct this XmlValidatingReaderImpl must be an instance of a System.Xml.XmlTextReader."), "reader"
         );
      }

      this.k5.a6(true);
      this.u3 = com.aspose.slides.internal.v6g.k5.n5(var1, a3.class);
      this.c8 = var3;
      this.h0 = new v2(this.l6.y1());
      this.h0.n5(this.y0());
      this.s7 = new s8$n5(this);
      if (var2 != null) {
         this.s7.n5(var2);
      }

      this.k5.n5(this.s7);
      this.k5.n5(new i3(this));
      this.a6 = 2;
      this.u9(2);
   }

   @Override
   public w4 n5() {
      w4 var1;
      if (this.k5.j3()) {
         var1 = null;
      } else {
         var1 = this.l6.n5();
      }

      if (var1 != null) {
         var1 = var1.z3();
      } else {
         var1 = new w4();
      }

      var1.a6(2);
      if (!this.c8) {
         var1.u9(var1.t4() & -9);
      }

      var1.h0(true);
      return var1;
   }

   @Override
   public int s7() {
      return this.l6.s7();
   }

   @Override
   public String x8() {
      return this.l6.x8();
   }

   @Override
   public String n3() {
      return this.l6.n3();
   }

   @Override
   public String y4() {
      return this.l6.y4();
   }

   @Override
   public String e2() {
      return this.l6.e2();
   }

   @Override
   public boolean t9() {
      return this.l6.t9();
   }

   @Override
   public String z1() {
      return this.l6.z1();
   }

   @Override
   public int t4() {
      return this.l6.t4();
   }

   @Override
   public String q0() {
      return this.l6.q0();
   }

   @Override
   public boolean m1() {
      return this.l6.m1();
   }

   @Override
   public boolean l6() {
      return this.l6.l6();
   }

   @Override
   public char d5() {
      return this.l6.d5();
   }

   @Override
   public int k7() {
      return this.l6.k7();
   }

   @Override
   public int h0() {
      return this.t2 == 1 ? 0 : this.l6.h0();
   }

   @Override
   public boolean j5() {
      return this.l6.j5();
   }

   @Override
   public z9 y1() {
      return this.l6.y1();
   }

   @Override
   public int z8() {
      return this.l6.z8();
   }

   @Override
   public String u3(String var1) {
      return this.l6.u3(var1);
   }

   @Override
   public String k5(int var1) {
      return this.l6.k5(var1);
   }

   @Override
   public boolean k5(String var1) {
      if (!this.l6.k5(var1)) {
         return false;
      }

      this.t2 = 0;
      return true;
   }

   @Override
   public void l6(int var1) {
      this.l6.l6(var1);
      this.t2 = 0;
   }

   @Override
   public boolean k5() {
      if (!this.l6.k5()) {
         return false;
      }

      this.t2 = 0;
      return true;
   }

   @Override
   public boolean u3() {
      if (!this.l6.u3()) {
         return false;
      }

      this.t2 = 0;
      return true;
   }

   @Override
   public boolean a6() {
      if (!this.l6.a6()) {
         return false;
      }

      this.t2 = 0;
      return true;
   }

   @Override
   public boolean u9() {
      switch (this.t2) {
         case 0:
            if (this.l6.u9()) {
               this.j9();
               return true;
            }

            this.u9.k5();
            return false;
         case 1:
            this.t2 = 0;
            if (this.l6.h0() == 1) {
               this.j9();
               return true;
            } else {
               if (this.l6.u9()) {
                  this.j9();
                  return true;
               }

               this.u9.k5();
               return false;
            }
         case 2:
            this.t2 = 0;
            this.a3();
            if (this.l6.u9()) {
               this.j9();
               return true;
            }

            this.u9.k5();
            return false;
         case 3:
            this.t2 = 0;
            this.x9();
            if (this.l6.u9()) {
               this.j9();
               return true;
            }

            this.u9.k5();
            return false;
         case 4:
            this.t2 = 0;
            this.n3.n5();
            if (this.l6.u9()) {
               this.j9();
               return true;
            }

            this.u9.k5();
            return false;
         case 5:
         case 6:
            return false;
         default:
            return false;
      }
   }

   @Override
   public void w1() {
      this.l6.w1();
      this.t2 = 5;
   }

   @Override
   public String n5(String var1) {
      return this.k5.n5(var1);
   }

   @Override
   public boolean c8() {
      if (this.t2 == 4) {
         this.t2 = 0;
         this.n3.n5();
      }

      if (!this.l6.c8()) {
         return false;
      }

      this.t2 = 0;
      return true;
   }

   @Override
   public boolean z3() {
      return true;
   }

   @Override
   public void a0() {
      if (this.t2 == 3) {
         this.t2 = 0;
      }

      this.l6.a0();
   }

   public final void t2() {
      if (this.y4.s7() == 5 && this.t2 != 3 && !this.y4.u9()) {
         throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
      }
   }

   @Override
   public String c4() {
      this.t2();
      return super.c4();
   }

   @Override
   public final boolean ag_() {
      return true;
   }

   @Override
   public final int ah_() {
      return ((f0)this.l6).ah_();
   }

   @Override
   public final int ai_() {
      return ((f0)this.l6).ai_();
   }

   @Override
   public final IGenericDictionary<String, String> n5(int var1) {
      return this.u3.n5(var1);
   }

   @Override
   public final String l6(String var1) {
      return this.u3.l6(var1);
   }

   public final c7 z7() {
      return this.l6;
   }

   public final b0 v4() {
      return this.k5;
   }

   public final int u6() {
      return this.a6;
   }

   public final v2 t1() {
      return this.h0;
   }

   public final boolean a5() {
      return this.k5.z7();
   }

   private void a3() {
      if (this.x8.k5() != null && this.x8.k5().length() != 0) {
         v4 var1 = y2.n5();
         b0$l6 var2 = new b0$l6(this.k5);
         z7 var3 = var1.n5(this.x8.u9(), this.x8.k5(), this.x8.u3(), this.x8.a6(), this.x8.h0(), var2);
         this.k5.n5(var3);
         this.p3();
      }
   }

   private void p3() {
      z7 var1 = this.k5.d2();
      if (var1 != null) {
         switch (this.a6) {
            case 0:
            case 2:
               this.u9.n5(var1);
               break;
            case 1:
               this.u9(2);
               this.u9.n5(var1);
         }
      }
   }

   private void x9() {
      int var1 = this.l6.t4();
      this.y4.a0();

      while (this.y4.u9() && this.l6.t4() > var1) {
      }
   }

   private void u9(int var1) {
      this.u9 = com.aspose.slides.internal.b8c.c8.n5(var1, this, this.h0, this.s7, this.c8);
      o8 var2 = this.y0();
      this.u9.n5(var2);
      if (this.y4.q0().length() > 0) {
         this.u9.n5(var2 == null ? new com.aspose.slides.ms.System.r8(this.y4.q0(), 0) : var2.n5(null, this.y4.q0()));
      }

      this.k5.n5(this.a6 == 0 ? null : this.s7);
   }

   private o8 y0() {
      o8 var1 = this.k5.j4();
      if (var1 == null && !this.k5.t1() && !w4.k7()) {
         if (t9 == null) {
            t9 = new k1();
         }

         return t9;
      } else {
         return var1;
      }
   }

   private void j9() {
      switch (this.l6.s7()) {
         case 5:
            this.t2 = 3;
            this.k5.n5((Object)null);
            this.k5.l6((Object)null);
            this.u9.l6();
            break;
         case 10:
            this.p3();
            break;
         case 13:
            if ((this.l6.t4() > 0 || this.k5.g7() != 9) && this.u9.n5()) {
               this.k5.x8(14);
            }

            this.k5.n5((Object)null);
            this.k5.l6((Object)null);
            this.u9.l6();
            break;
         default:
            this.k5.n5((Object)null);
            this.k5.l6((Object)null);
            this.u9.l6();
      }
   }

   public final com.aspose.slides.internal.b8c.c8 h2() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.b8c.c8 var1) {
      this.u9 = var1;
   }

   @Override
   public s2 b3() {
      return this.k5.b3();
   }

   public final boolean v0() {
      return this.k5.f5();
   }

   public final void n5(Object var1) {
      this.k5.n5(var1);
   }

   public final Object f0() {
      return this.k5.i9();
   }

   public final void l6(Object var1) {
      this.k5.l6(var1);
   }

   public final boolean n5(com.aspose.slides.internal.b8c.h9 var1) {
      return this.k5.n5(var1);
   }

   @Override
   public z7 d2() {
      return this.k5.d2();
   }

   public final void n5(b3 var1, b0 var2) {
      com.aspose.slides.internal.b8c.h9 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.b8c.h9.class);
      if (var3 != null) {
         if (!var3.z3()) {
            com.aspose.slides.internal.b8c.x0 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.d2(), com.aspose.slides.internal.b8c.x0.class);
            if (var4 == null) {
               return;
            }

            com.aspose.slides.internal.b8c.q1.n5(var3, var4, this.s7, var2.q0());
         }
      }
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.b8c.b4 n5(s8 var0, com.aspose.slides.internal.b8c.b4 var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static s8$n5 n5(s8 var0) {
      return var0.s7;
   }
}
