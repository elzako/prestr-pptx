package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.f2;
import com.aspose.slides.internal.k5.i1;
import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.internal.x8.b3;
import com.aspose.slides.internal.x8.g7;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class h0 implements z8 {
   private com.aspose.slides.internal.k5.m1 l6;
   private final k7 k5;
   private com.aspose.slides.internal.z8.z1 u3 = com.aspose.slides.internal.z8.t2.n5();
   private List<Object> a6 = new List<>();
   private com.aspose.slides.internal.t9.l6 u9 = new com.aspose.slides.internal.t9.l6();
   private y2 h0;
   private com.aspose.slides.internal.t9.k5 c8;
   private a0 t2;
   private com.aspose.slides.internal.u3.c8<Integer> s7;
   private com.aspose.slides.internal.u3.a6<com.aspose.slides.internal.n3.m1> x8;
   private com.aspose.slides.internal.u3.n5<Integer, com.aspose.slides.internal.n3.m1> n3;
   private com.aspose.slides.internal.u3.n5<Integer, Integer> y4;
   private com.aspose.slides.internal.u3.n5<Integer, Integer> e2;
   private com.aspose.slides.internal.u3.a6<Boolean> t9;
   private com.aspose.slides.internal.k5.j5 z1;
   private com.aspose.slides.internal.k5.j5 t4;
   public static final com.aspose.slides.internal.x7n.l6 n5 = new com.aspose.slides.internal.x7n.l6("en-US");
   private final int q0;

   public h0(com.aspose.slides.internal.k5.m1 var1, k7 var2) {
      this.l6 = var1;
      this.k5 = var2;
      IGenericList var3 = com.aspose.slides.ms.System.u3.n5(new r4().n5());
      this.s7 = new com.aspose.slides.internal.u3.c8<>(Integer.class, -1);
      this.x8 = new com.aspose.slides.internal.u3.a6<>();
      this.n3 = new com.aspose.slides.internal.u3.n5<>(Integer.class, com.aspose.slides.internal.n3.m1.class);
      this.y4 = new com.aspose.slides.internal.u3.n5<>(Integer.class, Integer.class, -1);
      this.e2 = new com.aspose.slides.internal.u3.n5<>(Integer.class, Integer.class);
      this.t9 = new com.aspose.slides.internal.u3.a6<>();

      for (int var4 = 0; var4 < var3.size(); var4++) {
         this.x8.n5(var4, (com.aspose.slides.internal.n3.m1)var3.get_Item(var4));
         this.s7.n5(((com.aspose.slides.internal.n3.m1)var3.get_Item(var4)).n5(), var4);
         this.n3.n5(((com.aspose.slides.internal.n3.m1)var3.get_Item(var4)).l6(), (com.aspose.slides.internal.n3.m1)var3.get_Item(var4));
         this.y4.n5(((com.aspose.slides.internal.n3.m1)var3.get_Item(var4)).l6(), var4);
         this.e2.n5(var4, ((com.aspose.slides.internal.n3.m1)var3.get_Item(var4)).l6());
         this.t9.n5(var4, com.aspose.slides.internal.v6g.k5.l6(var3.get_Item(var4), com.aspose.slides.internal.n3.e2.class));
      }

      this.c8 = new com.aspose.slides.internal.t9.k5(this.u9);
      this.t2 = new a0();
      this.h0 = new y2(this);
      this.q0 = this.u3(111);
   }

   public final com.aspose.slides.internal.k5.m1 n5() {
      return com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.k5.m1.class);
   }

   @Override
   public final k7 l6() {
      return this.k5;
   }

   public final u3 k5() {
      return (u3)this.k5;
   }

   public final com.aspose.slides.internal.z8.z1 u3() {
      return this.u3;
   }

   @Override
   public final com.aspose.slides.internal.k5.j5 n5(String var1) {
      com.aspose.slides.internal.z8.a6 var2 = new com.aspose.slides.internal.z8.a6(this);
      return var2.n5(var1);
   }

   @Override
   public final com.aspose.slides.internal.k5.j5 n5(com.aspose.slides.internal.j3.z8 var1) {
      com.aspose.slides.internal.z8.a6 var2 = new com.aspose.slides.internal.z8.a6(this, var1);
      return var2.n5(var1.e5());
   }

   @Override
   public final com.aspose.slides.internal.k5.j5 n5(String var1, com.aspose.slides.internal.j3.z8 var2) {
      t1 var3 = this.k5().n5().n5(this, new u6(var1));
      if (var3.n5() != null && var3.n5().length != 0) {
         com.aspose.slides.internal.l7h.j5 var4 = var3.l6();
         if (var4 == null) {
            var4 = com.aspose.slides.internal.l7h.j5.z3();
         }

         com.aspose.slides.internal.l7h.j5 var5 = var4;
         String var6 = var5.l6(var3.n5());
         com.aspose.slides.internal.z8.a6 var7 = new com.aspose.slides.internal.z8.a6(this, var2);
         com.aspose.slides.internal.k5.j5 var8 = var7.n5(var6);
         ((q0)var8).n5(var1);
         return var8;
      } else {
         return null;
      }
   }

   @Override
   public final com.aspose.slides.internal.k5.m3 l6(String var1, com.aspose.slides.internal.j3.z8 var2) {
      if (d1.n5(var1)) {
         return new j5(new com.aspose.slides.internal.y4.z1(this), var2, this);
      }

      com.aspose.slides.internal.z8.a6 var3 = new com.aspose.slides.internal.z8.a6(this, var2);
      return var3.l6(var1);
   }

   @Override
   public final com.aspose.slides.internal.k5.m3 n5(com.aspose.slides.internal.k5.k7 var1) {
      return new m1(this);
   }

   @Override
   public final int n5(int var1) {
      return this.l6(this.k5(var1));
   }

   public final String l6(int var1) {
      return this.x8.n5(var1).n5();
   }

   public final String k5(int var1) {
      return this.n3.n5(var1).n5();
   }

   public final int l6(String var1) {
      return this.s7.n5(var1);
   }

   public final int u3(int var1) {
      return this.y4.n5(var1);
   }

   public final int a6(int var1) {
      return this.e2.n5(var1);
   }

   public final int a6() {
      return this.x8.n5();
   }

   public final com.aspose.slides.internal.n3.m1 u9(int var1) {
      return this.x8.n5(var1);
   }

   public final com.aspose.slides.internal.n3.m1 h0(int var1) {
      return this.n3.n5(var1);
   }

   public final boolean c8(int var1) {
      return this.t9.n5(var1);
   }

   public final com.aspose.slides.internal.y4.z1 n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      com.aspose.slides.internal.y4.z1 var3 = new com.aspose.slides.internal.y4.z1(this);
      com.aspose.slides.internal.k5.m1 var4 = (com.aspose.slides.internal.k5.m1)var1.c4();
      com.aspose.slides.internal.k5.k7 var5 = (com.aspose.slides.internal.k5.k7)var1;
      h0$l6 var6 = null;
      h0$l6 var7 = null;
      h0$l6 var8 = null;
      if (this.z1 != null && this.z1.l6().n5() != 0L) {
         var7 = this.n5(this.z1, var1, var2);
      }

      if (this.t4 != null && this.t4.l6().n5() != 0L) {
         var8 = this.n5(this.t4, var1, var2);
      }

      if (var4 != null) {
         var6 = this.n5(var4.l6(), var1, var2);
      }

      l6 var9 = (l6)var4.n5(var1, var2);
      l6 var10 = (l6)var5.k5();
      if (var7 != null && var7.n5() != 0) {
         this.n5(var3, var7, false);
      }

      if (var8 != null && var8.n5() != 0) {
         this.n5(var3, var8, false);
      }

      if (var2 == null) {
         m1 var11 = this.h0.n5(var1);
         int var12 = var11.x7();

         for (int var13 = 0; var13 < var12; var13++) {
            int var14 = var11.u3(var13);
            var3.n5(var14, var11.k5(var13));
         }
      }

      if (var6 != null && var6.n5() != 0) {
         this.n5(var3, var6, false);
      }

      if (var2 != null) {
         var10.i2("counter-reset");
      }

      if (var10.x7() != 0) {
         int var15 = var10.x7();

         for (int var17 = 0; var17 < var15; var17++) {
            int var19 = var10.u3(var17);
            var3.n5(var19, var10.k5(var17));
            var3.n5(var19, var10.a6(var17));
         }
      }

      for (int var16 = 0; var16 < var9.x7(); var16++) {
         if (var9.a6(var16)) {
            int var18 = var9.u3(var16);
            var3.n5(var18, var9.k5(var16));
            var3.n5(var18, true);
         }
      }

      if (var6 != null && var6.n5() != 0) {
         this.n5(var3, var6, true);
      }

      if (var8 != null && var8.n5() != 0) {
         this.n5(var3, var8, true);
      }

      if (var7 != null && var7.n5() != 0) {
         this.n5(var3, var7, true);
      }

      return var3;
   }

   public final com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.k5.k7 var1, String var2, int var3) {
      if (var1 == null) {
         return this.n5(var2, var3);
      }

      com.aspose.slides.internal.y4.z1 var4 = var1.n5(var2);
      if (var4 == null) {
         var4 = this.n5((com.aspose.slides.internal.j3.z3)var1, var2);
         var1.n5(var2, var4);
      }

      com.aspose.slides.internal.k5.u9 var5 = var4.n5(var3);
      if (var4.k5(var3)) {
         return var5;
      }

      com.aspose.slides.internal.n3.m1 var6 = this.u9(var3);
      com.aspose.slides.internal.k5.k7 var7 = n5((com.aspose.slides.internal.j3.z3)var1);
      if (var2 != null && (d1.a6(var2, com.aspose.slides.internal.k5.l6$n5.c9b.u9()) || d1.a6(var2, com.aspose.slides.internal.k5.l6$n5.w4w.u9()))) {
         var7 = var1;
      }

      if (var5 == null) {
         if (!var6.k5() || var7 == null) {
            var5 = var6.u3();
         } else if (this.q0 == var3 && "IMG".equals(((com.aspose.slides.internal.j3.z3)var1).a6())) {
            var5 = var6.u3();
         } else {
            var4.k5(var3, true);
            var5 = this.n5(var7, var2, var3);
         }
      } else if (var5 == com.aspose.slides.internal.k5.l6$n5.n5) {
         if (var7 != null) {
            var4.k5(var3, true);
            if (var2 == null || !d1.a6(var2, com.aspose.slides.internal.k5.l6$n5.c9b.u9()) && !d1.a6(var2, com.aspose.slides.internal.k5.l6$n5.w4w.u9())) {
               var5 = this.n5(var7, var2, var3);
            } else {
               var5 = this.n5(var7, null, var3);
            }
         } else {
            var5 = var6.u3();
         }
      }

      try {
         var5 = var6.n5(var1, this, var2, var4, var5, var3);
      } catch (RuntimeException var9) {
         this.u3().n5(com.aspose.slides.internal.z8.u9.n5(var9));
         var5 = var6.n5(var1, this, var2, var4, var6.u3(), var3);
      }

      var4.n5(var3, var5);
      var4.l6(var3, true);
      return var5;
   }

   private h0$l6 n5(i1 var1, com.aspose.slides.internal.j3.z3 var2, String var3) {
      h0$l6 var4 = new h0$l6(null);
      IGenericEnumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.k5.j5 var6 = (com.aspose.slides.internal.k5.j5)var5.next();
            h0$l6 var7 = this.n5(var6, var2, var3);
            if (var7.n5() != 0) {
               var4.n5(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4;
   }

   private h0$l6 n5(com.aspose.slides.internal.k5.j5 var1, com.aspose.slides.internal.j3.z3 var2, String var3) {
      h0$l6 var4 = new h0$l6(null);
      IGenericEnumerator var5 = var1.l6().iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.k5.q0 var6 = (com.aspose.slides.internal.k5.q0)var5.next();
            switch (var6.n5()) {
               case 1:
                  if (var6.n5() == 1) {
                     t4 var37 = com.aspose.slides.internal.v6g.k5.n5(var6, t4.class);
                     IGenericEnumerator var39 = var37.h0().iterator();

                     try {
                        while (var39.hasNext()) {
                           g7 var41 = (g7)var39.next();
                           if ((var3 != null || !var41.a6())
                              && (var3 == null || !"before".equals(var3) && !"after".equals(var3) || var41.a6())
                              && var41.n5(var2, var3)) {
                              var4.n5(new h0$n5(var41, var37));
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
                           var39.dispose();
                        }
                     }
                  }
               case 2:
               default:
                  break;
               case 3:
                  s7 var7 = (s7)var6;
                  if (var7.h0() != null) {
                     boolean var38 = true;
                     if (var7.c8().l6() != 0L) {
                        var38 = var7.c8().n5(this.k5().k5().k5());
                     }

                     if (var38) {
                        h0$l6 var40 = this.n5(var7.h0(), var2, var3);
                        if (var40.n5() != 0) {
                           var4.n5(var40);
                        }
                     }
                  }
                  break;
               case 4:
                  x8 var8 = (x8)var6;
                  if (var8.h0().n5(this.k5().k5().k5())) {
                     IGenericEnumerator var9 = var8.u9().iterator();

                     try {
                        while (var9.hasNext()) {
                           com.aspose.slides.internal.k5.q0 var10 = (com.aspose.slides.internal.k5.q0)var9.next();
                           if (var10.n5() == 1) {
                              t4 var11 = (t4)var10;
                              IGenericEnumerator var12 = var11.h0().iterator();

                              try {
                                 while (var12.hasNext()) {
                                    g7 var13 = (g7)var12.next();
                                    if ((var3 == null || var13.a6()) && var13.n5(var2, var3)) {
                                       var4.n5(new h0$n5(var13, var11));
                                    }
                                 }
                              } finally {
                                 if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                                    var12.dispose();
                                 }
                              }
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                           var9.dispose();
                        }
                     }
                  }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4;
   }

   private h0$l6 n5(com.aspose.slides.internal.k5.j5 var1, String var2) {
      h0$l6 var3 = new h0$l6(null);
      IGenericEnumerator var4 = var1.l6().iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k5.q0 var5 = (com.aspose.slides.internal.k5.q0)var4.next();
            switch (var5.n5()) {
               case 3:
                  s7 var6 = (s7)var5;
                  if (var6.h0() != null) {
                     boolean var26 = true;
                     if (var6.c8().l6() != 0L) {
                        var26 = var6.c8().n5(this.k5().k5().k5());
                     }

                     if (var26) {
                        h0$l6 var28 = this.n5(var6.h0(), var2);
                        if (var28.n5() != 0) {
                           var3.n5(var28);
                        }
                     }
                  }
                  break;
               case 4:
                  x8 var25 = (x8)var5;
                  if (var25.h0().n5(this.k5().k5().k5())) {
                     IGenericEnumerator var27 = var25.u9().iterator();

                     try {
                        while (var27.hasNext()) {
                           com.aspose.slides.internal.k5.q0 var29 = (com.aspose.slides.internal.k5.q0)var27.next();
                           if (var29.n5() == 6) {
                              var3.n5(new h0$n5(var29));
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
                           var27.dispose();
                        }
                     }
                  }
               case 5:
               default:
                  break;
               case 6:
                  n3 var7 = (n3)var5;
                  if (var7.h0().n5() == 0) {
                     var3.n5(new h0$n5(var5));
                  }

                  IGenericEnumerator var8 = var7.h0().iterator();

                  try {
                     while (var8.hasNext()) {
                        g7 var9 = (g7)var8.next();
                        if (var9.n5(null, var2)) {
                           var3.n5(new h0$n5(var9, var7));
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                        var8.dispose();
                     }
                  }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }

   private void n5(com.aspose.slides.internal.y4.z1 var1, h0$l6 var2, boolean var3) {
      var2.l6();
      IGenericEnumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            h0$n5 var5 = (h0$n5)var4.next();
            l6 var6 = null;
            if (var5.n5().n5() == 1) {
               var6 = (l6)((com.aspose.slides.internal.k5.z8)var5.n5()).u9();
            } else if (var5.n5().n5() == 6) {
               var6 = (l6)((com.aspose.slides.internal.k5.t4)var5.n5()).u9();
            }

            for (int var7 = 0; var7 < var6.x7(); var7++) {
               int var8 = var6.u3(var7);
               if (var3 == var6.a6(var7)) {
                  com.aspose.slides.internal.k5.u9 var9 = var6.k5(var7);
                  if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.y4.t4.class) && var5.n5().u3().k5() != null) {
                     com.aspose.slides.internal.y4.t4 var10 = com.aspose.slides.internal.v6g.k5.n5(var9, com.aspose.slides.internal.y4.t4.class);
                     int var11 = d1.k5(var5.n5().u3().k5(), '/');
                     String var12 = d1.l6(var5.n5().u3().k5(), 0, ++var11);
                     var9 = new com.aspose.slides.internal.y4.t4(d1.n5(new String[]{var12, var10.l6()}));
                  }

                  var1.n5(var8, var9);
                  var1.n5(var8, var6.a6(var7));
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private com.aspose.slides.internal.y4.z1 a6(String var1) {
      com.aspose.slides.internal.y4.z1 var2 = new com.aspose.slides.internal.y4.z1(this);
      h0$l6 var3 = new h0$l6(null);
      IGenericEnumerator var4 = this.n5().l6().iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k5.j5 var5 = (com.aspose.slides.internal.k5.j5)var4.next();
            h0$l6 var6 = this.n5(var5, var1);
            if (var6.n5() != 0) {
               var3.n5(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.n5(var2, var3, false);
      this.n5(var2, var3, true);
      return var2;
   }

   public final com.aspose.slides.internal.k5.u9 n5(String var1, int var2) {
      com.aspose.slides.internal.y4.z1 var3 = this.n5().n5(var1);
      if (var3 == null) {
         var3 = this.a6(var1);
         this.n5().n5(var1, var3);
      }

      com.aspose.slides.internal.k5.u9 var4 = var3.n5(var2);
      if (var3.k5(var2)) {
         return var4;
      }

      com.aspose.slides.internal.n3.m1 var5 = this.u9(var2);

      try {
         var4 = var5.n5(null, this, var1, var3, var4, var2);
      } catch (RuntimeException var7) {
         this.u3().n5(com.aspose.slides.internal.z8.u9.n5(var7));
         var4 = var5.n5(null, this, var1, var3, var5.u3(), var2);
      }

      var3.n5(var2, var4);
      var3.l6(var2, true);
      return var4;
   }

   public static com.aspose.slides.internal.k5.k7 n5(com.aspose.slides.internal.j3.z3 var0) {
      com.aspose.slides.internal.j3.z8 var1 = var0.a5();

      do {
         com.aspose.slides.internal.k5.k7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k5.k7.class);
         if (var2 != null) {
            return var2;
         }

         var1 = var1.a5();
      } while (var1 != null);

      return null;
   }

   @Override
   public final void n5(com.aspose.slides.internal.k5.m1 var1) {
      com.aspose.slides.internal.j3.z1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j3.z1.class);
      if (var2 != null) {
         if (var2.e2() != null) {
            this.l6(var1);
            this.l6(var2.e2());
         }
      }
   }

   @Override
   public final Dictionary<Integer, com.aspose.slides.internal.y4.z1> u9() {
      Dictionary var1 = new Dictionary();
      var1.addItem(6, this.a6(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.t9.s7.class), 6)));
      var1.addItem(7, this.a6(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.t9.s7.class), 7)));
      var1.addItem(8, this.a6(com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.t9.s7.class), 8)));
      return var1;
   }

   @Override
   public final boolean t2(int var1) {
      IGenericEnumerator var2 = this.n5().l6().iterator();

      try {
         while (var2.hasNext()) {
            f2 var3 = (f2)var2.next();
            com.aspose.slides.internal.k5.j5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k5.j5.class);
            if (var4 != null) {
               IGenericEnumerator var5 = var4.l6().iterator();

               try {
                  while (var5.hasNext()) {
                     com.aspose.slides.internal.k5.q0 var6 = (com.aspose.slides.internal.k5.q0)var5.next();
                     if (var6.n5() == 6) {
                        n3 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, n3.class);
                        if (var7 != null) {
                           IGenericEnumerator var8 = var7.h0().iterator();

                           try {
                              while (var8.hasNext()) {
                                 b3 var9 = (b3)var8.next();
                                 g7 var10 = (g7)var9;
                                 if (var10.n5(null, s3.n5(com.aspose.slides.internal.t9.s7.class, var1))) {
                                    return true;
                                 }
                              }
                           } finally {
                              if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                                 var8.dispose();
                              }
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   @Override
   public final com.aspose.slides.internal.k5.y4 l6(com.aspose.slides.internal.k5.k7 var1) {
      return new a6((com.aspose.slides.internal.j3.z3)var1);
   }

   @Override
   public final com.aspose.slides.internal.t9.c8 h0() {
      return this.c8;
   }

   @Override
   public final void k5(String var1) {
      this.z1 = this.n5(var1);
   }

   @Override
   public final void u3(String var1) {
      this.t4 = this.n5(var1);
   }

   public final a0 c8() {
      return this.t2;
   }

   @Override
   public final void k5(com.aspose.slides.internal.k5.k7 var1) {
      this.l6(com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j3.z3.class));
   }

   private void l6(com.aspose.slides.internal.j3.z3 var1) {
      com.aspose.slides.internal.k5.k7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k5.k7.class);
      if (var2 != null) {
         com.aspose.slides.internal.y4.z1 var3 = var2.n5(null);
         if (var3 == null) {
            var3 = this.n5(var1, null);
            var2.n5(null, var3);
         }

         int var4 = this.u3(92);
         com.aspose.slides.internal.k5.u9 var5 = var3.n5(var4);
         if (var5 == null || !"none".equals(var5.u9())) {
            int var6 = this.u3(85);
            int var7 = this.u3(84);
            int var8 = this.u3(83);
            com.aspose.slides.internal.k5.u9 var9 = var3.n5(var6);
            if (var9 != null) {
               this.n5(var2, var9, null);
            }

            com.aspose.slides.internal.k5.u9 var10 = var3.n5(var7);
            if (var10 != null) {
               this.l6(var2, var10, null);
            }

            var3 = var2.n5("before");
            if (var3 == null) {
               var3 = this.n5(var1, "before");
               var2.n5("before", var3);
            }

            if (var3.n5(var8) != null) {
               var9 = var3.n5(var6);
               if (var9 != null) {
                  this.n5(var2, var9, "before");
               }

               var10 = var3.n5(var7);
               if (var10 != null) {
                  this.l6(var2, var10, "before");
               }
            }

            var3 = var2.n5("after");
            if (var3 == null) {
               var3 = this.n5(var1, "after");
               var2.n5("after", var3);
            }

            if (var3.n5(var8) != null) {
               var9 = var3.n5(var6);
               if (var9 != null) {
                  this.n5(var2, var9, "after");
               }

               var10 = var3.n5(var7);
               if (var10 != null) {
                  this.l6(var2, var10, "after");
               }
            }
         }

         com.aspose.slides.internal.k5.k7 var14 = n5(var1);
         if (var14 != null) {
            com.aspose.slides.internal.y4.z1 var15 = var14.n5(null);
            if (var15 != null) {
               int var16 = this.a6();

               for (int var19 = 0; var19 < var16; var19++) {
                  com.aspose.slides.internal.k5.u9 var22 = var15.n5(var19);
                  com.aspose.slides.internal.k5.u9 var11 = var3.n5(var19);
                  if (var22 != null && var11 == null && this.u9(var19).k5()) {
                     this.n5(var2, null, var19);
                  }
               }
            }
         }
      }

      for (com.aspose.slides.internal.j3.z8 var13 = var1.t1(); var13 != null; var13 = var13.z7()) {
         if (var13.n3() == 1) {
            this.l6((com.aspose.slides.internal.j3.z3)var13);
         }
      }
   }

   private void l6(com.aspose.slides.internal.k5.m1 var1) {
      IGenericEnumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k5.j5 var3 = (com.aspose.slides.internal.k5.j5)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.k5.j5 var1) {
      IGenericEnumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k5.q0 var3 = (com.aspose.slides.internal.k5.q0)var2.next();
            switch (var3.n5()) {
               case 3:
                  s7 var4 = (s7)var3;
                  if (var4.h0() != null) {
                     if (var4.c8().l6() != 0L) {
                        if (var4.c8().n5(this.k5().k5().k5())) {
                           this.n5(var4.h0());
                        }
                     } else {
                        this.n5(var4.h0());
                     }
                  }
                  break;
               case 11:
                  this.c8.n5((u9)var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.k5.k7 var1, com.aspose.slides.internal.k5.u9 var2, String var3) {
      if (var2 != com.aspose.slides.internal.k5.l6$n5.a0) {
         m3 var4 = (m3)var1.l6();
         IGenericEnumerator var5 = ((com.aspose.slides.internal.k5.h0)var2).iterator();
         String var6 = null;

         while (var5.hasNext()) {
            com.aspose.slides.internal.k5.u3 var7 = (com.aspose.slides.internal.k5.u3)var5.next();
            if (var7 == com.aspose.slides.internal.k5.l6$n5.a0) {
               break;
            }

            if (var7.n5() == 21) {
               if (var6 != null) {
                  var4.k5(var6, var3);
               }

               var6 = var7.l6();
            } else if (var7.n5() == 1 && var6 != null) {
               var4.l6(var6, var7.l6((short)1), var3);
               var6 = null;
            }
         }

         if (var6 != null) {
            var4.k5(var6, var3);
         }
      }
   }

   private void l6(com.aspose.slides.internal.k5.k7 var1, com.aspose.slides.internal.k5.u9 var2, String var3) {
      if (var2 != com.aspose.slides.internal.k5.l6$n5.a0) {
         m3 var4 = (m3)var1.l6();
         IGenericEnumerator var5 = ((com.aspose.slides.internal.k5.h0)var2).iterator();
         String var6 = null;

         while (var5.hasNext()) {
            com.aspose.slides.internal.k5.u3 var7 = (com.aspose.slides.internal.k5.u3)var5.next();
            if (var7 == com.aspose.slides.internal.k5.l6$n5.a0) {
               break;
            }

            if (var7.n5() == 21) {
               if (var6 != null) {
                  var4.l6(var6, var3);
               }

               var6 = var7.l6();
            } else if (var7.n5() == 1 && var6 != null) {
               var4.n5(var6, var7.l6((short)1), var3);
               var6 = null;
            }
         }

         if (var6 != null) {
            var4.l6(var6, var3);
         }
      }
   }
}
