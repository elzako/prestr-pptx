package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class v5s {
   private boolean n5;
   private com.aspose.slides.internal.k0r.g6 l6;
   private com.aspose.slides.internal.k0r.q5 k5;
   private t2s u3;
   private l3c a6;
   private int u9 = -1;
   private long h0 = 0L;
   private long c8 = 0L;
   private a9x t2;
   private v5s s7 = null;
   private com.aspose.slides.internal.c8m.t6 x8;
   private com.aspose.slides.internal.k4y.r3q n3;
   private boolean y4 = false;
   private boolean e2 = false;
   private s0i t9;

   v5s(com.aspose.slides.internal.k0r.g6 var1, Object var2) {
      this.l6 = var1;
      this.n5(true);
      this.n5(var2);
      this.n5();
      this.q0();
      this.t4();
   }

   void n5() {
      this.k5 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.k0r.q5.class);
      if (this.k5 == null) {
         this.u9 = 1;
         this.k5 = com.aspose.slides.internal.v6g.k5.n5(this.l6.e2().get_Item(0), com.aspose.slides.internal.k0r.q5.class);
      }

      if (this.k5 == null) {
         throw new NullReferenceException("Shape container with data not found!");
      }

      this.z8();
      this.w1();
      this.j5();
   }

   final void n5(long var1) {
      this.h0 = var1;
   }

   private void t4() {
      if (this.u3() != null) {
         if (this.u9() != null) {
            if ((this.h0 & 4294967295L) == 0L) {
               this.n5(this.u3().a6().y2());
            }

            this.u3().n5(this);
         }
      }
   }

   private void q0() {
      if (this.u9 == 1) {
         if (this.k5().h0() != null) {
            if (!this.z3()) {
               if (!this.m1()) {
                  ;
               }
            }
         }
      } else {
         com.aspose.slides.internal.k0r.r3 var1 = this.k5().a6();
         int var2 = this.k5().u3().t2();
         if (this.a6 == null && this.k5().u3().h0()) {
            this.u9 = 0;
         } else {
            boolean var3 = com.aspose.slides.internal.v6g.k5.n5(this.u9(), x8t.class) != null;
            switch (var2) {
               case 0:
                  if (var1 != null && var1.l6().l6(325)) {
                     this.u9 = 3;
                  } else {
                     this.u9 = 2;
                  }
                  break;
               case 1:
               case 3:
               case 202:
                  if (var3) {
                     this.u9 = 5;
                     return;
                  }

                  this.u9 = 3;
                  break;
               case 20:
                  if (var3) {
                     this.u9 = 6;
                     return;
                  }

                  if (com.aspose.slides.internal.v6g.k5.l6(this.u9(), i1w.class)) {
                     this.u9 = 8;
                     return;
                  }

                  this.u9 = 3;
                  break;
               case 75:
                  if (var1 != null && com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(261), com.aspose.slides.internal.k0r.v8.class) != null) {
                     this.u9 = 9;
                  } else {
                     this.u9 = 3;
                  }
                  break;
               default:
                  if (var2 >= 32 && var2 <= 40) {
                     this.u9 = 8;
                  } else {
                     this.u9 = 3;
                  }
            }

            if (((com.aspose.slides.internal.k0r.q5)this.k5()).t9() != 0) {
               this.u9 = 9;
            }

            com.aspose.slides.internal.k0r.c5 var4 = this.u3().a6().h0().u9();
            if (this.k5().s7() != null && this.k5().s7().a6() != null && var4 != null) {
               long var5 = this.k5().s7().a6().l6();
               com.aspose.slides.internal.k0r.x3 var7 = var4.n5(var5);
               if (var7 != null && var7.u3() != null) {
                  long var8 = var7.u3().u3();
                  com.aspose.slides.internal.k0r.h9 var10 = this.u3().a6().k5().k5(var8);
                  if (var10 != null) {
                     com.aspose.slides.internal.k0r.r4 var17 = (com.aspose.slides.internal.k0r.r4)var7;
                     switch (var17.r4() & 65535) {
                        case 4044:
                        case 4046:
                           this.u9 = 14;
                           this.t2 = new d5q(this);
                           ((d5q)this.t2).n5(var17, var10);
                           break;
                        case 4078:
                           this.u9 = 15;
                           this.t2 = new t6t(this);
                           ((t6t)this.t2).n5(var17, var10);
                           break;
                        default:
                           throw new ArgumentOutOfRangeException("pptExContainer");
                     }

                     return;
                  }
               }

               com.aspose.slides.internal.k0r.r7 var12 = var4.l6(var5);
               if (var12 != null) {
                  this.u9 = 13;
                  this.t2 = new l7d(this);
                  ((l7d)this.t2).n5(var12);
                  return;
               }

               com.aspose.slides.internal.k0r.r4 var13 = var4.k5(var5);
               if (var13 != null) {
                  com.aspose.slides.internal.k0r.a2 var14 = com.aspose.slides.internal.v6g.k5.n5(var13, com.aspose.slides.internal.k0r.a2.class);
                  com.aspose.slides.internal.k0r.h1 var11 = com.aspose.slides.internal.v6g.k5.n5(var13, com.aspose.slides.internal.k0r.h1.class);
                  if (var14 != null) {
                     this.u9 = 10;
                     this.t2 = new l7d(this);
                     ((l7d)this.t2).n5(var14);
                     return;
                  }

                  if (var11 != null) {
                     this.u9 = 11;
                     this.t2 = new l7d(this);
                     ((l7d)this.t2).n5(var11);
                     return;
                  }
               } else {
                  com.aspose.slides.internal.k0r.l5 var15 = com.aspose.slides.internal.v6g.k5.n5(var4.u3(var5), com.aspose.slides.internal.k0r.l5.class);
                  if (var15 != null) {
                     this.u9 = 11;
                     this.t2 = new l7d(this);
                     ((l7d)this.t2).n5(var15);
                     return;
                  }

                  com.aspose.slides.internal.k0r.w3 var16 = com.aspose.slides.internal.v6g.k5.n5(var4.a6(var5), com.aspose.slides.internal.k0r.w3.class);
                  if (var16 != null) {
                     this.u9 = 12;
                     this.t2 = new l7d(this);
                     ((l7d)this.t2).n5(var16);
                     return;
                  }
               }
            }
         }
      }
   }

   private boolean z3() {
      if (!this.k5().h0().u3()) {
         return false;
      }

      this.u9 = 4;
      return true;
   }

   private boolean m1() {
      if (!this.k5().h0().l6().l6(1280)) {
         return false;
      } else {
         com.aspose.slides.internal.k0r.a9 var1 = this.k5().h0();
         com.aspose.slides.internal.k0r.b2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(1284), com.aspose.slides.internal.k0r.b2.class);
         if (var2 != null && (var2.u3() & 65535) >= 1 && !this.k7()) {
            this.u9 = 7;
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean k7() {
      com.aspose.slides.internal.k0r.e4 var1 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.k0r.e4.class);
      if (var1 == null) {
         return true;
      }

      List var2 = new List();
      var2.addItem(75);
      var2.addItem(3);
      var2.addItem(1);
      var2.addItem(2);
      var2.addItem(23);
      var2.addItem(8);
      var2.addItem(42);
      var2.addItem(20);
      var2.addItem(32);
      var2.addItem(33);
      var2.addItem(34);
      boolean var3 = false;
      List$Enumerator var4 = var1.e2().iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k0r.e6r var5 = (com.aspose.slides.internal.k0r.e6r)var4.next();
            if (!var3) {
               var3 = true;
            } else {
               com.aspose.slides.internal.k0r.q5 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.k0r.q5.class);
               if (var6 == null) {
                  return true;
               }

               if (var6.u3() == null) {
                  return true;
               }

               if (!var2.containsItem(var6.u3().t2())) {
                  return true;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return false;
   }

   private void m3() {
      switch (this.u9) {
         case 0:
            this.t2 = new m5n(this);
            break;
         case 1:
            this.t2 = new l3c(this);
            break;
         case 2:
         case 3:
         default:
            this.t2 = new a9x(this);
            break;
         case 4:
            this.t2 = new x8t(this);
            break;
         case 5:
            this.t2 = new y5z(this);
            break;
         case 6:
            this.t2 = new b0t(this);
            break;
         case 7:
            this.t2 = new i1w(this);
      }
   }

   private void n5(Object var1) {
      this.u3 = com.aspose.slides.internal.v6g.k5.n5(var1, t2s.class);
      this.a6 = com.aspose.slides.internal.v6g.k5.n5(var1, l3c.class);
      if (this.a6 != null) {
         this.u3 = this.a6.y4();
         this.a6.u9().addItem(this);
      }
   }

   private void z8() {
      if (this.k5().u3() != null) {
         this.h0 = this.k5().u3().l6();
         if ((this.h0 & 4294967295L) >= (this.u3().a6().r4() & 4294967295L)) {
            this.u3().a6().l6((this.h0 & 4294967295L) + 1L & 4294967295L);
         }
      }

      com.aspose.slides.internal.k0r.r3 var1 = this.k5().a6();
      if (var1 != null) {
         com.aspose.slides.internal.k0r.z5 var2 = (com.aspose.slides.internal.k0r.z5)var1.l6().n5(769);
         if (var2 != null && (var2.j5() & 4294967295L) != 0L && this.u3().a6().z3().containsKey(var2.j5())) {
            this.s7 = this.u3().a6().z3().get_Item(var2.j5());
         }
      }
   }

   private void j5() {
      com.aspose.slides.internal.k0r.c9 var1 = this.k5().s7();
      if (var1 != null) {
         com.aspose.slides.internal.k0r.g8v var2 = var1.z1();
         com.aspose.slides.internal.k0r.z0k var3 = var1.q0();
         if (var2 != null && var3 != null) {
            if (this.u3().n3() >= 2) {
               t2s var4 = this.u3().c8();
               if (var4.j5().containsKey(var2.l6())) {
                  com.aspose.slides.internal.k0r.q5 var5 = com.aspose.slides.internal.v6g.k5.n5(
                     var4.j5().get_Item(var2.l6()).k5(), com.aspose.slides.internal.k0r.q5.class
                  );
                  if (var5 != null && var3.n5(var5.s7().q0())) {
                     this.n5(false);
                  }
               }
            } else if (this.u3().j5().containsKey(var2.l6())) {
               if (this.u3().j5().get_Item(var2.l6()).k5().u3().k5()) {
                  this.u3().j5().set_Item(var2.l6(), this);
               }
            } else {
               this.u3().j5().addItem(var2.l6(), this);
            }
         }
      }
   }

   private void w1() {
      if (this.u3() != null) {
         com.aspose.slides.internal.k0r.a9 var1 = this.k5().h0();
         if (!this.u3().p8()) {
            boolean var2 = var1 != null && com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(937), com.aspose.slides.internal.k0r.v8.class) != null;
            if (var2) {
               this.u3().a6().n5++;
               String var3 = "[+] ";
               if (this.u3().t2() != null) {
                  var3 = com.aspose.slides.ms.System.d1.n5(
                     var3, com.aspose.slides.ms.System.d1.n5(new String[]{"Slide: 0x", com.aspose.slides.ms.System.l4.n5(this.u3().t2().u3(), "X6"), " | "})
                  );
               }

               var3 = com.aspose.slides.ms.System.d1.n5(
                  var3, com.aspose.slides.ms.System.d1.n5(new String[]{"ShapeID: 0x", com.aspose.slides.ms.System.l4.n5(this.t2(), "X4"), " | "})
               );
               var3 = com.aspose.slides.ms.System.d1.n5(
                  var3,
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "Type: 0x",
                     com.aspose.slides.ms.System.a3.n5(this.k5().u3().t2(), "X4"),
                     " [",
                     com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k0r.p7.class, this.k5().u3().t2()),
                     "]"
                  })
               );
               com.aspose.slides.internal.k0r.v8 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(937), com.aspose.slides.internal.k0r.v8.class);
               if (var4 != null && var4.l6().length > 1) {
                  try {
                     this.x8 = new com.aspose.slides.internal.c8m.t6(new com.aspose.slides.internal.z0k.e2(var4.l6()), new v5s$1(this));
                     l6z var5 = new l6z(this.x8.y4(), this.u3().a6().t9());
                     this.n3 = var5.n5();
                     this.n5(var3);
                  } catch (RuntimeException var6) {
                     var2 = false;
                     this.u3().a6().n5(var3);
                     this.u3().a6().n5(com.aspose.slides.ms.System.d1.n5(new String[]{"    Exception on loading of ModernBlob package: ", var6.getMessage()}));
                  }

                  if (this.y4) {
                     this.r4();
                  }
               }
            }
         }
      }
   }

   private void n5(String var1) {
      if (this.k5() != null) {
         d5f var2 = this.u3().a6();
         if (this.t9 == null) {
            this.t9 = new s0i(this);
         }

         byte[] var3 = com.aspose.slides.ms.System.z3.s7(this.n3.n5());
         this.y4 = this.t9.n5(var3);
         if (!this.y4) {
            var2.l6++;
            if (this.t9.u9().size() > 0) {
               if (this.t9.u9().size() == 1) {
                  var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Problem description | ", this.t9.u9().get_Item(0)}));
               } else {
                  List$Enumerator var4 = this.t9.u9().iterator();

                  try {
                     while (var4.hasNext()) {
                        String var5 = (String)var4.next();
                        var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.n5(' ', 25), var5}));
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                        var4.dispose();
                     }
                  }
               }
            }
         }
      }
   }

   private void r4() {
      if (this.k5() != null) {
         d5f var1 = this.u3().a6();
         if (this.t9()) {
            byte[] var2 = com.aspose.slides.ms.System.z3.s7(this.n3.l6());
            if (this.t9 == null) {
               this.t9 = new s0i(this);
            }

            this.e2 = this.t9.n5(var2, false);
            if (!this.e2) {
               this.e2 = this.e2 | this.t9.n5(var2, true);
            }

            if (!this.e2) {
               var1.l6++;
               if (this.t9.u9().size() > 0) {
                  if (this.t9.u9().size() == 1) {
                     var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Problem description | ", this.t9.u9().get_Item(0)}));
                  } else {
                     List$Enumerator var3 = this.t9.u9().iterator();

                     try {
                        while (var3.hasNext()) {
                           String var4 = (String)var3.next();
                           var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.n5(' ', 25), var4}));
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                           var3.dispose();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   final com.aspose.slides.internal.k0r.g6 l6() {
      return this.l6;
   }

   final com.aspose.slides.internal.k0r.g6 k5() {
      return this.k5;
   }

   final t2s u3() {
      return this.u3;
   }

   final a9x a6() {
      if (this.t2 == null) {
         this.m3();
      }

      return this.t2;
   }

   final l3c u9() {
      return this.a6;
   }

   final ShapeCollection h0() {
      return this.u9().h0();
   }

   final int c8() {
      return this.u9;
   }

   final long t2() {
      return this.h0;
   }

   final long s7() {
      return this.c8;
   }

   final void l6(long var1) {
      this.c8 = var1;
   }

   final v5s x8() {
      return this.s7;
   }

   final com.aspose.slides.internal.c8m.t6 n3() {
      return this.x8;
   }

   final boolean y4() {
      return this.y4;
   }

   final boolean e2() {
      return this.e2;
   }

   final boolean t9() {
      return this.n3 != null && !com.aspose.slides.ms.System.d1.n5(this.n3.l6());
   }

   final boolean z1() {
      return this.n5;
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }
}
