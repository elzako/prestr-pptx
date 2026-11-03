package com.aspose.slides.internal.z4;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;

public class s7 {
   private boolean n5;
   private t4 l6;
   private boolean k5;
   private com.aspose.slides.internal.b8.u9 u3 = new com.aspose.slides.internal.b8.u9();
   private byte[] a6;
   private q0 u9;
   private u9 h0;
   private j5 c8;
   private c8 t2;
   private a6 s7;
   private com.aspose.slides.internal.d0.l6 x8;

   public s7(com.aspose.slides.internal.z0k.t4 var1, k7 var2) {
      this.n5(var1, var2, false);
   }

   public final void n5() {
      if (!this.n5) {
         this.s7.n5(this.l6);
         this.u9.n5(this.l6);
         this.h0.n5(this.l6);
         int var1 = this.l6.k5();
         this.n5(var1);
         this.l6.k5("%%EOF");
         if (this.k5) {
            this.l6.a6();
         }

         this.n5 = true;
      }
   }

   public final void n5(float var1, float var2) {
      if (this.c8 != null) {
         throw new InvalidOperationException("Cannot start a new page while another page is not finished.");
      }

      this.c8 = new j5(this.t2, var1, var2);
      this.h0.n5().n5(this.c8.t2());
      this.e2();
      this.t9();
   }

   public final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      this.n5(var1.l6(), var1.k5());
   }

   public final void l6() {
      if (this.c8 == null) {
         throw new InvalidOperationException("No page to end.");
      }

      this.c8.k5();
      this.c8.n5(this.l6);
      this.c8 = null;
   }

   private void e2() {
      if (this.t2.l6().z1()) {
         if (this.h0.n5().n5() == 1) {
            this.x8 = new com.aspose.slides.internal.d0.l6(this.t2, this.z1());
            this.x8.n5(this.l6);
         }
      }
   }

   private void t9() {
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, k7 var2, boolean var3) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var2 == null) {
         throw new ArgumentNullException("options");
      }

      var2.n5();
      this.k5 = var3;
      this.t2 = new c8(this, var2);
      this.l6 = new t4(var1);
      this.s7 = new a6();
      this.u9 = new q0(this.t2);
      this.h0 = new u9(this.t2);
      if (this.t2.e2()) {
         if (var2.x8() != 3 && var2.x8() != 4) {
            this.l6.k5("%PDF-1.7");
         } else {
            this.l6.k5("%PDF-1.4");
         }
      } else if (this.t2.l6().x8() == 0) {
         this.l6.k5("%PDF-1.5");
      } else if (this.t2.l6().x8() == 1) {
         this.l6.k5("%PDF-1.6");
      } else {
         this.l6.k5("%PDF-1.7");
      }

      this.l6.k5("%µµµµ");
   }

   private void n5(int var1) {
      this.l6.k5("trailer");
      this.l6.c8();
      this.l6.n5("/Size", this.l6.n5());
      this.l6.k5("/Info", this.u9.t2());
      this.l6.k5("/Root", this.h0.t2());
      if (this.t2.l6().z1()) {
         this.l6.k5("/Encrypt", this.x8.t2());
      }

      if (this.t2.e2() || this.t2.l6().z1()) {
         this.l6.k5("/ID", d1.n5("[<{0}><{0}>]", new Object[]{com.aspose.slides.internal.n2d.t4.n5(this.z1())}));
      }

      this.l6.t2();
      this.l6.h0();
      this.l6.k5("startxref");
      this.l6.k5(com.aspose.slides.internal.t6j.u3.n5(var1));
   }

   private byte[] z1() {
      if (this.a6 != null) {
         return this.a6;
      }

      String var1 = d1.n5(
         "{0}/{1}/{2}/{3}/{4}/{5}/{6}/{7}",new Object[]{
         this.u3.k5(),
         this.u3.a6(),
         this.u3.u9(),
         this.u3.n5(),
         this.u3.u3(),
         this.u3.l6(),
         com.aspose.slides.internal.t6j.u3.n5(this.u3.n3().m3()),
         com.aspose.slides.internal.t6j.u3.n5(this.u3.y4().m3())
      });
      com.aspose.slides.internal.h3k.h0 var2 = new com.aspose.slides.internal.h3k.h0();

      try {
         this.a6 = var2.l6(com.aspose.slides.internal.l7h.j5.z3().u3(var1));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return this.a6;
   }

   public final com.aspose.slides.internal.b8.u9 k5() {
      return this.u3;
   }

   public final com.aspose.slides.internal.d0.l6 u3() {
      return this.x8;
   }

   public final void n5(String var1) {
      this.h0.n5(var1);
   }

   public final c8 a6() {
      return this.t2;
   }

   public final com.aspose.slides.internal.f6.n5 u9() {
      return this.h0.u3();
   }

   public final j5 h0() {
      return this.c8;
   }

   public final y1 c8() {
      return this.n3().l6();
   }

   public final m1 t2() {
      return this.n3().k5();
   }

   public final a6 s7() {
      return this.s7;
   }

   public final m3 x8() {
      return this.h0.l6();
   }

   public final w1 n3() {
      return this.h0.n5();
   }

   public final com.aspose.slides.internal.e6r.t2 y4() {
      return this.h0.k5();
   }
}
