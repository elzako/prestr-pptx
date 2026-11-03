package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class u3 extends n5 {
   protected y2 u3;
   protected List<y2> a6;
   protected com.aspose.slides.internal.r4.h0<com.aspose.slides.internal.e5.t2> u9;
   private Dictionary<String, com.aspose.slides.internal.v4.j5> t2;
   private boolean s7;
   public y2 h0;
   protected com.aspose.slides.internal.r4.h0<y2> c8;
   private int x8 = -1;
   private int n3 = Integer.MAX_VALUE;

   public u3() {
   }

   public u3(com.aspose.slides.internal.e5.t9 var1) {
      super(var1);
      if (var1 == null) {
         throw new InvalidOperationException("Null formatting object found.");
      }

      this.t2 = var1.c4();
      this.u9 = var1.x8();
      this.c8 = new u6(this);
   }

   @Override
   public void n5(y2 var1) {
      this.u3 = var1;
   }

   @Override
   public y2 h0() {
      return this.u3;
   }

   @Override
   public void t4() {
   }

   public final y2 q0() {
      if (this.h0 != null && !this.h0.m3()) {
         return this.h0;
      } else if (this.c8.l6()) {
         this.h0 = this.c8.k5();
         this.h0.t4();
         return this.h0;
      } else {
         return null;
      }
   }

   protected final void l6(y2 var1) {
      this.h0 = var1;
      this.c8 = new u6(this);

      do {
         this.h0 = this.c8.k5();
      } while (this.h0 != var1);
   }

   public final boolean z3() {
      return this.c8.l6();
   }

   protected final y2 m1() {
      return this.c8.k5();
   }

   protected final y2 k7() {
      return this.c8.a6();
   }

   @Override
   public boolean m3() {
      return this.s7;
   }

   public void k5(boolean var1) {
      this.s7 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.k5(true);
      return null;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return null;
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      return null;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
   }

   protected final List<y2> n5(int var1) {
      if (this.u9 == null) {
         return null;
      }

      List var2 = new List(var1);

      while (this.u9.l6() && var2.size() < var1) {
         Object var3 = this.u9.k5();
         if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.e5.t2.class)) {
            com.aspose.slides.internal.e5.t2 var4 = (com.aspose.slides.internal.e5.t2)var3;
            if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.v4.s3.class)) {
               var4 = this.z8().n5((com.aspose.slides.internal.v4.s3)var4);
            }

            if (var4 != null) {
               this.z8().y1().n5(var4, var2);
               List$Enumerator var5 = var2.iterator();

               try {
                  while (var5.hasNext()) {
                     u3 var6 = (u3)var5.next();
                     com.aspose.slides.internal.x9.t9 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.x9.t9.class);
                     if (var7 != null) {
                        var7.s7 = this;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         }
      }

      return var2;
   }

   @Override
   public e9 z8() {
      return this.u3.z8();
   }

   public x9 j5() {
      return this.z8().j5();
   }

   public final o5 w1() {
      return this.z8().j5().l6();
   }

   @Override
   public boolean l6(int var1) {
      List var2 = this.n5(var1 + 1 - this.a6.size());
      this.a_(var2);
      return var1 < this.a6.size();
   }

   @Override
   public List<y2> r4() {
      if (this.a6 == null) {
         this.a6 = new List<>(10);
      }

      return this.a6;
   }

   @Override
   public void k5(y2 var1) {
      if (var1 != null) {
         var1.n5(this);
         if (this.a6 == null) {
            this.a6 = new List<>(10);
         }

         this.a6.addItem(var1);
      }
   }

   public void a_(List<y2> var1) {
      if (var1 != null && var1.size() != 0) {
         List$Enumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               y2 var3 = (y2)var2.next();
               this.k5(var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public j8 n5(j8 var1) {
      if (var1.a6() >= 0) {
         throw new InvalidOperationException("Position already got its index");
      }

      var1.k5(++this.x8);
      return var1;
   }

   private static void u9(j8 var0) {
      if (var0 == null || var0.a6() < 0) {
         throw new ArgumentException("Only non-null Positions with an index can be checked");
      }
   }

   public final boolean l6(j8 var1) {
      u9(var1);
      if (var1.a6() == this.n3) {
         return true;
      } else if (var1.a6() < this.n3) {
         this.n3 = var1.a6();
         return true;
      } else {
         return false;
      }
   }

   public final boolean k5(j8 var1) {
      u9(var1);
      return var1.a6() == this.x8 && this.m3();
   }

   protected final void n5(com.aspose.slides.internal.a0.h0 var1) {
      Dictionary var2 = this.k5.f2();
      var1.l6(var2);
   }

   protected final void l6(com.aspose.slides.internal.a0.h0 var1) {
      if (this.k5.p8()) {
         var1.n5(this.k5.s3());
      }
   }

   protected final void k5(com.aspose.slides.internal.a0.h0 var1) {
      this.n5(var1);
      this.l6(var1);
   }

   public final void n5(boolean var1, boolean var2, boolean var3) {
      if (this.t2 != null) {
         this.w1().n5(this.t2, var1, var2, var3);
      }
   }

   public void c4() {
      if (this.k5 != null) {
         this.z8().k5(this.k5.y1());
      }
   }

   protected final void y2() {
      if (this.k5 != null) {
         this.z8().a6(this.k5.y1());
      }
   }

   public final void u3(j8 var1) {
      if (var1 != null && var1.u3() == this && this.k5(var1)) {
         this.y2();
         this.a6 = null;
         this.h0 = null;
         this.c8 = null;
         this.t2 = null;
         y2 var2 = this.u3;

         while (!com.aspose.slides.internal.v6g.k5.l6(var2, z8.class) && !com.aspose.slides.internal.v6g.k5.l6(var2, e9.class)) {
            var2 = var2.h0();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, z8.class)) {
            this.k5.y2();
            this.u9 = null;
         }
      }
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{
         super.toString(), this.k5 != null ? com.aspose.slides.ms.System.d1.n5(new String[]{"{fobj = ", this.k5.toString(), "}"}) : com.aspose.slides.ms.System.d1.n5
      });
   }

   @Override
   public void t9() {
      this.s7 = false;
      this.h0 = null;
      this.c8 = new u6(this);
      List$Enumerator var1 = this.r4().iterator();

      try {
         while (var1.hasNext()) {
            y2 var2 = (y2)var1.next();
            var2.t9();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      if (this.k5 != null) {
         this.t2 = this.k5.c4();
      }

      this.x8 = -1;
   }
}
