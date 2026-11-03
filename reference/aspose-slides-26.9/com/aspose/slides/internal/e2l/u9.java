package com.aspose.slides.internal.e2l;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.m3;
import com.aspose.slides.internal.y5s.n3;
import com.aspose.slides.internal.y5s.t2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public final class u9 extends m3 {
   private final u3 n5;
   private final List<h0> l6 = new List<>();
   private com.aspose.slides.internal.v2x.k5 k5;
   private boolean u3;

   public u9(u3 var1, h0[] var2, com.aspose.slides.internal.j3b.u3 var3, boolean var4, com.aspose.slides.internal.v2x.k5 var5) {
      super(var3);
      this.n5 = var1;

      for (int var6 = 0; var6 < var2.length; var6++) {
         h0 var7 = var2[var6];
         n3 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, n3.class);
         if (var8 != null) {
            var8.n5(this);
         }
      }

      this.l6.addRange(com.aspose.slides.ms.System.u3.n5(var2));
      this.u3 = var4;
      this.k5 = var5;
      this.n5(new u9$n5(this));
   }

   @Override
   public int t9() {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5.l6(), 8);
   }

   @Override
   public int n3() {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 8);
   }

   public h0[] q0() {
      return this.l6.toArray(new h0[0]);
   }

   @Override
   public int t4() {
      int var1 = 0;
      if (this.y4() != null && com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(), 6) < this.y4().n5()) {
         var1 = this.y4().l6(com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(), 6));
      }

      return var1;
   }

   @Override
   public final boolean u3() {
      h0[] var1 = this.q0();
      boolean var2 = true;

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1[var3], t2.class)) {
            var2 = com.aspose.slides.internal.v6g.k5.n5(var1[var3], t2.class).u3();
            if (!var2) {
               break;
            }
         }
      }

      return var2;
   }

   @Override
   public boolean z3() {
      return this.k5.z3();
   }

   @Override
   public void n5(boolean var1) {
      this.k5.n5(var1);
   }

   @Override
   public boolean z1() {
      return this.t4() != 0;
   }

   @Override
   public final void a6() {
      h0[] var1 = this.q0();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1[var2], t2.class)) {
            com.aspose.slides.internal.v6g.k5.n5(var1[var2], t2.class).a6();
         }
      }
   }

   public void k7() {
      this.t2();
      this.l6.clear();
      this.k5 = null;
   }

   public void n5(int var1, h0 var2) {
      this.t2();
      if (var2 == null) {
         throw new ArgumentNullException("block");
      }

      n3 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, n3.class);
      if (var3 != null && var3.x8() != null && var3.x8() != this) {
         throw new ArgumentOutOfRangeException("block", "The block belongs to other image and cannot be inserted into this GIF image.");
      }

      this.l6.insertItem(var1, var2);
      if (var3 != null) {
         var3.n5(this);
      }
   }

   public void n5(h0 var1) {
      this.t2();
      if (var1 == null) {
         throw new ArgumentNullException("block");
      }

      n3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, n3.class);
      if (var2 != null && var2.x8() != null && var2.x8() != this) {
         throw new ArgumentOutOfRangeException("block", "The block belongs to other image and cannot be added to this GIF image.");
      }

      this.l6.addItem(var1);
      if (var2 != null) {
         var2.n5(this);
      }
   }

   @Override
   protected void l6(t4 var1) {
      this.t2();
      a0 var2 = new a0(var1);

      try {
         this.n5.n5(var2);
         if (this.y4() != null) {
            a6.n5(var2, this.y4());
         }

         List$Enumerator var3 = this.l6.iterator();

         try {
            while (var3.hasNext()) {
               h0 var4 = (h0)var3.next();
               var4.n5(var2.l6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         if (this.u3) {
            var2.n5((byte)59);
         }

         var2.l6(var2.n5());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void n5(j5 var1, int[] var2) {
      if (this.k5 == null) {
         throw new com.aspose.slides.internal.g9t.n5("Cannot save pixels as no active GIF frame exists. Select an active frame first.");
      }

      this.k5.l6(var1.n3(), var2);
   }

   @Override
   protected void l6(com.aspose.slides.internal.j3b.u3 var1, com.aspose.slides.internal.j3b.u3 var2) {
      if (var2 != null
         && var2.n5() != 2
         && var2.n5() != 4
         && var2.n5() != 8
         && var2.n5() != 16
         && var2.n5() != 32
         && var2.n5() != 64
         && var2.n5() != 128
         && var2.n5() != 256) {
         throw new com.aspose.slides.internal.g9t.n5(
            "The color palette cannot be changed as palette specified should contain entries count equal to power of 2. Minimal palette size is 2, maximal is 256."
         );
      }

      super.l6(var1, var2);
   }

   @Override
   protected void n5(com.aspose.slides.internal.j3b.u3 var1, com.aspose.slides.internal.j3b.u3 var2) {
      this.n5.n5(var2 != null);
      if (var2 != null) {
         this.n5.n5(var2.n5());
      }

      super.n5(var1, var2);
   }

   @Override
   protected void u9() {
      List$Enumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            h0 var2 = (h0)var1.next();
            IDisposable var3 = com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class);
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.l6.clear();
      this.k5 = null;
      super.u9();
   }

   public u3 m3() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v2x.k5 n5(u9 var0) {
      return var0.k5;
   }
}
