package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.ArgumentException;

public class p8 extends n1 {
   private v4 n5 = new v4();
   private y2 l6;
   private f2 k5;
   private i1 u3;
   private c4 a6;
   private o0 u9;
   private d2 h0;
   private s3 c8;
   private d5 t2;
   private e5 s7;
   private u6 x8;
   private y1 n3;

   p8() {
      this.k5 = new f2();
      this.u3 = new i1();
      this.a6 = new c4();
      this.t2 = new d5();
      this.s7 = new e5();
      this.x8 = new u6();
   }

   p8(int var1, String var2) {
      this.n5.n5(1L);
      this.k5 = new f2();
      this.u3 = new i1();
      this.a6 = new c4();
      this.a6.n5(var1);
      this.u9 = new o0(this.a6.l6() & 65535);
      this.u9.n5(var2);
      this.h0 = new d2(this.a6.l6() & 65535);
      this.h0.n5("");
      this.h0.l6("");
      this.c8 = new s3(this.a6.l6() & 65535);
      this.c8.n5("");
      this.c8.l6("");
      this.t2 = new d5();
      this.s7 = new e5();
      this.x8 = new u6();
      this.x8.n5(8L);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5.n5(var1);
      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 74) {
         this.l6 = new y2();
         this.l6.n5(var1);
      }

      this.k5.n5(var1);
      this.u3.n5(var1);
      this.a6.n5(var1);

      try {
         com.aspose.slides.internal.n2d.x8.n5(this.a6.l6() & 65535);
      } catch (UnsupportedOperationException var3) {
         this.a6.n5(com.aspose.slides.internal.l7h.j5.u9().t9() & 65535);
      } catch (ArgumentException var4) {
         this.a6.n5(com.aspose.slides.internal.l7h.j5.u9().t9() & 65535);
      }

      this.u9 = new o0(this.a6.l6() & 65535);
      this.u9.n5(var1);
      this.h0 = new d2(this.a6.l6() & 65535);
      this.h0.n5(var1);
      this.c8 = new s3(this.a6.l6() & 65535);
      this.c8.n5(var1);
      this.t2.n5(var1);
      this.s7.n5(var1);
      this.x8.n5(var1);
      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 12) {
         this.n3 = new y1(this.a6.l6() & 65535);
         this.n3.n5(var1);
      }
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
      if (this.l6 != null) {
         this.l6.n5(var1);
      }

      this.k5.n5(var1);
      this.u3.n5(var1);
      this.a6.n5(var1);
      this.u9.n5(var1);
      this.h0.n5(var1);
      this.c8.n5(var1);
      this.t2.n5(var1);
      this.s7.n5(var1);
      this.x8.n5(var1);
      if (this.n3 != null) {
         this.n3.n5(var1);
      }
   }

   final c4 n5() {
      return this.a6;
   }

   public final o0 l6() {
      return this.u9;
   }
}
