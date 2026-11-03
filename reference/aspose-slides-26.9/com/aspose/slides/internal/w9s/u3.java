package com.aspose.slides.internal.w9s;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.d0e.c8;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.d8v.a6;
import com.aspose.slides.internal.j7.s7;
import com.aspose.slides.internal.l5.u9;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.p6;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class u3 {
   private u9 n5;
   private final com.aspose.slides.internal.b5j.u3 l6;
   private final k5 k5;
   private final x8 u3;
   private final n3 a6;
   private final com.aspose.slides.internal.b5j.u9 u9;
   private final t9 h0;
   private com.aspose.slides.internal.h0i.k5 c8;
   private final s7 t2 = new s7();
   private final Stack<m1> s7 = new Stack<>();
   private final m1 x8 = new m1(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "circle",
      "ellipse",
      "line",
      "rect",
      "polyline",
      "polygon",
      "path",
      "text",
      "tspan",
      "rawText",
      "image",
      "feFlood",
      "feBlend",
      "feColorMatrix",
      "feOffset",
      "feGaussianBlur",
      "feComposite",
      "in",
      "out",
      "atop",
      "xor",
      "over"
   );

   public final u9 n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.b5j.u3 l6() {
      return this.l6;
   }

   public final k5 k5() {
      return this.k5;
   }

   public final x8 u3() {
      return this.u3;
   }

   public final n3 a6() {
      return this.a6;
   }

   public final com.aspose.slides.internal.b5j.u9 u9() {
      return this.u9;
   }

   public final t9 h0() {
      return this.h0;
   }

   public final s7 c8() {
      return this.t2;
   }

   public u3(u9 var1, k5 var2, x8 var3, n3 var4, com.aspose.slides.internal.b5j.u9 var5, t9 var6, com.aspose.slides.internal.b5j.u3 var7) {
      this.n5 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.l6 = var7;
      this.u9 = var5;
      this.h0 = var6;
   }

   public final void n5(t2 var1, f2 var2, a0 var3) {
      try {
         for (int var4 = 0; var4 < var1.j5().n5(); var4++) {
            t2 var5 = var1.j5().l6(var4);
            if (!"rawText".equals(var5.u9)
               || com.aspose.slides.internal.v6g.k5.l6(var5.z8(), com.aspose.slides.internal.j7h.k5.class)
               || com.aspose.slides.internal.v6g.k5.l6(var5.n5, com.aspose.slides.internal.j7h.l6.class)) {
               this.l6(var5, var2.a6(), var3);
            }
         }
      } catch (RuntimeException var6) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var6;
         }
      }
   }

   public final void l6(t2 var1, f2 var2, a0 var3) {
      if (y4.n5(var1)) {
         a6 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, a6.class);
         if (var4 != null) {
            this.n5(var4, var2.a6(), var3);
         } else {
            boolean var5 = var1.l6.n5("transform");
            if (var5) {
               m1 var6 = this.h0.n5(var1.l6.k5("transform"), var2.a6());
               if (var6.equals(this.x8)) {
                  return;
               }

               this.n5(var6);
            }

            a0 var16 = null;
            a0 var7 = null;
            if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d0e.n5.class)) {
               a0 var8 = com.aspose.slides.internal.f5n.k5.n5(this, (com.aspose.slides.internal.d0e.n5)var1, var2.a6(), var1);
               if (var8 != null) {
                  if (var3 == null) {
                     var16 = this.n5().l6();
                     this.n5().n5(var8, 1);
                  } else {
                     var7 = var8;
                  }
               }
            }

            com.aspose.slides.internal.u3t.l6 var17 = com.aspose.slides.internal.f5n.k5.n5(this, var1);
            com.aspose.slides.internal.k7d.u9 var9 = com.aspose.slides.internal.f5n.k5.l6(this, var1);

            try {
               if (var9 != null && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d0e.n5.class)) {
                  this.n5(var9, var1, var2.a6(), var3);
               } else if (var17 != null && com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d0e.n5.class)) {
                  if (var16 == null) {
                     var16 = this.n5().l6();
                  }

                  y1 var10 = ((com.aspose.slides.internal.d0e.n5)var1).n5(this.a6(), var2.a6()).y4();
                  this.n5().n5(var10.y4(), 1);
                  this.n5(var17, var1, var2.a6());
               } else {
                  this.k5(var1, var2.a6(), var3);
               }
            } catch (RuntimeException var14) {
               if (!com.aspose.slides.internal.n1n.n5.n5) {
                  throw var14;
               }
            } finally {
               if (var16 != null) {
                  this.n5().n5(var16, 0);
               }

               if (var7 != null) {
                  var3.k5(var7);
               }

               if (var5) {
                  this.t2();
               }
            }
         }
      }
   }

   private void n5(a6 var1, f2 var2, a0 var3) {
      y1 var4 = var1.n5(this.a6, var2.a6()).y4();
      f2 var5 = new f2((float)q1.l6((double)var4.s7()), (float)q1.l6((double)var4.k5()));
      a0 var6 = this.n5().l6();

      try {
         if (var1.f2()) {
            this.n5().l6(new a0(new y1(new w1(var4.x8(), var4.n3()), var5.a6())));
         }

         m1 var7 = new m1();
         com.aspose.slides.internal.b3z.s7 var8 = var1.i1();
         f2 var9 = (var8 != null ? var8.n5(this.a6()).c8() : var5).a6();
         y1 var10 = y4.n5(var1.e5(), new y1(w1.n5.u3(), var9.a6()), var4.y4()).y4();
         if (var8 != null) {
            var7.l6(-var8.n5(this.a6()).x8(), -var8.n5(this.a6()).n3(), 1);
         }

         var7.n5(var10.s7() / var9.l6(), var10.k5() / var9.k5(), 1);
         var7.l6(var10.x8(), var10.n3(), 1);
         this.n5(var7);
         this.n5((t2)var1, var9.a6(), var3);
      } finally {
         this.t2();
         this.n5().l6(var6);
      }
   }

   public final void k5(t2 var1, f2 var2, a0 var3) {
      String var4 = var1.l6.k5("visibility");
      if (!d1.u3("hidden", var4, (short)3) && !d1.u3("collapse", var4, (short)3)) {
         String var5 = var1.l6.k5("display");
         if (!d1.u3("none", var5, (short)3)) {
            if (y4.l6(var1)) {
               if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.d8v.l6.class)) {
                  List var6 = com.aspose.slides.internal.f5n.k5.n5(this.u9().n5(), var1.l6.k5("class"), null);
                  List$Enumerator var7 = var6.iterator();

                  try {
                     while (var7.hasNext()) {
                        com.aspose.slides.internal.k5.n5 var8 = (com.aspose.slides.internal.k5.n5)var7.next();
                        if (d1.u3("hidden", var8.h9(), (short)3) || d1.u3("collapse", var8.h9(), (short)3)) {
                           return;
                        }

                        if (d1.u3("none", var8.a5(), (short)3)) {
                           return;
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                        var7.dispose();
                     }
                  }
               }

               try {
                  int var20 = com.aspose.slides.internal.a3s.l6.k5(var3 != null ? var1.w1() : var1.r4());
                  switch (n3.n5(var1.u9)) {
                     case 0:
                        com.aspose.slides.internal.i1k.n5 var21 = (com.aspose.slides.internal.i1k.n5)var1;
                        com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7(var20);
                        var22.n5(var21.n5(this.a6, var2.a6()).y4());
                        if (var3 != null) {
                           com.aspose.slides.internal.f5n.k5.n5(var3, var22, this, var1, var2.a6());
                        } else {
                           com.aspose.slides.internal.f5n.k5.n5(this, var22, var1, var2.a6());
                        }
                        break;
                     case 1:
                        com.aspose.slides.internal.i1k.l6 var9 = (com.aspose.slides.internal.i1k.l6)var1;
                        com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7(var20);
                        var10.n5(var9.n5(this.a6(), var2.a6()).y4());
                        if (var3 != null) {
                           com.aspose.slides.internal.f5n.k5.n5(var3, var10, this, var1, var2.a6());
                        } else {
                           com.aspose.slides.internal.f5n.k5.n5(this, var10, var1, var2.a6());
                        }
                        break;
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 6:
                        List var11 = ((com.aspose.slides.internal.z9u.n5)var1).l6(this.a6, var2.a6());
                        com.aspose.slides.internal.x4g.s7 var12 = com.aspose.slides.internal.w9s.n5.n5(var11);
                        var12.n5(var20);
                        if (var3 != null) {
                           com.aspose.slides.internal.f5n.k5.n5(var3, var12, this, var1, var2.a6());
                        } else {
                           com.aspose.slides.internal.f5n.k5.n5(this, var12, var1, var2.a6());
                        }
                        break;
                     case 7:
                        this.c8 = new com.aspose.slides.internal.h0i.k5(this, var3);
                        this.c8.n5((com.aspose.slides.internal.j7h.u3)var1, var2.a6());
                        break;
                     case 8:
                        this.c8.n5((com.aspose.slides.internal.j7h.u3)var1, var2.a6());
                        break;
                     case 9:
                        if ("text".equals(var1.n5.u9) || "tspan".equals(var1.n5.u9)) {
                           this.c8.n5((com.aspose.slides.internal.j7h.n5)var1, var2.a6());
                        }
                        break;
                     case 10:
                        try {
                           com.aspose.slides.internal.f5n.n5.n5(this, (com.aspose.slides.internal.d8v.k5)var1, var2.a6());
                        } catch (c8 var17) {
                        }
                  }

                  this.n5(var1, var2.a6(), var3);
               } catch (RuntimeException var18) {
                  if (!com.aspose.slides.internal.n1n.n5.n5) {
                     throw var18;
                  }
               }
            }
         }
      }
   }

   public final void n5(m1 var1) {
      this.s7.push(this.n5.a6());
      m1 var2 = this.n5.a6().u9();
      var2.n5(var1, 0);
      this.n5.n5(var2);
   }

   public final void t2() {
      this.n5.n5(this.s7.pop());
   }

   private com.aspose.slides.internal.o9b.l6 n5(t2 var1, f2 var2) {
      return this.n5((t2)var1, var2, (m1)null);
   }

   private com.aspose.slides.internal.o9b.l6 n5(t2 var1, f2 var2, m1 var3) {
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var2.l6()), 14), com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var2.k5()), 14)
      );
      com.aspose.slides.internal.l5.u3 var5 = new com.aspose.slides.internal.l5.u3(var4);
      u9 var6 = com.aspose.slides.internal.l5.u9.n5(var5);

      try {
         var6.k5(2);
         var6.l6(2);
         if (var3 != null && !var3.l6()) {
            var6.n5(var3, 0);
         }

         var6.l6(this.n5().l6());
         u3 var7 = new u3(var6, this.k5(), this.u3(), this.a6(), this.u9(), this.h0(), this.l6());
         var7.k5(var1, var2.a6(), null);
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return var4;
   }

   private void n5(com.aspose.slides.internal.u3t.l6 var1, t2 var2, f2 var3) {
      com.aspose.slides.internal.o9b.l6 var4 = this.n5(var2, var3.a6());

      try {
         a0 var5 = this.n5().l6().l6();
         f2 var6 = new f2();
         if (var1.d2() == 0) {
            var3.l6(var6);
         } else {
            y1 var7 = ((com.aspose.slides.internal.d0e.n5)var2).n5(this.a6(), var3.a6()).y4();
            var7.c8().l6(var6);
         }

         com.aspose.slides.internal.l5.u3 var28 = this.n5(var1, var4, var6.a6(), var5);

         try {
            y1 var8 = new y1(0.0F, 0.0F, var28.u9(), var28.h0());
            a0 var9 = this.n5().l6();
            int var10 = this.n5().u3();
            int var11 = this.n5().k5();

            try {
               this.n5().l6(3);
               this.n5().n5(0);
               this.n5().n5(var5, 1);
               y2 var12 = this.n5(var5).n3();
               this.n5().n5(var28, var12.n3(), 0.0F, 0.0F, var8.s7(), var8.k5(), 2);
            } finally {
               this.n5().l6(var10);
               this.n5().n5(var9, 0);
               this.n5().n5(var11);
            }
         } finally {
            if (var28 != null) {
               var28.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   private com.aspose.slides.internal.l5.u3 n5(com.aspose.slides.internal.u3t.l6 var1, com.aspose.slides.internal.o9b.l6 var2, f2 var3, a0 var4) {
      a0 var5 = var4.l6();

      try {
         var5.l6(new y1(0.0F, 0.0F, var3.l6(), var3.k5()));
         com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var3.l6()), 14), com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var3.k5()), 14)
         );
         com.aspose.slides.internal.l5.u3 var7 = new com.aspose.slides.internal.l5.u3(var6);

         try {
            u9 var8 = com.aspose.slides.internal.l5.u9.n5(var7);

            try {
               var8.k5(2);
               var8.l6(2);
               var8.l6(var4);
               u3 var9 = new u3(var8, this.k5(), this.u3(), this.a6(), this.u9(), this.h0(), this.l6());
               var9.n5(var1, var3.a6(), (com.aspose.slides.internal.o9b.a0)null);
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            y2 var31 = this.n5(var4).n3();
            var31.k5(q1.n5(0, var31.s7()));
            var31.u3(q1.n5(0, var31.x8()));
            var31.l6(q1.l6(var6.e2() - var31.s7(), var31.t2()));
            var31.n5(q1.l6(var6.h0() - var31.x8(), var31.l6()));
            com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(var31.t2(), var31.l6());

            for (int var11 = var31.u3(); var11 < var31.u9(); var11++) {
               for (int var12 = var31.c8(); var12 < var31.n5(); var12++) {
                  com.aspose.slides.internal.o9b.c8 var13 = var6.l6(var11, var12).o8();
                  com.aspose.slides.internal.o9b.c8 var14 = var2.l6(var11, var12).o8();
                  float var15 = (var13.x8() & 0xFF) * 0.2125F + (var13.n3() & 0xFF) * 0.7154F + (var13.y4() & 0xFF) * 0.0721F;
                  com.aspose.slides.internal.o9b.c8 var16 = ((var14.s7() & 255) == 0
                        ? var14
                        : com.aspose.slides.internal.o9b.c8.n5(
                           com.aspose.slides.internal.v6g.k5.u3((var13.s7() & 0xFF) * var15 / 255.0F, 13), var14.x8() & 255, var14.n3() & 255, var14.y4() & 255
                        ))
                     .o8();
                  var10.n5(var11 - var31.u3(), var12 - var31.c8(), var16.o8());
               }
            }

            return new com.aspose.slides.internal.l5.u3(var10);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private y2 n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      y1 var2 = ((com.aspose.slides.internal.n7.l6)this.n5()).n5(var1).y4();
      return new y2(j5.n5(var2.u9().u3()).k5(), p8.n5(var2.c8().a6()).u3());
   }

   private void n5(com.aspose.slides.internal.k7d.u9 var1, t2 var2, f2 var3, a0 var4) {
      y1 var5 = new y1();
      if (var1.a0() == 0) {
         var1.n5(this.a6(), var3.a6()).a6(var5);
      } else {
         y1 var6 = ((com.aspose.slides.internal.d0e.n5)var2).n5(this.a6(), var3.a6()).y4();
         y1 var7 = var1.n5(this.a6(), var6.c8().a6()).y4();
         var5 = new y1(var6.x8() + var7.x8(), var6.n3() + var7.n3(), q1.l6(var7.s7(), var3.l6()), q1.l6(var7.k5(), var3.k5()));
      }

      y1 var28 = var5.y4();
      if (var4 != null) {
         com.aspose.slides.internal.f5n.k5.n5(var4, var28.y4(), this, var2, var3.a6());
      } else {
         p8.n5(p8.l6(var28.c8().a6())).l6(var3);
         a0 var29 = this.n5().l6().l6();

         try {
            this.n5().n5(var28.y4(), 1);
            m1 var8 = new m1(1.0F, 0.0F, 0.0F, 1.0F, -var28.x8(), -var28.n3());
            com.aspose.slides.internal.o9b.l6 var9 = this.n5(var2, var3.a6(), var8);

            try {
               com.aspose.slides.internal.o9b.l6 var10 = this.n5(var1, var9);
               com.aspose.slides.internal.l5.u3 var11 = new com.aspose.slides.internal.l5.u3(var10);

               try {
                  y1 var12 = new y1(0.0F, 0.0F, var11.u9(), var11.h0());
                  this.n5().n5(var11, y1.n5(y2.l6(var28.y4())).y4(), var12.y4(), 2);
               } finally {
                  if (var11 != null) {
                     var11.dispose();
                  }
               }
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         } finally {
            this.n5().n5(var29, 0);
         }
      }
   }

   private com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.k7d.u9 var1, com.aspose.slides.internal.o9b.l6 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("filter");
      }

      if (var2 == null) {
         throw new ArgumentNullException("rasterizedNodeImage");
      }

      int var3 = var2.e2();
      int var4 = var2.h0();
      Dictionary var5 = new Dictionary<>(p6.u3());
      var5.set_Item("SourceGraphic", var2);
      com.aspose.slides.internal.o9b.l6 var6 = var2;
      int var7 = 1;
      SortedList var8 = new SortedList();
      IGenericEnumerator var9 = var1.j5().iterator();

      try {
         while (var9.hasNext()) {
            KeyValuePair var10 = (KeyValuePair)var9.next();
            if (com.aspose.slides.internal.k7d.u9.s7(((t2)var10.getValue()).u9)) {
               var8.addItem(var10.getKey(), var10.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      String var75 = "SourceGraphic";
      IGenericEnumerator var11 = var8.iterator();

      try {
         while (var11.hasNext()) {
            KeyValuePair var12 = (KeyValuePair)var11.next();
            t2 var13 = (t2)var12.getValue();
            String var14 = var13.l6.n5("result") ? var13.l6.k5("result") : null;
            if (d1.n5(var14)) {
               var14 = d1.n5(new String[]{"__auto", a3.l6(var7++)});
            }

            switch (n3.n5(var13.u9)) {
               case 11:
                  com.aspose.slides.internal.k7d.k5 var78 = (com.aspose.slides.internal.k7d.k5)var13;
                  float var80 = var78.d2();
                  com.aspose.slides.internal.b3z.u3 var81 = com.aspose.slides.internal.b3z.u3.n5(var78.a0(), var80);
                  com.aspose.slides.internal.o9b.l6 var82 = new com.aspose.slides.internal.o9b.l6(var3, var4);
                  z1 var83 = z1.n5(var82);

                  try {
                     i1 var84 = new i1(var81.n5().o8());

                     try {
                        var83.n5(var84, 0, 0, var3, var4);
                     } finally {
                        if (var84 != null) {
                           var84.dispose();
                        }
                     }
                  } finally {
                     if (var83 != null) {
                        var83.dispose();
                     }
                  }

                  var5.set_Item(var14, var82);
                  var6 = var82;
                  break;
               case 12:
                  com.aspose.slides.internal.k7d.n5 var15 = (com.aspose.slides.internal.k7d.n5)var13;
                  String var79 = !d1.n5(var15.d2()) ? var15.d2() : d1.n5(new String[]{"__auto", a3.l6(var7 - 1)});
                  if (!var5.containsKey(var79)) {
                     throw new InvalidOperationException(d1.n5(new String[]{"feBlend input2 not found: ", var79}));
                  }

                  com.aspose.slides.internal.o9b.l6 var17 = (com.aspose.slides.internal.o9b.l6)var5.get_Item(var79);
                  com.aspose.slides.internal.o9b.l6 var18 = n5(var15.a0(), var75, var13.u9, var5);
                  com.aspose.slides.internal.o9b.l6 var19 = n5(var17, var18, var15.s3());
                  var5.set_Item(var14, var19);
                  var6 = var19;
                  break;
               case 13:
                  com.aspose.slides.internal.k7d.l6 var20 = (com.aspose.slides.internal.k7d.l6)var13;
                  float[][] var21 = n5(var20);
                  if (var21 == null) {
                     continue;
                  }

                  com.aspose.slides.internal.o9b.l6 var22 = n5(n5(var20.s3(), var75, var13.u9, var5), var21);
                  var5.set_Item(var14, var22);
                  var6 = var22;
                  break;
               case 14:
                  com.aspose.slides.internal.k7d.a6 var85 = (com.aspose.slides.internal.k7d.a6)var13;
                  int var86 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var85.a0()), 14);
                  int var87 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var85.d2()), 14);
                  if (var86 == 0 && var87 == 0) {
                     continue;
                  }

                  com.aspose.slides.internal.o9b.l6 var88 = n5(var85.d5(), var75, var13.u9, var5);
                  com.aspose.slides.internal.o9b.l6 var89 = new com.aspose.slides.internal.o9b.l6(var3, var4, 2498570);
                  z1 var90 = z1.n5(var89);

                  try {
                     var90.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
                     var90.l6(var88, var86, var87);
                  } finally {
                     if (var90 != null) {
                        var90.dispose();
                     }
                  }

                  var5.set_Item(var14, var89);
                  var6 = var89;
                  break;
               case 15:
                  com.aspose.slides.internal.k7d.u3 var23 = (com.aspose.slides.internal.k7d.u3)var13;
                  com.aspose.slides.internal.b3z.t2 var24 = var23.a0();
                  if (var24 == null || var24.get_Item(0) == 0.0F) {
                     continue;
                  }

                  com.aspose.slides.internal.o9b.l6 var25 = com.aspose.slides.internal.b9j.l6.n5(
                     n5(var23.d2(), var75, var13.u9, var5), com.aspose.slides.internal.b9j.l6.n5(3, var24.get_Item(0).floatValue()), 1.0F
                  );
                  var5.set_Item(var14, var25);
                  var6 = var25;
                  break;
               case 16:
                  String var26 = n5(var13, "in");
                  com.aspose.slides.internal.o9b.l6 var27 = n5(var26, var75, var13.u9, var5);
                  String var16 = n5(var13, "in2");
                  if (d1.n5(var16)) {
                     throw new InvalidOperationException("feComposite input2 is required.");
                  }

                  com.aspose.slides.internal.o9b.l6 var28 = n5(var16, var75, var13.u9, var5);
                  String var29 = n5(var13, "operator");
                  if (d1.n5(var29)) {
                     var29 = "over";
                  }

                  com.aspose.slides.internal.o9b.l6 var30 = n5(
                     var27, var28, var29, n5(var13, "k1", 0.0F), n5(var13, "k2", 0.0F), n5(var13, "k3", 0.0F), n5(var13, "k4", 0.0F)
                  );
                  var5.set_Item(var14, var30);
                  var6 = var30;
                  break;
               default:
                  throw new NotImplementedException(d1.n5(new String[]{"Filter primitive not implemented: ", var13.u9}));
            }

            var75 = var14;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      Dictionary$Enumerator var76 = var5.iterator();

      try {
         while (var76.hasNext()) {
            KeyValuePair var77 = (KeyValuePair)var76.next();
            if (var77.getValue() != var6 && var77.getValue() != var2) {
               ((com.aspose.slides.internal.o9b.l6)var77.getValue()).dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var76, IDisposable.class)) {
            var76.dispose();
         }
      }

      var5.clear();
      return var6;
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.l6 var1, int var2) {
      int var3 = var0.e2();
      int var4 = var0.h0();
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var3, var4, 2498570);
      y2 var6 = new y2(0, 0, var3, var4);
      com.aspose.slides.internal.j9e.n5 var7 = var0.n5(var6.n3(), 1, var0.s7());
      com.aspose.slides.internal.j9e.n5 var8 = var1.n5(var6.n3(), 1, var1.s7());
      com.aspose.slides.internal.j9e.n5 var9 = var5.n5(var6.n3(), 2, var5.s7());
      int var10 = q1.n5(var7.a6()) * var4;
      byte[] var11 = new byte[var10];
      byte[] var12 = new byte[var10];
      byte[] var13 = new byte[var10];
      com.aspose.slides.internal.e3m.n5.n5(var7.u3(), var11, 0, var10);
      com.aspose.slides.internal.e3m.n5.n5(var8.u3(), var12, 0, var10);

      for (int var14 = 0; var14 < var4; var14++) {
         int var15 = var14 * var7.a6();

         for (int var16 = 0; var16 < var3; var16++) {
            int var17 = var15 + var16 * 4;
            float var18 = (var11[var17 + 3] & 0xFF) / 255.0F;
            float var19 = (var12[var17 + 3] & 0xFF) / 255.0F;
            float var20 = var18 * (var11[var17 + 2] & 0xFF) / 255.0F;
            float var21 = var18 * (var11[var17 + 1] & 0xFF) / 255.0F;
            float var22 = var18 * (var11[var17 + 0] & 0xFF) / 255.0F;
            float var23 = var19 * (var12[var17 + 2] & 0xFF) / 255.0F;
            float var24 = var19 * (var12[var17 + 1] & 0xFF) / 255.0F;
            float var25 = var19 * (var12[var17 + 0] & 0xFF) / 255.0F;
            float var26 = 1.0F - (1.0F - var19) * (1.0F - var18);
            float var27 = 0.0F;
            float var28 = 0.0F;
            float var29 = 0.0F;
            switch (var2) {
               case 0:
               case 3:
               default:
                  var27 = (1.0F - var19) * var20 + var23;
                  var28 = (1.0F - var19) * var21 + var24;
                  var29 = (1.0F - var19) * var22 + var25;
                  break;
               case 1:
                  var27 = (1.0F - var19) * var20 + (1.0F - var18) * var23 + var23 * var20;
                  var28 = (1.0F - var19) * var21 + (1.0F - var18) * var24 + var24 * var21;
                  var29 = (1.0F - var19) * var22 + (1.0F - var18) * var25 + var25 * var22;
                  break;
               case 2:
                  var27 = var20 + var23 - var23 * var20;
                  var28 = var21 + var24 - var24 * var21;
                  var29 = var22 + var25 - var25 * var22;
                  break;
               case 4:
                  var27 = q1.l6((1.0F - var19) * var20 + var23, (1.0F - var18) * var23 + var20);
                  var28 = q1.l6((1.0F - var19) * var21 + var24, (1.0F - var18) * var24 + var21);
                  var29 = q1.l6((1.0F - var19) * var22 + var25, (1.0F - var18) * var25 + var22);
                  break;
               case 5:
                  var27 = q1.n5((1.0F - var19) * var20 + var23, (1.0F - var18) * var23 + var20);
                  var28 = q1.n5((1.0F - var19) * var21 + var24, (1.0F - var18) * var24 + var21);
                  var29 = q1.n5((1.0F - var19) * var22 + var25, (1.0F - var18) * var25 + var22);
            }

            if (var26 > 0.0F) {
               var27 /= var26;
               var28 /= var26;
               var29 /= var26;
            }

            var13[var17 + 0] = n5(var29 * 255.0F);
            var13[var17 + 1] = n5(var28 * 255.0F);
            var13[var17 + 2] = n5(var27 * 255.0F);
            var13[var17 + 3] = n5(var26 * 255.0F);
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var13, 0, var9.u3(), var10);
      var0.n5(var7);
      var1.n5(var8);
      var5.n5(var9);
      return var5;
   }

   private static com.aspose.slides.internal.o9b.l6 n5(String var0, String var1, String var2, Dictionary<String, com.aspose.slides.internal.o9b.l6> var3) {
      String var4 = !d1.n5(var0) ? var0 : var1;
      if (!var3.containsKey(var4)) {
         if (!"SourceAlpha".equals(var4)) {
            throw new InvalidOperationException(d1.n5(new String[]{var2, " input not found: ", var4}));
         }

         var3.set_Item(var4, n5((com.aspose.slides.internal.o9b.l6)var3.get_Item("SourceGraphic")));
      }

      return (com.aspose.slides.internal.o9b.l6)var3.get_Item(var4);
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, float[][] var1) {
      int var2 = var0.e2();
      int var3 = var0.h0();
      y2 var4 = new y2(0, 0, var2, var3);
      com.aspose.slides.internal.j9e.n5 var5 = var0.n5(var4.n3(), 1, var0.s7());
      int var6 = q1.n5(var5.a6()) * var3;
      byte[] var7 = new byte[var6];
      byte[] var8 = new byte[var6];
      com.aspose.slides.internal.e3m.n5.n5(var5.u3(), var7, 0, var6);

      for (int var9 = 0; var9 < var3; var9++) {
         int var10 = var9 * var5.a6();

         for (int var11 = 0; var11 < var2; var11++) {
            int var12 = var10 + var11 * 4;
            float var13 = (var7[var12] & 0xFF) / 255.0F;
            float var14 = (var7[var12 + 1] & 0xFF) / 255.0F;
            float var15 = (var7[var12 + 2] & 0xFF) / 255.0F;
            float var16 = (var7[var12 + 3] & 0xFF) / 255.0F;
            float var17 = var1[0][0] * var15 + var1[0][1] * var14 + var1[0][2] * var13 + var1[0][3] * var16 + var1[0][4];
            float var18 = var1[1][0] * var15 + var1[1][1] * var14 + var1[1][2] * var13 + var1[1][3] * var16 + var1[1][4];
            float var19 = var1[2][0] * var15 + var1[2][1] * var14 + var1[2][2] * var13 + var1[2][3] * var16 + var1[2][4];
            float var20 = var1[3][0] * var15 + var1[3][1] * var14 + var1[3][2] * var13 + var1[3][3] * var16 + var1[3][4];
            var8[var12] = n5(var19 * 255.0F);
            var8[var12 + 1] = n5(var18 * 255.0F);
            var8[var12 + 2] = n5(var17 * 255.0F);
            var8[var12 + 3] = n5(var20 * 255.0F);
         }
      }

      com.aspose.slides.internal.o9b.l6 var21 = new com.aspose.slides.internal.o9b.l6(var2, var3, 2498570);
      com.aspose.slides.internal.j9e.n5 var22 = var21.n5(var4.n3(), 2, var21.s7());
      com.aspose.slides.internal.e3m.n5.n5(var8, 0, var22.u3(), var6);
      var0.n5(var5);
      var21.n5(var22);
      return var21;
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0) {
      int var1 = var0.e2();
      int var2 = var0.h0();
      y2 var3 = new y2(0, 0, var1, var2);
      com.aspose.slides.internal.j9e.n5 var4 = var0.n5(var3.n3(), 1, var0.s7());
      int var5 = q1.n5(var4.a6()) * var2;
      byte[] var6 = new byte[var5];
      byte[] var7 = new byte[var5];
      com.aspose.slides.internal.e3m.n5.n5(var4.u3(), var6, 0, var5);

      for (int var8 = 0; var8 < var2; var8++) {
         int var9 = var8 * var4.a6();

         for (int var10 = 0; var10 < var1; var10++) {
            int var11 = var9 + var10 * 4;
            byte var12 = var6[var11 + 3];
            var7[var11] = 0;
            var7[var11 + 1] = 0;
            var7[var11 + 2] = 0;
            var7[var11 + 3] = var12;
         }
      }

      com.aspose.slides.internal.o9b.l6 var13 = new com.aspose.slides.internal.o9b.l6(var1, var2, 2498570);
      com.aspose.slides.internal.j9e.n5 var14 = var13.n5(var3.n3(), 2, var13.s7());
      com.aspose.slides.internal.e3m.n5.n5(var7, 0, var14.u3(), var5);
      var0.n5(var4);
      var13.n5(var14);
      return var13;
   }

   private static float[][] n5(com.aspose.slides.internal.k7d.l6 var0) {
      com.aspose.slides.internal.b3z.t2 var1 = var0.d5();
      switch (var0.d2()) {
         case 1:
            return com.aspose.slides.internal.b9j.n5.n5(var1 == null ? 1.0F : var1.get_Item(0)).l6();
         case 2:
            return com.aspose.slides.internal.b9j.n5.l6(var1 == null ? 0.0F : var1.get_Item(0)).l6();
         case 3:
            return com.aspose.slides.internal.b9j.n5.n5().l6();
         default:
            if (var1.size() < 20) {
               return (float[][])null;
            } else {
               float[][] var2 = new float[4][5];
               int var3 = 0;

               for (int var4 = 0; var4 < 4; var4++) {
                  for (int var5 = 0; var5 < 5; var5++) {
                     float var6 = var1.get_Item(var3++);
                     var2[var4][var5] = var6 > 1.0F ? 1.0F : var6;
                  }
               }

               return var2;
            }
      }
   }

   private static byte n5(float var0) {
      return com.aspose.slides.internal.v6g.k5.n5((Object)(var0 < 0.0F ? 0.0F : (var0 > 255.0F ? 255.0F : var0)), 13);
   }

   private static String n5(t2 var0, String var1) {
      if (var0 == null || d1.n5(var1)) {
         return null;
      } else {
         return var0.l6.n5(var1) ? var0.l6.k5(var1) : null;
      }
   }

   private static float n5(t2 var0, String var1, float var2) {
      String var3 = n5(var0, var1);
      float var4 = 0.0F;
      if (d1.n5(var3)) {
         return var2;
      }

      float[] var5 = new float[]{0.0F};
      boolean var6 = n1.n5(var3, 167, com.aspose.slides.internal.x7n.l6.k5(), var5);
      var4 = var5[0];
      if (var6) {
         return var4;
      }

      var5[0] = var4;
      boolean var7 = n1.n5(var3, 167, com.aspose.slides.internal.x7n.l6.u3(), var5);
      var4 = var5[0];
      return var7 ? var4 : var2;
   }

   private static com.aspose.slides.internal.o9b.l6 n5(
      com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.l6 var1, String var2, float var3, float var4, float var5, float var6
   ) {
      if (var0 == null) {
         throw new IllegalArgumentException("input");
      }

      if (var1 == null) {
         throw new IllegalArgumentException("input2");
      }

      boolean var7 = var0 == var1;
      int var8 = Math.min(var0.e2(), var1.e2());
      int var9 = Math.min(var0.h0(), var1.h0());
      com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(var8, var9, 2498570);
      y2 var11 = new y2(0, 0, var8, var9);
      com.aspose.slides.internal.j9e.n5 var12 = null;
      com.aspose.slides.internal.j9e.n5 var13 = null;
      com.aspose.slides.internal.j9e.n5 var14 = null;

      try {
         var12 = var0.n5(var11, 1, 2498570);
         var13 = !var7 ? var1.n5(var11, 1, 2498570) : var12;
         var14 = var10.n5(var11, 2, 2498570);
         int var15 = var12.a6();
         int var16 = var12.n5();
         int var17 = var12.l6();
         byte[] var18 = new byte[var15];
         byte[] var19 = new byte[var15];
         byte[] var20 = new byte[var15];
         long var21 = var12.u3().l6();
         long var23 = var13.u3().l6();
         long var25 = var14.u3().l6();
         long var27 = var15;

         for (int var29 = 0; var29 < var16; var29++) {
            com.aspose.slides.internal.e3m.n5.n5(new x9(var21), var18, 0, var15);
            com.aspose.slides.internal.e3m.n5.n5(new x9(var23), var19, 0, var15);
            byte var30 = 0;
            byte var31 = 0;
            byte var32 = 0;

            for (int var33 = 0; var33 < var17; var33++) {
               float var34 = (var18[var30] & 0xFF) / 255.0F;
               float var35 = (var18[var30 + 1] & 0xFF) / 255.0F;
               float var36 = (var18[var30 + 2] & 0xFF) / 255.0F;
               float var37 = (var18[var30 + 3] & 0xFF) / 255.0F;
               float var38 = (var19[var31] & 0xFF) / 255.0F;
               float var39 = (var19[var31 + 1] & 0xFF) / 255.0F;
               float var40 = (var19[var31 + 2] & 0xFF) / 255.0F;
               float var41 = (var19[var31 + 3] & 0xFF) / 255.0F;
               float var42;
               float var43;
               float var44;
               float var45;
               if (var2.equals("arithmetic")) {
                  var42 = l6(var3 * var34 * var38 + var4 * var34 + var5 * var38 + var6);
                  var43 = l6(var3 * var35 * var39 + var4 * var35 + var5 * var39 + var6);
                  var44 = l6(var3 * var36 * var40 + var4 * var36 + var5 * var40 + var6);
                  var45 = l6(var3 * var37 * var41 + var4 * var37 + var5 * var41 + var6);
                  if (var7) {
                     var45 = var41;
                  }
               } else {
                  float var46 = 0.0F;
                  float var47 = 0.0F;
                  float var48 = 0.0F;
                  float var49 = 0.0F;
                  float[] var50 = new float[]{0.0F};
                  float[] var51 = new float[]{0.0F};
                  float[] var52 = new float[]{0.0F};
                  float[] var53 = new float[]{0.0F};
                  n5(var2, var36, var35, var34, var37, var40, var39, var38, var41, var50, var51, var52, var53);
                  var44 = var50[0];
                  var43 = var51[0];
                  var42 = var52[0];
                  var45 = var53[0];
               }

               var20[var32] = k5(var42);
               var20[var32 + 1] = k5(var43);
               var20[var32 + 2] = k5(var44);
               var20[var32 + 3] = k5(var45);
               var30 += 4;
               var31 += 4;
               var32 += 4;
            }

            com.aspose.slides.internal.e3m.n5.n5(var20, 0, new x9(var25), var15);
            var21 += var27;
            var23 += var27;
            var25 += var27;
         }
      } finally {
         if (var12 != null) {
            var0.n5(var12);
         }

         if (!var7 && var13 != null) {
            var1.n5(var13);
         }

         if (var14 != null) {
            var10.n5(var14);
         }
      }

      return var10;
   }

   private static void n5(
      String var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float[] var9,
      float[] var10,
      float[] var11,
      float[] var12
   ) {
      float var13 = var1 * var4;
      float var14 = var2 * var4;
      float var15 = var3 * var4;
      float var16 = var5 * var8;
      float var17 = var6 * var8;
      float var18 = var7 * var8;
      float var19;
      float var20;
      float var21;
      float var22;
      switch (n3.n5(var0)) {
         case 17:
            var19 = var13 * var8;
            var20 = var14 * var8;
            var21 = var15 * var8;
            var22 = var4 * var8;
            break;
         case 18:
            var19 = var13 * (1.0F - var8);
            var20 = var14 * (1.0F - var8);
            var21 = var15 * (1.0F - var8);
            var22 = var4 * (1.0F - var8);
            break;
         case 19:
            var19 = var13 * var8 + var16 * (1.0F - var4);
            var20 = var14 * var8 + var17 * (1.0F - var4);
            var21 = var15 * var8 + var18 * (1.0F - var4);
            var22 = var8;
            break;
         case 20:
            var19 = var13 * (1.0F - var8) + var16 * (1.0F - var4);
            var20 = var14 * (1.0F - var8) + var17 * (1.0F - var4);
            var21 = var15 * (1.0F - var8) + var18 * (1.0F - var4);
            var22 = var4 * (1.0F - var8) + var8 * (1.0F - var4);
            break;
         case 21:
         default:
            var19 = var13 + var16 * (1.0F - var4);
            var20 = var14 + var17 * (1.0F - var4);
            var21 = var15 + var18 * (1.0F - var4);
            var22 = var4 + var8 * (1.0F - var4);
      }

      var12[0] = l6(var22);
      if (var12[0] > 0.0F) {
         var9[0] = l6(var19 / var12[0]);
         var10[0] = l6(var20 / var12[0]);
         var11[0] = l6(var21 / var12[0]);
      } else {
         var9[0] = 0.0F;
         var10[0] = 0.0F;
         var11[0] = 0.0F;
      }
   }

   private static float l6(float var0) {
      return var0 < 0.0F ? 0.0F : (var0 > 1.0F ? 1.0F : var0);
   }

   private static byte k5(float var0) {
      return (byte)Math.round(l6(var0) * 255.0F);
   }
}
