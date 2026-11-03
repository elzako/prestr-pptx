package com.aspose.slides.internal.l9a;

import com.aspose.slides.internal.b8u.q0;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.m1;
import com.aspose.slides.internal.r1x.o0;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import java.awt.image.BufferedImage;

public class k5 implements q0 {
   private v4 n5;
   private com.aspose.slides.internal.b7s.q0 l6;
   private BufferedImage k5;
   private d2 u3;
   private com.aspose.slides.internal.l3e.l6 a6;
   private int u9;
   private j5 h0 = new j5();
   private m1 c8;

   public void n5(v4 var1, com.aspose.slides.internal.b7s.q0 var2, BufferedImage var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public k5(com.aspose.slides.internal.a4s.n5 var1, d2 var2) {
      this.n5(var1, var2);
   }

   public k5(com.aspose.slides.internal.l3e.u3 var1, d2 var2) {
      this.n5(var1, var2);
   }

   public k5(com.aspose.slides.internal.l3e.u9 var1, d2 var2) {
      this.n5(var1, var2);
   }

   public final m1 n5() {
      return this.c8;
   }

   public final void n5(m1 var1) {
      this.c8 = var1;
   }

   @Override
   public final boolean a0() {
      int var1 = this.a6.t2();
      return var1 != 5;
   }

   public final int l6() {
      return this.u9;
   }

   @Override
   public void l6(y2 var1, x8 var2) {
      n5 var3 = new n5(var2);
      z6 var4 = new z6();
      var4.n5(this.n5);
      var4.k5(var1.t2() * this.n5.z3());
      this.n5(var1.n3(), var4, var3);
   }

   @Override
   public void n5(y2 var1, z6 var2, t9 var3) {
      m1 var4 = this.n5();
      if (this.l6() == 2) {
         com.aspose.slides.internal.p6r.l6 var5 = new com.aspose.slides.internal.p6r.l6(
            (com.aspose.slides.internal.l3e.u3)this.a6, var3, var2, var4, this.u3, this.l6, this.k5
         );
         o0.n5(var1.n3(), var5);
      } else if (this.l6() == 3) {
         com.aspose.slides.internal.p6r.k5 var6 = new com.aspose.slides.internal.p6r.k5(
            (com.aspose.slides.internal.l3e.u9)this.a6, var3, var2, var4, this.u3, this.l6, this.k5
         );
         o0.n5(var1.n3(), var6);
      } else {
         com.aspose.slides.internal.p6r.u3 var7 = new com.aspose.slides.internal.p6r.u3(
            (com.aspose.slides.internal.a4s.n5)this.a6, var3, var2, var4, this.u3, this.l6, this.k5
         );
         var7.n5(var1.n3());
      }
   }

   private void n5(com.aspose.slides.internal.l3e.l6 var1, d2 var2) {
      this.a6 = var1;
      this.u3 = var2;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.l3e.u3.class)) {
         this.u9 = 2;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.l3e.u9.class)) {
         this.u9 = 3;
      } else {
         this.u9 = 0;
      }
   }
}
