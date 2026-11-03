package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class s3x {
   private com.aspose.slides.internal.k0r.w1n n5;
   private x4v l6;
   private com.aspose.slides.internal.z0k.n5 k5;
   private com.aspose.slides.internal.k0r.z6z u3;
   private com.aspose.slides.internal.k0r.k5 a6;
   private List<com.aspose.slides.internal.k0r.e6r> u9 = new List<>();
   private List<g9d> h0 = new List<>();
   private List<com.aspose.slides.internal.k0r.z8> c8 = new List<>();
   private s3x t2;
   private s3x s7;
   private String x8 = null;
   private String n3 = null;
   private String y4 = null;
   private int e2 = -1;
   private int t9 = -1;
   private int z1 = -1;
   private int t4 = -1;
   private boolean q0 = false;

   s3x(com.aspose.slides.internal.k0r.w1n var1, x4v var2) {
      this.l6 = var2;
      this.n5 = var1;
      this.k5 = this.l6.l6();
      this.k5.x8().setPosition(this.l6.n5().l6().get_Item(this.n5.l6()) & 4294967295L);
      this.u3 = new com.aspose.slides.internal.k0r.z6z(this.k5);
      com.aspose.slides.internal.k0r.z6z var3 = new com.aspose.slides.internal.k0r.z6z(this.k5);
      if ((var3.u3() & 65535) == 1007) {
         this.a6 = new com.aspose.slides.internal.k0r.h3d();
         ((com.aspose.slides.internal.k0r.h3d)this.a6).n5(this.k5, var3);
      } else {
         this.a6 = new com.aspose.slides.internal.k0r.m0();
         ((com.aspose.slides.internal.k0r.m0)this.a6).n5(this.k5, var3);
      }

      this.n5(this.u3);
   }

   final void n5(com.aspose.slides.internal.k0r.z6z var1) {
      g4x var2 = new g4x(var1, this.k5);

      try {
         for (com.aspose.slides.internal.k0r.z6z var3 = var2.l6(); var3 != null; var3 = var2.l6()) {
            switch (var3.u3()) {
               case 5000:
               case 5002:
               case 5003:
                  this.n5(var3);
                  break;
               case 12000:
                  com.aspose.slides.internal.k0r.z8 var4 = new com.aspose.slides.internal.k0r.z8();
                  var4.n5(this.k5, var3);
                  this.c8.addItem(var4);
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   private void n5(s3x var1, t7a[] var2, int var3) {
      if (!this.a6.u9()) {
         s3x var4 = var1.a6();
         if (var3 > 0 && var4 != null) {
            this.n5(var4, var2, var3 - 1);
         }
      }

      List$Enumerator var12 = var1.u3().iterator();

      try {
         while (var12.hasNext()) {
            g9d var5 = (g9d)var12.next();
            if (!var5.k5() || !var1.y4()) {
               int var6 = var5.l6().l6() / this.t9;
               if (var6 < 0) {
                  var6 = 0;
               }

               if (var6 > this.t4) {
                  var6 = this.t4;
               }

               int var7 = var5.l6().n5() / this.e2;
               t7a var8 = var2[var6];
               if (var8 == null) {
                  var8 = new t7a(var6);
                  var2[var6] = var8;
               }

               while (var8.n5().containsKey(var7)) {
                  var7++;
               }

               var8.n5().addItem(var7, var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   final com.aspose.slides.internal.l7h.a5 n5() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.o9b.p8 var2 = (this.a6.u9() ? this.l6.n5().u3().k5() : this.l6.n5().u3().l6()).u3();
      int var3 = var2.l6() / this.e2;
      this.z1 = var3 / 10 * 10;
      if (this.z1 < var3) {
         this.z1 += 10;
      }

      this.t4 = this.z1 * var2.k5() / var2.l6();
      this.t4 /= 3;
      this.t9 = var2.k5() / this.t4;
      t7a[] var4 = new t7a[this.t4 + 1];
      this.n5(this, var4, 1);
      boolean var5 = false;
      List var6 = new List();
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 0; var9 <= this.t4; var9++) {
         t7a var10 = var4[var9];
         if (var10 == null) {
            if (var6.size() < ++var7) {
               var6.addItem("");
            }
         } else {
            if (var7 < var8) {
               var7 = var8;
            }

            IGenericEnumerator var11 = var10.n5().iterator();

            try {
               while (var11.hasNext()) {
                  KeyValuePair var12 = (KeyValuePair)var11.next();
                  String[] var13 = com.aspose.slides.ms.System.d1.u9(((g9d)var12.getValue()).n5(), '\r', '\u000b');
                  int var14 = var7;
                  int var15 = 0;

                  while (var15 < var13.length && var14 + var15 < var6.size()) {
                     if (((String)var6.get_Item(var14 + var15)).length() + 1 >= (Integer)var12.getKey()) {
                        var14 += var15 + 1;
                        var15 = 0;
                     } else {
                        var15++;
                     }
                  }

                  for (String var19 : var13) {
                     if (var19.length() > 0) {
                        var5 = true;
                     }

                     String var20;
                     if (var14 >= var6.size()) {
                        if ((Integer)var12.getKey() > 0) {
                           var20 = com.aspose.slides.ms.System.d1.n5(' ', ((Integer)var12.getKey()).intValue());
                        } else {
                           var20 = "";
                        }

                        var6.addItem(var20);
                     } else {
                        var20 = (String)var6.get_Item(var14);
                        int var21 = (Integer)var12.getKey() - var20.length();
                        if (var21 > 0) {
                           var20 = com.aspose.slides.ms.System.d1.n5(var20, com.aspose.slides.ms.System.d1.n5(' ', var21));
                        }
                     }

                     var6.set_Item(var14, com.aspose.slides.ms.System.d1.n5(var20, var19));
                     var14++;
                  }

                  if (var8 < var14) {
                     var8 = var14;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }
         }
      }

      if (var5) {
         var1.l6(com.aspose.slides.ms.System.d1.n5('_', this.z1));
         List$Enumerator var30 = var6.iterator();

         try {
            while (var30.hasNext()) {
               String var31 = (String)var30.next();
               var1.l6(var31);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
               var30.dispose();
            }
         }
      }

      return var1;
   }

   final void n5(boolean var1) {
      if (!this.q0) {
         s3x var2 = this.a6();
         if (var2 != null) {
            var2.n5(this.e2);
            var2.n5(true);
         }

         g4x var3 = new g4x(this.u3, this.k5);

         try {
            com.aspose.slides.internal.k0r.z6z var4 = var3.l6();
            if (var4 != null) {
               com.aspose.slides.internal.k0r.z6z var5 = var3.n5(1036);
               if (var5 != null) {
                  g4x var6 = new g4x(var5, this.k5);

                  try {
                     com.aspose.slides.internal.k0r.z6z var7 = var6.n5(61442);
                     if (var7 != null) {
                        this.l6(var7);
                     }
                  } finally {
                     if (var6 != null) {
                        var6.dispose();
                     }
                  }
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }

         if (var1) {
            s3x var16 = this.u9();
            if (var16 != null) {
               var16.n5(this.e2);
               var16.n5(false);
            }
         }

         this.q0 = true;
      }
   }

   private void l6(com.aspose.slides.internal.k0r.z6z var1) {
      if (var1 != null) {
         e9j var2 = new e9j(this.k5);
         g4x var3 = new g4x(var1, this.k5);

         try {
            for (com.aspose.slides.internal.k0r.z6z var4 = var3.l6(); var4 != null; var4 = var3.l6()) {
               switch (var4.u3()) {
                  case 61443:
                     this.l6(var4);
                     break;
                  case 61444:
                     this.n5(var4, var2);
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.k0r.z6z var1, e9j var2) {
      if (var1 != null) {
         g9d var3 = new g9d(var2, this.k5);
         g4x var4 = new g4x(var1, this.k5);

         try {
            for (com.aspose.slides.internal.k0r.z6z var5 = var4.l6(); var5 != null; var5 = var4.l6()) {
               switch (var5.u3()) {
                  case 61449:
                     var2.n5(var5);
                     return;
                  case 61450:
                  case 61451:
                  case 61452:
                  case 61454:
                  default:
                     break;
                  case 61453:
                     var3.n5(var5, this.u9);
                     if (!com.aspose.slides.ms.System.d1.n5(var3.n5())) {
                        this.h0.addItem(var3);
                        this.n5(var3.n5(this.l6.a6()));
                     }
                     break;
                  case 61455:
                  case 61456:
                     var3.n5(var5);
                     break;
                  case 61457:
                     var3.l6(var5);
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }
   }

   final com.aspose.slides.internal.l7h.a5 l6() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      g4x var2 = new g4x(this.u3, this.k5);

      try {
         com.aspose.slides.internal.k0r.z6z var3 = var2.l6();
         if (var3 != null) {
            com.aspose.slides.internal.k0r.z6z var4 = var2.n5(1036);
            if (var4 != null) {
               g4x var5 = new g4x(var4, this.k5);

               try {
                  com.aspose.slides.internal.k0r.z6z var6 = var5.n5(61442);
                  if (var6 != null) {
                     this.n5(var6, var1);
                  }
               } finally {
                  if (var5 != null) {
                     var5.dispose();
                  }
               }
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var1;
   }

   final com.aspose.slides.internal.l7h.a5 k5() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      List$Enumerator var2 = this.c8.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k0r.z8 var3 = (com.aspose.slides.internal.k0r.z8)var2.next();
            var1.l6(var3.u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private void n5(com.aspose.slides.internal.k0r.z6z var1, com.aspose.slides.internal.l7h.a5 var2) {
      if (var1 != null) {
         g4x var3 = new g4x(var1, this.k5);

         try {
            for (com.aspose.slides.internal.k0r.z6z var4 = var3.l6(); var4 != null; var4 = var3.l6()) {
               switch (var4.u3()) {
                  case 61443:
                     this.n5(var4, var2);
                     break;
                  case 61444:
                     this.l6(var4, var2);
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }
   }

   private void l6(com.aspose.slides.internal.k0r.z6z var1, com.aspose.slides.internal.l7h.a5 var2) {
      if (var1 != null) {
         g4x var3 = new g4x(var1, this.k5);

         try {
            com.aspose.slides.internal.k0r.z6z var4 = var3.n5(61453);
            if (var4 != null) {
               g4x var5 = new g4x(var4, this.k5);

               try {
                  com.aspose.slides.internal.k0r.z6z var6 = var5.l6();

                  while (var6 != null) {
                     boolean var7 = this.l6.a6();
                     switch (var6.u3()) {
                        case 3998:
                           com.aspose.slides.internal.k0r.g9 var18 = new com.aspose.slides.internal.k0r.g9(null);
                           var18.n5(this.k5, var6);
                           if (var18.l6() >= this.u9.size()) {
                              throw new IndexOutOfRangeException("No outlined text!");
                           }

                           com.aspose.slides.internal.k0r.e6r var19 = this.u9.get_Item(var18.l6());
                           if ((var19.r4() & 65535) == 4000) {
                              var2.l6(
                                 var7
                                    ? com.aspose.slides.internal.n8e.w1.n5(((com.aspose.slides.internal.k0r.x1f)var19).l6())
                                    : ((com.aspose.slides.internal.k0r.x1f)var19).l6()
                              );
                           } else {
                              var2.l6(
                                 var7
                                    ? com.aspose.slides.internal.n8e.w1.n5(((com.aspose.slides.internal.k0r.k2p)var19).l6())
                                    : ((com.aspose.slides.internal.k0r.k2p)var19).l6()
                              );
                           }

                           return;
                        case 4000:
                           com.aspose.slides.internal.k0r.x1f var9 = new com.aspose.slides.internal.k0r.x1f(null);
                           var9.n5(this.k5, var6);
                           var2.l6(var7 ? com.aspose.slides.internal.n8e.w1.n5(var9.l6()) : var9.l6());
                           return;
                        case 4008:
                           com.aspose.slides.internal.k0r.k2p var8 = new com.aspose.slides.internal.k0r.k2p(null);
                           var8.n5(this.k5, var6);
                           var2.l6(var7 ? com.aspose.slides.internal.n8e.w1.n5(var8.l6()) : var8.l6());
                           return;
                        default:
                           var6 = var5.l6();
                     }
                  }
               } finally {
                  if (var5 != null) {
                     var5.dispose();
                  }
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }
   }

   final void n5(com.aspose.slides.internal.k0r.e6r var1) {
      this.u9.addItem(var1);
   }

   final List<g9d> u3() {
      return this.h0;
   }

   final s3x a6() {
      if (this.t2 == null) {
         if ((this.n3() & 4294967295L) == 0L) {
            return null;
         }

         this.t2 = this.l6.n5().u9().n5(this.n3());
         if (this.t2 == null) {
            this.t2 = this.l6.n5().a6().n5(this.n3());
         }
      }

      return this.t2;
   }

   final s3x u9() {
      if (this.s7 == null) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.a6, com.aspose.slides.internal.k0r.m0.class)) {
            if (this.l6.n5().a6() != null) {
               this.s7 = this.l6.n5().a6().n5(this.x8());
            }
         } else if (this.l6.n5().h0() != null) {
            this.s7 = this.l6.n5().h0().n5(this.x8());
         }
      }

      return this.s7;
   }

   final String h0() {
      if (com.aspose.slides.ms.System.d1.n5(this.x8)) {
         this.x8 = this.l6().toString();
      }

      return this.x8;
   }

   final String c8() {
      if (com.aspose.slides.ms.System.d1.n5(this.n3)) {
         this.n3 = this.k5().toString();
      }

      return this.n3;
   }

   final String t2() {
      if (com.aspose.slides.ms.System.d1.n5(this.y4)) {
         this.y4 = this.n5().toString();
      }

      return this.y4;
   }

   final int s7() {
      return this.e2;
   }

   final void n5(int var1) {
      if (var1 > 0 && (this.e2 > var1 || this.e2 < 0)) {
         this.e2 = var1;
      }
   }

   public final long x8() {
      return this.a6.a6();
   }

   public final long n3() {
      return !this.a6.u9() ? ((com.aspose.slides.internal.k0r.h3d)this.a6).t2() : 0L;
   }

   public final boolean y4() {
      return (this.n5.u3() & 2147483648L & 4294967295L) != 0L;
   }
}
