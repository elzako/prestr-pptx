package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.Collection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public abstract class r4 implements com.aspose.slides.internal.j3.z8, com.aspose.slides.internal.n1.k5 {
   private r4 n5;
   private r4 l6;
   private r4 k5;
   private List<r4$n5> u3;
   private final Object a6 = new Object();
   private final Collection<com.aspose.slides.internal.s4.k5> u9;
   private final Object h0 = new Object();

   public r4() {
      this.u9 = new Collection<>();
   }

   public r4(z1 var1) {
      if (var1 == null) {
         throw new ArgumentException();
      }

      this.u9 = new Collection<>();
      this.n5 = var1;
   }

   @Override
   public abstract String h0();

   @Override
   public String c8() {
      return null;
   }

   @Override
   public void l6(String var1) {
   }

   @Override
   public abstract byte n3();

   public final r4 y2() {
      return this.n5;
   }

   @Override
   public final com.aspose.slides.internal.j3.j5 y1() {
      return new u9(this);
   }

   public final r4 a0() {
      return this.l6;
   }

   public final r4 d2() {
      return this.w1();
   }

   public final r4 d5() {
      r4 var1 = this.y2();
      if (var1 == null) {
         return null;
      }

      r4 var2 = var1.a0();

      while (var2 != null) {
         r4 var3 = var2.s3();
         if (var3 == this) {
            return var2;
         }

         var2 = var3;
      }

      return var2;
   }

   public final r4 s3() {
      return this.y2() != null ? this.k5 : null;
   }

   @Override
   public com.aspose.slides.internal.j3.u3 A_() {
      return null;
   }

   public z1 y4() {
      return this.y2().y4();
   }

   @Override
   public final com.aspose.slides.internal.j3.z8 n5(com.aspose.slides.internal.j3.z8 var1, com.aspose.slides.internal.j3.z8 var2) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(var1, r4.class), com.aspose.slides.internal.v6g.k5.n5(var2, r4.class));
   }

   public final r4 n5(r4 var1, r4 var2) {
      if (this == var1 || this.u3(var1)) {
         throw new ArgumentException();
      }

      if (var2 == null) {
         return this.k5(var1);
      }

      if (var2.y2() != this) {
         throw new ArgumentException();
      }

      if (var1 == var2) {
         return var1;
      }

      z1 var3 = var1.y4();
      z1 var4 = this.y4();
      if (var3 != null && var3 != var4) {
         throw new ArgumentException();
      }

      if (var1.y2() != null) {
         var1.y2().l6(var1);
      }

      if (var2 == this.a0()) {
         this.l6 = var1;
         var1.k5 = var2;
         var1.a6(this);
      } else {
         r4 var5 = var2.d5();
         var1.k5 = var2;
         var5.k5 = var1;
         var1.a6(this);
      }

      return var1;
   }

   @Override
   public final com.aspose.slides.internal.j3.z8 l6(com.aspose.slides.internal.j3.z8 var1, com.aspose.slides.internal.j3.z8 var2) {
      return this.l6(com.aspose.slides.internal.v6g.k5.n5(var1, r4.class), com.aspose.slides.internal.v6g.k5.n5(var2, r4.class));
   }

   public final r4 l6(r4 var1, r4 var2) {
      if (this == var1 || this.u3(var1)) {
         throw new ArgumentException();
      }

      if (var2 == null) {
         return this.k5(var1);
      }

      if (var2.y2() != this) {
         throw new ArgumentException();
      }

      if (var1 == var2) {
         return var1;
      }

      z1 var3 = var1.y4();
      z1 var4 = this.y4();
      if (var3 != null && var3 != var4) {
         throw new ArgumentException();
      }

      if (var1.y2() != null) {
         var1.y2().l6(var1);
      }

      if (var2 == this.w1()) {
         var2.k5 = var1;
         var1.k5 = null;
         this.n5(var1);
         var1.a6(this);
      } else {
         r4 var5 = var2.k5;
         var2.k5 = var1;
         var1.k5 = var5;
         var1.a6(this);
      }

      return var1;
   }

   @Override
   public final com.aspose.slides.internal.j3.z8 k5(com.aspose.slides.internal.j3.z8 var1, com.aspose.slides.internal.j3.z8 var2) {
      return this.k5(com.aspose.slides.internal.v6g.k5.n5(var1, r4.class), com.aspose.slides.internal.v6g.k5.n5(var2, r4.class));
   }

   public final r4 k5(r4 var1, r4 var2) {
      r4 var3 = var2.s3();
      this.l6(var2);
      this.n5(var1, var3);
      return var2;
   }

   @Override
   public final com.aspose.slides.internal.j3.z8 l6(com.aspose.slides.internal.j3.z8 var1) {
      return this.l6(com.aspose.slides.internal.v6g.k5.n5(var1, r4.class));
   }

   public final r4 l6(r4 var1) {
      if (var1.y2() != this) {
         throw new ArgumentException();
      }

      if (var1 == this.a0()) {
         if (var1 == this.w1()) {
            this.l6 = null;
            this.n5((r4)null);
         } else {
            this.l6 = var1.k5;
         }
      } else if (var1 == this.w1()) {
         r4 var2 = var1.d5();
         var2.k5 = null;
         this.n5(var2);
      } else if (var1.d5() != null) {
         r4 var3 = var1.d5();
         var3.k5 = var1.k5;
      }

      var1.k5 = null;
      var1.a6((r4)null);
      return var1;
   }

   @Override
   public final com.aspose.slides.internal.j3.z8 k5(com.aspose.slides.internal.j3.z8 var1) {
      return this.k5(com.aspose.slides.internal.v6g.k5.n5(var1, r4.class));
   }

   public final r4 u3(com.aspose.slides.internal.j3.z8 var1) {
      return this.k5(com.aspose.slides.internal.v6g.k5.n5(var1, r4.class));
   }

   public final r4 k5(r4 var1) {
      if (this != var1 && !this.u3(var1)) {
         if (var1.y2() != null) {
            var1.y2().l6(var1);
         }

         com.aspose.slides.internal.j3.z1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, z1.class);
         z1 var3 = this.y4();
         if (var2 != null && var2 != var3) {
            throw new ArgumentException();
         }

         r4 var4 = this.w1();
         if (var4 == null) {
            var1.k5 = null;
            this.l6 = var1;
            this.n5(var1);
            var1.a6(this);
         } else {
            var1.k5 = null;
            var4.k5 = var1;
            this.n5(var1);
            var1.a6(this);
         }

         return var1;
      } else {
         throw new ArgumentException();
      }
   }

   @Override
   public final boolean p8() {
      return this.w1() != null;
   }

   @Override
   public abstract com.aspose.slides.internal.j3.z8 l6(boolean var1);

   @Override
   public void f2() {
      throw new NotImplementedException();
   }

   @Override
   public final boolean h0(String var1, String var2) {
      return this.y4().h0(var1, var2);
   }

   @Override
   public String s7() {
      return null;
   }

   @Override
   public String x8() {
      return null;
   }

   @Override
   public void k5(String var1) {
   }

   @Override
   public String t2() {
      return null;
   }

   @Override
   public final boolean i1() {
      return this.A_() != null && this.A_().n5() != 0;
   }

   @Override
   public String j5() {
      return this.y4().j5();
   }

   @Override
   public final short a6(com.aspose.slides.internal.j3.z8 var1) {
      throw new NotImplementedException();
   }

   @Override
   public String e5() {
      if (this.n3() != 8 && this.n3() != 7) {
         if (this.n3() != 9 && this.n3() != 10 && this.n3() != 12) {
            r4 var1 = this.a0();
            if (var1 == null) {
               return d1.n5;
            }

            a5 var2 = new a5();

            while (var1 != null) {
               if (var1.n3() == 4 || var1.n3() == 3 || var1.n3() == 1) {
                  var2.n5(var1.e5());
               }

               var1 = var1.s3();
            }

            return var2.toString();
         } else {
            return null;
         }
      } else {
         return this.c8();
      }
   }

   @Override
   public void t9(String var1) {
      r4 var2 = this.a0();
      if (var2 != null && var2.s3() == null && var2.n3() == 3) {
         var2.t9(var1);
      } else {
         this.b3();
         this.u3(this.y4().u9(var1));
      }
   }

   @Override
   public boolean u9(com.aspose.slides.internal.j3.z8 var1) {
      return j8.l6(this, var1);
   }

   @Override
   public final String z1(String var1) {
      return this.y4().u3().l6(var1);
   }

   @Override
   public final boolean t4(String var1) {
      return d1.a6(this.y4().u3().l6(), var1);
   }

   @Override
   public final String q0(String var1) {
      return this.y4().u3().n5(var1);
   }

   @Override
   public final boolean h0(com.aspose.slides.internal.j3.z8 var1) {
      return this.u9(var1);
   }

   @Override
   public final Object c8(String var1, String var2) {
      return this.y4().c8(var1, var2);
   }

   @Override
   public final Object n5(String var1, Object var2, com.aspose.slides.internal.j3.y1 var3) {
      int var4 = this.n5(var1);
      if (var4 == -1) {
         this.o0().addItem(new r4$n5(var1, var2, var3));
         return null;
      } else {
         r4$n5 var5 = this.o0().get_Item(var4);
         this.o0().set_Item(var4, new r4$n5(var1, var2, var3));
         return var5.l6();
      }
   }

   @Override
   public final Object z3(String var1) {
      int var2 = this.n5(var1);
      return var2 != -1 ? this.o0().get_Item(var2).l6() : null;
   }

   public r4 w1() {
      return null;
   }

   public void n5(r4 var1) {
   }

   public final boolean u3(r4 var1) {
      for (r4 var2 = this.y2(); var2 != null; var2 = var2.y2()) {
         if (var2 == var1) {
            return true;
         }
      }

      return false;
   }

   public void a6(r4 var1) {
      this.n5 = var1;
   }

   public final void b3() {
      r4 var1 = this.a0();

      while (var1 != null) {
         r4 var2 = var1.s3();
         this.l6(var1);
         var1 = var2;
      }
   }

   protected final List<r4$n5> o0() {
      if (this.u3 == null) {
         synchronized (this.a6) {
            if (this.u3 == null) {
               this.u3 = new List<>();
            }
         }
      }

      return this.u3;
   }

   private int n5(String var1) {
      return this.o0().findIndex(new r4$1(this, var1));
   }

   public static void n5(String var0, String[] var1, String[] var2) {
      int var3 = d1.u3(var0, ':');
      if (-1 != var3 && var3 != 0 && var0.length() - 1 != var3) {
         var1[0] = d1.l6(var0, 0, var3);
         var2[0] = d1.k5(var0, var3 + 1);
      } else {
         var1[0] = d1.n5;
         var2[0] = var0;
      }
   }

   @Override
   public String toString() {
      return d1.n5("{0}, Value=\"{1}\"",new Object[]{ this.h0(), this.c8()});
   }

   public boolean n5(com.aspose.slides.internal.n1.n5 var1) {
      com.aspose.slides.internal.s4.l6 var2 = new com.aspose.slides.internal.s4.l6(this, (com.aspose.slides.internal.s4.n5)var1, 2);
      var2.u3();
      return !var2.k5();
   }

   public final IGenericCollection<com.aspose.slides.internal.n1.l6> n5(com.aspose.slides.internal.n1.n5 var1, int var2) {
      synchronized (this.h0) {
         Collection var4 = new Collection();
         IGenericEnumerator var5 = this.u9.iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.s4.k5 var6 = (com.aspose.slides.internal.s4.k5)var5.next();
               if (d1.a6(var6.n5(), var1.n5()) && (var2 == 2 || var6.k5() && var2 == 1 || !var6.k5() && var2 == 0)) {
                  var4.addItem(var6.l6());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         return var4;
      }
   }

   public final boolean l6(com.aspose.slides.internal.n1.n5 var1) {
      synchronized (this.h0) {
         IGenericEnumerator var3 = this.u9.iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.s4.k5 var4 = (com.aspose.slides.internal.s4.k5)var3.next();
               if (d1.a6(var4.n5(), var1.n5())) {
                  return true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         return false;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z1 c4() {
      return this.y4();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 z7() {
      return this.s3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 v4() {
      return this.d5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 u6() {
      return this.d2();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 t1() {
      return this.a0();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 a5() {
      return this.y2();
   }

}
