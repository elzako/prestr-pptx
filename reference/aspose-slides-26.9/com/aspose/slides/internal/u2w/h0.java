package com.aspose.slides.internal.u2w;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public final class h0 extends f0 {
   private final List<u9> y4 = new List<>();
   private int e2 = 18761;
   private u9 t9;

   public h0(u9[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("frames");
      }

      if (var1.length > 0) {
         this.n5(var1);
         this.n5(var1[0]);
         this.e2 = this.e5().e5().q0();
      }

      this.n5(new h0$n5(this));
   }

   @Override
   public boolean d5() {
      return this.e5().d5();
   }

   @Override
   public boolean d2() {
      return this.e5().d2();
   }

   @Override
   public boolean m3() {
      return this.e5().e5().y4();
   }

   public final int k7() {
      this.s7();
      return this.e2;
   }

   @Override
   public com.aspose.slides.internal.o9b.c8 z3() {
      return this.e5().z3();
   }

   public final u9 e5() {
      this.s7();
      if (this.t9 == null) {
         throw new com.aspose.slides.internal.h6t.u3("There is no active frame selected.");
      } else {
         return this.t9;
      }
   }

   public final void n5(u9 var1) {
      this.s7();
      if (var1 != null && var1.n3() != this) {
         throw new com.aspose.slides.internal.h6t.u3("The active frame cannot be set as it belongs to another image.");
      }

      this.t9 = var1;
   }

   public final u9[] b3() {
      this.s7();
      u9[] var1 = new u9[this.y4.size()];
      this.y4.copyToTArray(var1, 0);
      return var1;
   }

   @Override
   public int y4() {
      this.s7();
      return this.e5().y4();
   }

   @Override
   public int z1() {
      this.s7();
      return this.e5().z1();
   }

   @Override
   public final boolean l6() {
      u9[] var1 = this.b3();
      boolean var2 = true;

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2 = var1[var3].l6();
         if (!var2) {
            break;
         }
      }

      return var2;
   }

   @Override
   public com.aspose.slides.internal.t6q.s7 w1() {
      return this.t9.w1();
   }

   @Override
   public void n5(com.aspose.slides.internal.t6q.s7 var1) {
      this.t9.n5(var1);
   }

   @Override
   public final void u3() {
      synchronized (this.t2) {
         try {
            this.u9();
            u9[] var2 = this.b3();

            for (int var3 = 0; var3 < var2.length; var3++) {
               var2[var3].u3();
            }
         } finally {
            this.h0();
         }
      }
   }

   public final void n5(u9[] var1) {
      this.s7();
      if (var1 == null) {
         throw new com.aspose.slides.internal.h6t.u3("Frames parameter is null");
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == null) {
            throw new com.aspose.slides.internal.h6t.u3("Frame is null or not TiffFrame type");
         }

         if (var1[var2].n3() != this && var1[var2].n3() != null) {
            throw new com.aspose.slides.internal.h6t.u3("Frame belongs to other image");
         }
      }

      for (u9 var5 : var1) {
         var5.n5(this);
      }

      this.y4.addRange(com.aspose.slides.ms.System.u3.n5(var1));
   }

   @Override
   protected void l6(t4 var1) {
      this.s7();
      this.i1();
      v3 var2 = new v3(var1);

      try {
         com.aspose.slides.internal.v6s.a6 var3 = com.aspose.slides.internal.v6s.k5.n5(var2, this.e2);
         this.n5(var3);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void a6() {
      this.s7();
      List$Enumerator var1 = this.y4.iterator();

      try {
         while (var1.hasNext()) {
            u9 var2 = (u9)var1.next();
            var2.dispose();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.y4.clear();
      this.t9 = null;
      super.a6();
   }

   @Override
   protected void n5(y2 var1, int[] var2) {
      this.s7();
      this.e5().l6(var1.n3(), var2);
   }

   private void n5(com.aspose.slides.internal.v6s.a6 var1) {
      this.s7();
      var1.n5(0L);
      com.aspose.slides.internal.u2w.s7.n5(var1);

      for (int var2 = 0; var2 < this.y4.size(); var2++) {
         u9 var3 = this.y4.get_Item(var2);
         com.aspose.slides.internal.u2w.u9.n5(var3, var1, var2 == this.y4.size() - 1, var3.e5(), var3.b3(), var3.w1(), var3.x8().n3());
      }
   }

   // $VF: synthetic method
   static u9 n5(h0 var0) {
      return var0.t9;
   }

   // $VF: synthetic method
   static void l6(h0 var0) {
      var0.s7();
   }

   // $VF: synthetic method
   static void k5(h0 var0) {
      var0.s7();
   }
}
