package com.aspose.slides.internal.c3;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.internal.f5.c8$n5$n5;
import com.aspose.slides.ms.System.IDisposable;

public class u9 {
   private l4 n5;
   private com.aspose.slides.internal.f5.k5 l6;
   private com.aspose.slides.internal.j3.z1 k5;
   private com.aspose.slides.internal.f5.z3 u3;
   private com.aspose.slides.internal.f5.z3 a6;
   private y8 u9;
   private com.aspose.slides.internal.l4.j5 h0;
   private com.aspose.slides.internal.l4.j5 c8;
   private boolean t2;
   private d1 s7;
   private s4 x8;
   private l6 n3;
   private com.aspose.slides.internal.j3.s7 y4;
   private n1 e2;
   private boolean t9;
   private com.aspose.slides.internal.f5.z3 z1;
   private boolean t4 = false;
   private boolean q0 = true;
   private boolean z3 = false;

   public u9(com.aspose.slides.internal.f5.k5 var1) {
      this.l6 = var1;
      this.k5 = var1.n5();
      this.y4 = com.aspose.slides.internal.v6g.k5.n5(this.k5.z8().n5("error-handler"), com.aspose.slides.internal.j3.s7.class);
   }

   public final com.aspose.slides.internal.j3.z1 n5(com.aspose.slides.internal.p6.l6 var1) {
      this.s7 = new d1();
      this.x8 = new s4();
      this.n3 = new l6();
      this.h0 = com.aspose.slides.internal.l4.j5.n5;
      this.n5 = new l4(var1, this.y4);
      this.z3 = true;

      while (this.z3) {
         y8 var2 = this.n5.n5();
         this.n5(var2);
      }

      return this.k5;
   }

   public final boolean n5(y8 var1) {
      this.u9 = var1;
      com.aspose.slides.internal.f5.z3 var2 = this.a6();
      return var2 != null && (var2.s7() == null || !com.aspose.slides.ms.System.j8.l6(var2.s7(), "http://www.w3.org/1999/xhtml"))
         ? com.aspose.slides.internal.l4.j5.j5.n5(var1, this)
         : this.h0.n5(var1, this);
   }

   public final com.aspose.slides.internal.f5.z3 n5(String var1) {
      com.aspose.slides.internal.f5.z3 var2 = (com.aspose.slides.internal.f5.z3)this.k5.a6(var1);
      this.n5(var2);
      return var2;
   }

   public final com.aspose.slides.internal.j3.z8 n5(a6 var1) {
      com.aspose.slides.internal.j3.h0 var2 = this.k5.h0(var1.n5());
      k5 var3 = this.m1().k5();
      if (var3.l6() == null) {
         var3.n5().k5(var2);
      } else {
         var3.n5().n5(var2, var3.l6());
      }

      return var2;
   }

   public final com.aspose.slides.internal.j3.z8 n5(a6 var1, com.aspose.slides.internal.j3.z8 var2) {
      com.aspose.slides.internal.j3.h0 var3 = this.k5.h0(var1.n5());
      var2.k5(var3);
      return var3;
   }

   public final com.aspose.slides.internal.j3.z8 l6(a6 var1) {
      com.aspose.slides.internal.j3.h0 var2 = this.k5.h0(var1.n5());
      this.k5.k5(var2);
      return var2;
   }

   public final void n5(u3 var1) {
      k5 var2 = this.m1().k5();
      if (var2.n5().n3() != 9) {
         if (var2.n5().u6() != null && var2.n5().u6().n3() == 3) {
            ((com.aspose.slides.internal.j3.c4)var2.n5().u6()).u3(var1.n5());
         } else {
            com.aspose.slides.internal.j3.c4 var3 = this.k5.u9(var1.n5());
            if (var2.l6() == null) {
               var2.n5().k5(var3);
            } else {
               var2.n5().n5(var3, var2.l6());
            }
         }
      }
   }

   public final com.aspose.slides.internal.f5.z3 n5(h6 var1, String var2) {
      com.aspose.slides.internal.f5.z3 var3 = (com.aspose.slides.internal.f5.z3)this.k5.k5(var2, var1.n5());

      for (n5$n5 var5 : var1.k5()) {
         var3.n5(var5.n5(), var5.l6());
      }

      if (com.aspose.slides.internal.w3.u9.l6(var1.u3().l6(), c8$n5$n5.n5) && this.n3() != null) {
         com.aspose.slides.internal.w8.p6 var6 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.w8.p6.class);
         if (var6 != null) {
            var6.n5((com.aspose.slides.internal.w8.q0)this.n3());
         }
      }

      return var3;
   }

   public final com.aspose.slides.internal.f5.z3 n5(h6 var1) {
      for (n5$n5 var3 : var1.k5()) {
         com.aspose.slides.internal.j3.k5 var4 = this.k5.t2(var3.n5());
         if (com.aspose.slides.ms.System.d1.a6(var4.x8(), "xmlns")) {
            ((com.aspose.slides.internal.f5.z1)this.k5).u3().n5(var4.t2(), var3.l6());
            break;
         }
      }

      com.aspose.slides.internal.f5.z3 var6 = (com.aspose.slides.internal.f5.z3)this.k5.a6(var1.n5());

      for (n5$n5 var8 : var1.k5()) {
         com.aspose.slides.internal.j3.k5 var5 = this.k5.t2(var8.n5());
         var5.n5(var8.l6());
         var6.n5(var5);
      }

      return var6;
   }

   public final com.aspose.slides.internal.f5.z3 l6(h6 var1) {
      com.aspose.slides.internal.f5.z3 var2 = this.n5(var1);
      this.n5(var2);
      return var2;
   }

   public final com.aspose.slides.internal.f5.z3 l6(h6 var1, String var2) {
      com.aspose.slides.internal.f5.z3 var3 = this.n5(var1, var2);
      this.n5(var3);
      return var3;
   }

   public final com.aspose.slides.internal.f5.z3 n5(com.aspose.slides.internal.f5.z3 var1) {
      k5 var2 = this.m1().k5();
      if (var2.l6() == null) {
         var2.n5().k5(var1);
      } else {
         var2.n5().n5(var1, var2.l6());
      }

      this.s7.n5(var1);
      return var1;
   }

   public final void l6(com.aspose.slides.internal.f5.z3 var1) {
      this.s7.n5(var1);
   }

   public final com.aspose.slides.internal.j3.z3 n5() {
      return this.s7.n5();
   }

   public final d1 l6() {
      return this.s7;
   }

   public final boolean n5(String... var1) {
      while (this.s7.k5() != 0) {
         com.aspose.slides.internal.f5.z3 var2 = this.s7.n5();
         if (com.aspose.slides.internal.w3.u9.l6(var2.u3().l6(), var1)) {
            return true;
         }
      }

      return false;
   }

   public final boolean l6(String var1) {
      while (this.s7.k5() != 0) {
         com.aspose.slides.internal.f5.z3 var2 = this.s7.n5();
         if (com.aspose.slides.ms.System.d1.a6(var2.u3().l6(), var1)) {
            return true;
         }
      }

      return false;
   }

   public final boolean n5(com.aspose.slides.internal.j3.z3 var1) {
      while (this.s7.k5() != 0) {
         com.aspose.slides.internal.f5.z3 var2 = this.s7.n5();
         if (var2 == var1) {
            return true;
         }
      }

      return false;
   }

   public final boolean l6(String... var1) {
      while (this.s7.k5() != 0) {
         com.aspose.slides.internal.f5.z3 var2 = this.s7.l6();
         if (com.aspose.slides.internal.w3.u9.l6(var2.u3().l6(), var1)) {
            return true;
         }

         this.s7.n5();
      }

      return false;
   }

   public final boolean k5() {
      while (this.s7.k5() != 0) {
         com.aspose.slides.internal.f5.z3 var1 = this.s7.l6();
         if (com.aspose.slides.ms.System.j8.l6(var1.s7(), "http://www.w3.org/1999/xhtml")) {
            return true;
         }

         this.s7.n5();
      }

      return false;
   }

   public final com.aspose.slides.internal.f5.z3 u3() {
      return this.s7.l6();
   }

   public final com.aspose.slides.internal.f5.z3 a6() {
      return this.l6().k5() == 1 && this.w1() ? this.z1 : this.u3();
   }

   public final com.aspose.slides.internal.j3.z1 u9() {
      return this.k5;
   }

   public final l4 h0() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.l4.j5 var1) {
      this.h0 = var1;
   }

   public final void c8() {
      this.c8 = this.h0;
   }

   public final void t2() {
      this.h0 = this.c8;
   }

   public final boolean s7() {
      return this.t2;
   }

   public final void n5(boolean var1) {
      this.t2 = var1;
   }

   public final com.aspose.slides.internal.f5.z3 x8() {
      return this.u3;
   }

   public final void k5(com.aspose.slides.internal.f5.z3 var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.f5.z3 n3() {
      return this.a6;
   }

   public final void u3(com.aspose.slides.internal.f5.z3 var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.l4.j5 y4() {
      return this.h0;
   }

   public final boolean k5(String var1) {
      return this.n5(var1, null);
   }

   public final boolean k5(String[] var1) {
      return this.n5(var1, null);
   }

   public final boolean n5(String var1, String[] var2) {
      return this.n5(var1, com.aspose.slides.internal.y8.n5$n5.a6, var2);
   }

   public final boolean n5(String[] var1, String[] var2) {
      return this.n5(var1, com.aspose.slides.internal.y8.n5$n5.a6, var2);
   }

   public final boolean u3(String var1) {
      return this.n5(var1, com.aspose.slides.internal.y8.n5$n5.c8);
   }

   public final boolean u3(String... var1) {
      return this.n5(var1, com.aspose.slides.internal.y8.n5$n5.r4, null);
   }

   public final boolean a6(String var1) {
      return this.n5(var1, com.aspose.slides.internal.y8.n5$n5.r4, null);
   }

   public final boolean u9(String var1) {
      return this.n5(var1, com.aspose.slides.internal.y8.n5$n5.t9);
   }

   public final boolean e2() {
      return this.n5("select", null, null);
   }

   public final boolean a6(com.aspose.slides.internal.f5.z3 var1) {
      return com.aspose.slides.internal.w3.u9.l6(var1.u3().l6(), com.aspose.slides.internal.y8.n5$n5.s7);
   }

   private boolean n5(String var1, String[] var2, String[] var3) {
      return this.n5(new String[]{var1}, var2, var3);
   }

   private boolean n5(String[] var1, String[] var2, String[] var3) {
      IGenericEnumerator var4 = this.l6().iterator();

      while (var4.hasNext()) {
         String var5 = ((com.aspose.slides.internal.f5.z3)var4.next()).u3().l6();
         if (com.aspose.slides.internal.w3.u9.l6(var5, var1)) {
            return true;
         }

         if (var2 != null && com.aspose.slides.internal.w3.u9.l6(var5, var2)) {
            return false;
         }

         if (var3 != null && com.aspose.slides.internal.w3.u9.l6(var5, var3)) {
            return false;
         }
      }

      return false;
   }

   public final void u9(com.aspose.slides.internal.f5.z3 var1) {
      int var2 = 0;
      IGenericEnumerator var3 = this.n3.n5();

      while (var3.hasNext()) {
         com.aspose.slides.internal.f5.z3 var4 = (com.aspose.slides.internal.f5.z3)var3.next();
         if (var4 == null) {
            break;
         }

         if (this.n5(var1, var4)) {
            var2++;
         }

         if (var2 == 3) {
            this.n3.removeItem(var4);
            break;
         }
      }

      this.n3.addItem(var1);
   }

   private boolean n5(com.aspose.slides.internal.f5.z3 var1, com.aspose.slides.internal.f5.z3 var2) {
      if (!var1.u3().n5(var2.u3())) {
         return false;
      }

      if (var1.u9().n5() != var2.u9().n5()) {
         return false;
      }

      IEnumerator var3 = var1.u9().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.j3.k5 var4 = (com.aspose.slides.internal.j3.k5)var3.next();
            com.aspose.slides.internal.f5.n5 var5 = var2.u9(var4.n5());
            if (var5 == null) {
               return false;
            }

            if (!com.aspose.slides.ms.System.d1.a6(var4.k5(), var5.k5())) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      return true;
   }

   public final void t9() {
      if (this.n3.size() != 0) {
         com.aspose.slides.internal.f5.z3 var1 = this.n3.l6();
         if (var1 != null && !this.l6((com.aspose.slides.internal.j3.z3)var1)) {
            int var2 = this.n3.size() - 1;
            boolean var3 = false;

            do {
               if (var2 == 0) {
                  var3 = true;
                  break;
               }

               var1 = this.n3.get_Item(--var2);
            } while (var1 != null && !this.l6((com.aspose.slides.internal.j3.z3)var1));

            do {
               if (!var3) {
                  var1 = this.n3.get_Item(++var2);
               }

               var3 = false;
               com.aspose.slides.internal.f5.z3 var4 = this.n5(var1.u3().l6());
               IEnumerator var5 = var1.u9().iterator();

               try {
                  while (var5.hasNext()) {
                     com.aspose.slides.internal.j3.k5 var6 = (com.aspose.slides.internal.j3.k5)var5.next();
                     com.aspose.slides.internal.j3.k5 var7 = var1.y4().t2(var6.n5());
                     var7.n5(var6.k5());
                     var4.A_().n5(var7);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     ((IDisposable)var5).dispose();
                  }
               }

               this.n3.set_Item(var2, var4);
            } while (var2 != this.n3.size() - 1);
         }
      }
   }

   public final void z1() {
      com.aspose.slides.internal.i9.l6 var1 = (com.aspose.slides.internal.i9.l6)this.n3.n5();

      while (var1.hasNext()) {
         com.aspose.slides.internal.f5.z3 var2 = (com.aspose.slides.internal.f5.z3)var1.next();
         this.n3.removeAt(var1.n5());
         if (var2 == null) {
            break;
         }
      }
   }

   public final boolean h0(com.aspose.slides.internal.f5.z3 var1) {
      return this.n3.removeItem(var1);
   }

   public final boolean c8(com.aspose.slides.internal.f5.z3 var1) {
      IGenericEnumerator var2 = this.n3.n5();

      while (var2.hasNext()) {
         if (var2.next() == var1) {
            return true;
         }
      }

      return false;
   }

   public final com.aspose.slides.internal.f5.z3 h0(String var1) {
      IGenericEnumerator var2 = this.n3.n5();
      com.aspose.slides.internal.f5.d2 var3 = com.aspose.slides.internal.f5.d2.n5(var1);

      while (var2.hasNext()) {
         com.aspose.slides.internal.f5.z3 var4 = (com.aspose.slides.internal.f5.z3)var2.next();
         if (var4 == null) {
            break;
         }

         if (var4.u3().n5(var3)) {
            return var4;
         }
      }

      return null;
   }

   public final void t4() {
      this.n3.addItem(null);
   }

   public final boolean c8(String var1) {
      IGenericEnumerator var2 = this.s7.iterator();

      while (var2.hasNext()) {
         if (com.aspose.slides.ms.System.d1.a6(((com.aspose.slides.internal.f5.z3)var2.next()).u3().l6(), var1)) {
            return true;
         }
      }

      return false;
   }

   public final boolean l6(com.aspose.slides.internal.j3.z3 var1) {
      IGenericEnumerator var2 = this.s7.iterator();

      while (var2.hasNext()) {
         if (var2.next() == var1) {
            return true;
         }
      }

      return false;
   }

   public final void t2(String var1) {
      if (var1 != null) {
         while (
            !com.aspose.slides.ms.System.d1.a6(this.u3().u3().l6(), var1)
               && com.aspose.slides.internal.w3.u9.l6(this.u3().u3().l6(), com.aspose.slides.internal.y8.n5$n5.e2)
         ) {
            this.n5();
         }
      } else {
         while (com.aspose.slides.internal.w3.u9.l6(this.u3().u3().l6(), com.aspose.slides.internal.y8.n5$n5.e2)) {
            this.n5();
         }
      }
   }

   public final void q0() {
      String var1 = "p";
      this.t2(var1);
      if (!com.aspose.slides.ms.System.d1.a6(this.u3().u3().l6(), var1)) {
         this.l6(this.h0);
      }

      this.l6(var1);
   }

   public final void z3() {
      this.t2((String)null);
   }

   public final boolean s7(String var1) {
      if (com.aspose.slides.ms.System.d1.a6(this.u3().u3().l6(), var1)) {
         com.aspose.slides.internal.f5.z3 var21 = this.u3();
         this.n5((com.aspose.slides.internal.j3.z3)var21);
         if (this.c8(var21)) {
            this.h0(var21);
         }

         return false;
      } else {
         int var2 = 0;

         while (var2 < 8) {
            var2++;
            com.aspose.slides.internal.f5.z3 var3 = this.h0(var1);
            if (var3 == null) {
               return this.h0.u3(this.u9, this);
            }

            if (!this.l6((com.aspose.slides.internal.j3.z3)var3)) {
               this.l6(this.h0);
               this.h0(var3);
               return true;
            }

            if (!this.k5(var3.u3().l6())) {
               this.l6(this.h0);
               return false;
            }

            if (!this.u3().equals(var3)) {
               this.l6(this.h0);
            }

            com.aspose.slides.internal.f5.z3 var4 = null;
            int var5 = this.s7.k5(var3);

            for (int var6 = var5; var6 < this.s7.k5(); var6++) {
               com.aspose.slides.internal.f5.z3 var7 = this.s7.n5(var6);
               if (this.a6(var7)) {
                  var4 = var7;
                  break;
               }
            }

            if (var4 == null) {
               this.n5((com.aspose.slides.internal.j3.z3)var3);
               this.h0(var3);
               return true;
            }

            com.aspose.slides.internal.f5.z3 var23 = this.s7.n5(var5 - 1);
            var5 = this.n3.indexOf(var3);
            com.aspose.slides.internal.f5.z3 var24 = var4;
            com.aspose.slides.internal.f5.z3 var8 = var4;
            int var9 = 0;

            while (true) {
               var9++;
               if (this.l6((com.aspose.slides.internal.j3.z3)var24)) {
                  var24 = this.s7.u3(var24);
               }

               if (var24 == var3) {
                  k5 var25 = this.t2(var23).k5();
                  if (var25.l6() != null) {
                     var25.n5().n5(var8, var25.l6());
                  } else {
                     var25.n5().k5(var8);
                  }

                  com.aspose.slides.internal.f5.z3 var26 = (com.aspose.slides.internal.f5.z3)this.k5.a6(var3.u3().l6());
                  IEnumerator var27 = var3.u9().iterator();

                  try {
                     while (var27.hasNext()) {
                        com.aspose.slides.internal.j3.k5 var13 = (com.aspose.slides.internal.j3.k5)var27.next();
                        var26.n5(var13.n5(), var13.k5());
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
                        ((IDisposable)var27).dispose();
                     }
                  }

                  while (var4.p8()) {
                     var26.k5(var4.a0());
                  }

                  var4.k5(var26);
                  this.h0(var3);
                  this.n3.insertItem(var5, var26);
                  this.s7.l6(var3);
                  this.s7.l6(this.s7.k5(var4) + 1, var26);
                  break;
               }

               if (var9 > 3 && this.c8(var24)) {
                  this.h0(var24);
               }

               if (!this.c8(var24)) {
                  this.l6().l6(var24);
               } else {
                  com.aspose.slides.internal.f5.z3 var10 = (com.aspose.slides.internal.f5.z3)this.k5.a6(var24.u3().l6());
                  IEnumerator var11 = var24.u9().iterator();

                  try {
                     while (var11.hasNext()) {
                        com.aspose.slides.internal.j3.k5 var12 = (com.aspose.slides.internal.j3.k5)var11.next();
                        var10.n5(var12.n5(), var12.k5());
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                        ((IDisposable)var11).dispose();
                     }
                  }

                  var23.k5(var10);
                  this.n3.set_Item(this.n3.indexOf(var24), var10);
                  this.s7.n5(this.s7.k5(var24), var10);
                  var24 = var10;
                  if (var8.y2() != null) {
                     var8.y2().l6(var8);
                  }

                  var24.k5(var8);
                  var8 = var24;
               }
            }
         }

         return true;
      }
   }

   public final k5 m1() {
      return this.t2((com.aspose.slides.internal.f5.z3)null);
   }

   public final k5 t2(com.aspose.slides.internal.f5.z3 var1) {
      com.aspose.slides.internal.f5.z3 var2;
      if (var1 != null) {
         var2 = var1;
      } else {
         var2 = this.u3();
      }

      com.aspose.slides.internal.j3.z8 var3 = null;
      if (this.j5() && com.aspose.slides.internal.w3.u9.l6(var2.u3().l6(), com.aspose.slides.internal.y8.n5$n5.w1)) {
         com.aspose.slides.internal.f5.z3 var4 = this.l6().l6(c8$l6.t2);
         com.aspose.slides.internal.f5.z3 var5 = this.l6().l6(c8$l6.s7);
         if (var4 != null && (var5 == null || this.l6().k5(var4) > this.l6().k5(var5))) {
            var3 = ((com.aspose.slides.internal.w8.g7)var4).j9();
            return new k5(var3);
         }

         if (var5 == null) {
            var3 = this.s7.u3();
            return new k5(var3);
         }

         if (var5.y2() != null) {
            return new k5(var5.y2(), var5);
         }

         var3 = this.l6().u3(var5);
      } else {
         var3 = var2;
      }

      com.aspose.slides.internal.w8.g7 var9 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.w8.g7.class);
      if (var9 != null) {
         var3 = var9.j9();
      }

      return new k5(var3);
   }

   public final void k7() {
      this.n5.t9();
   }

   public final void m3() {
      this.e2 = new n1();
   }

   public final n1 z8() {
      return this.e2;
   }

   public final boolean j5() {
      return this.t9;
   }

   public final void l6(boolean var1) {
      this.t9 = var1;
   }

   public final boolean w1() {
      return this.t4;
   }

   public final boolean r4() {
      return this.q0;
   }

   public final s4 c4() {
      return this.x8;
   }

   public final com.aspose.slides.internal.l4.j5 y2() {
      return this.x8.size() == 0 ? null : this.x8.peek();
   }

   public final com.aspose.slides.internal.f5.k5 y1() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i6.d1 var1) {
      this.l6(this.u9.e2());
      this.n5.n5(var1);
      this.c8();
      this.n5(com.aspose.slides.internal.l4.j5.c8);
   }

   public final void a0() {
      this.l6(com.aspose.slides.internal.y8.n5$n5.r4);
   }

   public final void k5(boolean var1) {
      boolean var2 = false;
      IGenericEnumerator var3 = this.s7.iterator();
      com.aspose.slides.internal.f5.z3 var4 = this.s7.u3();

      while (var3.hasNext()) {
         com.aspose.slides.internal.f5.z3 var5 = (com.aspose.slides.internal.f5.z3)var3.next();
         if (var5 == var4) {
            var2 = true;
            if (var1) {
               var5 = this.z1;
            }
         }

         String var6 = var5.u3().l6();
         if (com.aspose.slides.ms.System.d1.a6("select", var6)) {
            if (!var2) {
               com.aspose.slides.internal.f5.z3 var7 = var5;

               while (var7 != var4) {
                  var7 = this.s7.n5(this.s7.k5(var7) - 1);
                  if (var7.u3().n5(c8$l6.t2)) {
                     this.n5(com.aspose.slides.internal.l4.j5.z1);
                     return;
                  }

                  if (com.aspose.slides.ms.System.d1.a6(var7.u3().l6(), "table")) {
                     this.n5(com.aspose.slides.internal.l4.j5.t4);
                     return;
                  }
               }

               this.n5(com.aspose.slides.internal.l4.j5.z1);
            } else {
               this.n5(com.aspose.slides.internal.l4.j5.z1);
            }
            break;
         }

         if (com.aspose.slides.internal.w3.u9.l6(var6, "td", "th") && !var2) {
            this.n5(com.aspose.slides.internal.l4.j5.t9);
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("tr", var6)) {
            this.n5(com.aspose.slides.internal.l4.j5.e2);
            break;
         }

         if (com.aspose.slides.internal.w3.u9.l6(var6, "tbody", "thead", "tfoot")) {
            this.n5(com.aspose.slides.internal.l4.j5.y4);
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("caption", var6)) {
            this.n5(com.aspose.slides.internal.l4.j5.x8);
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("colgroup", var6)) {
            this.n5(com.aspose.slides.internal.l4.j5.n3);
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("table", var6)) {
            this.n5(com.aspose.slides.internal.l4.j5.t2);
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("template", var6)) {
            this.n5(this.y2());
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("head", var6)) {
            if (var2) {
               this.n5(com.aspose.slides.internal.l4.j5.h0);
            } else {
               this.n5(com.aspose.slides.internal.l4.j5.u3);
            }
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("body", var6)) {
            this.n5(com.aspose.slides.internal.l4.j5.h0);
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("frameset", var6)) {
            this.n5(com.aspose.slides.internal.l4.j5.m1);
            break;
         }

         if (com.aspose.slides.ms.System.d1.a6("html", var6)) {
            if (this.x8() == null) {
               this.n5(com.aspose.slides.internal.l4.j5.k5);
            } else {
               this.n5(com.aspose.slides.internal.l4.j5.u9);
            }
            break;
         }

         if (var2) {
            this.n5(com.aspose.slides.internal.l4.j5.h0);
            break;
         }
      }
   }

   public final void d2() {
      this.l6("tbody", "tfoot", "thead", c8$l6.t2.l6(), c8$l6.n5.l6());
   }

   public final void d5() {
      this.l6("tr", c8$l6.t2.l6(), "html");
   }

   public final void s3() {
      this.z3();
      if (!com.aspose.slides.internal.w3.u9.l6(this.u3().u3().l6(), "td", "th")) {
         this.l6(this.h0);
      }

      this.n5("td", "th");
      this.z1();
      this.n5(com.aspose.slides.internal.l4.j5.e2);
   }

   public final y8 l6(y8 var1) {
      n5 var2 = var1.y4();

      for (n5$n5 var4 : var2.k5()) {
         String var5 = var4.n5();
         String var6 = p6.l6(var5);
         if (!com.aspose.slides.ms.System.j8.l6(var5, var6)) {
            var4.n5(var6);
         }
      }

      return var1;
   }

   public final y8 k5(y8 var1) {
      return var1;
   }

   public final y8 u3(y8 var1) {
      n5 var2 = var1.y4();
      String var3 = var2.n5();
      String var4 = p6.n5(var3);
      if (!com.aspose.slides.ms.System.j8.l6(var3, var4)) {
         var2.n5(var4);
      }

      return var1;
   }

   public final y8 a6(y8 var1) {
      return var1;
   }

   public final void p8() {
      this.z3 = false;
   }

   public final void f2() {
   }

   public final void n5(com.aspose.slides.internal.i4.j3 var1) {
      if (this.y4 != null) {
         this.y4
            .n5(
               new com.aspose.slides.internal.f5.t2(
                  (byte)1, var1.getMessage(), "", null, null, new com.aspose.slides.internal.f5.y4(-1L, -1L, this.n5.y4().n5(), -1L, null, null)
               )
            );
      }
   }

   public final void l6(com.aspose.slides.internal.l4.j5 var1) {
      if (this.y4 != null) {
         this.y4
            .n5(
               new com.aspose.slides.internal.f5.t2(
                  (byte)2,
                  com.aspose.slides.ms.System.d1.n5(
                     "Unexpected token [{0}] when in state [{1}]",new Object[]{
                     com.aspose.slides.ms.System.s3.n5(c3.class, this.u9.u9()),
                     com.aspose.slides.ms.System.j8.n5(var1).s7()
                  }),
                  "",
                  null,
                  null,
                  new com.aspose.slides.internal.f5.y4(-1L, -1L, this.n5.y4().n5(), -1L, null, null)
               )
            );
      }
   }

   public final void i1() {
      this.n5.z1();
   }

   public final void e5() {
      this.n5.t4();
   }

   public final void x8(String var1) {
      this.n5.k5(var1);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("DOMBuilder{{currentToken={0}, state={1}}}",new Object[]{ this.u9, com.aspose.slides.ms.System.j8.n5(this.h0).s7()});
   }
}
