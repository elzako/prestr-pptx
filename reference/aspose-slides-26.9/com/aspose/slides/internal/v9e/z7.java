package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.ArgumentNullException;

public class z7 {
   private com.aspose.slides.internal.x6s.a6 n5;
   private com.aspose.slides.ms.System.Xml.o5 l6;
   private p8 k5;
   private z7 u3;
   private String a6;
   private com.aspose.slides.internal.r5d.n5 u9;

   public final z7 n5() {
      return this.u3;
   }

   public final void n5(z7 var1) {
      this.u3 = var1;
   }

   public final String l6() {
      return this.a6;
   }

   public final com.aspose.slides.internal.r5d.n5 k5() {
      return this.u9;
   }

   public final com.aspose.slides.internal.x6s.a6 u3() {
      this.j5();
      return this.n5;
   }

   public final p8 a6() {
      this.j5();
      return this.k5;
   }

   public final boolean u9() {
      this.j5();
      return this.n5.z1();
   }

   public final boolean h0() {
      this.j5();
      return this.n5.t4();
   }

   public final boolean c8() {
      this.j5();
      return this.n5.q0();
   }

   public final void t2() {
      this.n5 = null;
      this.l6 = null;
   }

   public final int s7() {
      return this.l6.ah_();
   }

   public final int x8() {
      return this.l6.ai_();
   }

   public final int n3() {
      this.j5();
      return this.n5.k5();
   }

   public final String y4() {
      this.j5();
      return this.n5.u9();
   }

   public final String e2() {
      this.j5();
      return this.n5.u3();
   }

   public final String t9() {
      this.j5();
      return this.n5.a6();
   }

   public final String z1() {
      this.j5();
      return this.n5.h0();
   }

   public final String t4() {
      this.j5();
      return this.n5.c8();
   }

   public final boolean q0() {
      this.j5();
      return this.n5.s7();
   }

   public final String z3() {
      return this.n5.t2();
   }

   public final boolean m1() {
      this.j5();
      return this.n5.e2();
   }

   public final boolean k7() {
      this.j5();
      return this.n5.t9();
   }

   public final boolean m3() {
      this.j5();
      return this.n5.l6(1);
   }

   public final boolean z8() {
      this.j5();
      return this.n5.k5(1);
   }

   public z7(com.aspose.slides.internal.x6s.a6 var1, String var2, s3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("navigator");
      }

      if (var2 == null) {
         throw new ArgumentNullException("baseUri");
      }

      this.u3 = null;
      this.a6 = var2;
      this.u9 = new com.aspose.slides.internal.r5d.n5(var1.l6());
      this.n5 = var1;
      this.k5 = new p8(this.n5, var3);
      this.l6 = com.aspose.slides.ms.System.Xml.o5.n5(this.n5);
      this.j5();
      if (this.n3() == 0) {
         this.n5.t4();
      }
   }

   public z7(com.aspose.slides.internal.x6s.a6 var1) {
      this(var1, var1.t2(), null);
   }

   public final void j5() {
   }
}
