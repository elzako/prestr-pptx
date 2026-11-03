package com.aspose.slides.internal.k2s;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.k5.e2;
import com.aspose.slides.internal.k5.q0;
import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class a6 {
   private final Dictionary<String, byte[]> z3 = new Dictionary<>();
   public int n5;
   public String l6 = "Times New Roman";
   public boolean k5 = false;
   public boolean u3 = false;
   public float a6 = 10.0F;
   public boolean u9;
   public int h0;
   public String c8;
   public float t2 = 0.0F;
   public boolean s7 = false;
   public float x8 = 0.0F;
   public c8 n3 = com.aspose.slides.internal.o9b.c8.m3().o8();
   public c8 y4 = com.aspose.slides.internal.o9b.c8.m3().o8();
   public boolean e2;
   public boolean t9;
   public boolean z1;
   public t2 t4;
   public float q0 = 0.001F;
   private final n3 m1;
   private final com.aspose.slides.internal.b5j.u9 k7;
   private final com.aspose.slides.internal.b5j.u3 m3;
   private final x8 z8;
   private static final com.aspose.slides.internal.v6g.u9 j5 = new com.aspose.slides.internal.v6g.u9("serif", "sans-serif", "monospace");

   public final boolean n5() {
      return com.aspose.slides.internal.f7k.a6.k5(this.h0);
   }

   public final int l6() {
      byte var1 = 0;
      if (this.u9) {
         var1 |= 2;
      }

      if (this.n5()) {
         var1 |= 1;
      }

      return var1;
   }

   public final Dictionary<String, byte[]> k5() {
      return this.z3;
   }

   public a6(n3 var1, com.aspose.slides.internal.b5j.u9 var2, com.aspose.slides.internal.b5j.u3 var3, x8 var4) {
      this.m1 = var1;
      this.k7 = var2;
      this.m3 = var3;
      this.z8 = var4;
   }

   public final void n5(t2 var1) {
      com.aspose.slides.internal.d0e.k5 var2 = var1.l6;
      List var3 = null;
      String var4 = null;
      String[] var5 = new String[]{var4};
      boolean var6 = var2.n5("style", var5);
      var4 = var5[0];
      if (var6) {
         String var7 = com.aspose.slides.internal.b5j.y4.l6(var4);
      } else {
         var5[0] = var4;
         boolean var36 = var2.n5("class", var5);
         var4 = var5[0];
         if (var36) {
            var3 = com.aspose.slides.internal.f5n.k5.n5(this.k7.n5(), var4, null);
         }
      }

      var5[0] = var4;
      boolean var37 = n5(var2, var3, "font-family", var5);
      var4 = var5[0];
      if (var37) {
         this.l6 = this.n5(var4);
      }

      var5[0] = var4;
      boolean var8 = n5(var2, var3, "font-size", var5);
      var4 = var5[0];
      if (var8) {
         com.aspose.slides.internal.b3z.a6 var9 = com.aspose.slides.internal.b3z.a6.n5(var4, com.aspose.slides.internal.b3z.a6.k5(0.0F));
         if (var9.l6() == 3) {
            this.a6 = this.m1.n5(var4, var1, this.a6);
         } else {
            this.a6 = this.m1.n5(var4, var1, 10.0F);
         }
      }

      var5[0] = var4;
      boolean var38 = n5(var2, var3, "font-style", var5);
      var4 = var5[0];
      if (var38 && (d1.a6(var4, "italic") || d1.a6(var4, "oblique"))) {
         this.u9 = true;
      }

      var5[0] = var4;
      boolean var10 = n5(var2, var3, "font-weight", var5);
      var4 = var5[0];
      if (var10) {
         this.h0 = com.aspose.slides.internal.f7k.a6.n5(var4);
      }

      var5[0] = var4;
      boolean var11 = n5(var2, var3, "font-variant", var5);
      var4 = var5[0];
      if (var11) {
         this.s7 = d1.a6("small-caps", var4);
      }

      var5[0] = var4;
      boolean var12 = n5(var2, var3, "letter-spacing", var5);
      var4 = var5[0];
      if (var12) {
         this.x8 = this.m1.n5(var4, d1.n5, var1);
      }

      var5[0] = var4;
      boolean var13 = n5(var2, var3, "word-spacing", var5);
      var4 = var5[0];
      if (var13) {
         this.q0 = this.m1.n5(var4, d1.n5, var1);
      }

      var5[0] = var4;
      boolean var14 = var2.n5("baseline-shift", var5);
      var4 = var5[0];
      if (var14) {
         if (d1.a6(var4, "sub")) {
            this.k5 = true;
         }

         if (d1.a6(var4, "super")) {
            this.u3 = true;
         }
      }

      var5[0] = var4;
      boolean var15 = var2.n5("text-decoration", var5);
      var4 = var5[0];
      if (var15) {
         this.t4 = var1;
         this.e2 = "underline".equals(var4);
         this.t9 = "overline".equals(var4);
         this.z1 = "line-through".equals(var4);
      }

      var5[0] = var4;
      boolean var16 = var2.n5("textLength", var5);
      var4 = var5[0];
      if (var16) {
         this.t2 = this.m1.n5(var4, "textLength", var1);
      }

      boolean var17 = false;
      boolean var18 = false;
      var5[0] = var4;
      boolean var19 = var2.n5("stroke", var5) && !"none".equals(var5[0]);
      var4 = var5[0];
      if (var19) {
         var18 = true;
         com.aspose.slides.internal.b3z.u3.n5(var4).n5().n5(this.n3);
      } else {
         var5[0] = var4;
         boolean var20 = n5(var2, var3, "stroke", var5);
         var4 = var5[0];
         if (var20) {
            var18 = true;
            if (!d1.l6(var4, "url")) {
               com.aspose.slides.internal.b3z.u3.n5(var4).n5().n5(this.n3);
            }
         }
      }

      var5[0] = var4;
      boolean var39 = var2.n5("fill", var5) && !"none".equals(var5[0]);
      var4 = var5[0];
      if (var39) {
         var17 = true;
         com.aspose.slides.internal.b3z.u3.n5(var4).n5().n5(this.y4);
      } else {
         var5[0] = var4;
         boolean var21 = n5(var2, var3, "fill", var5);
         var4 = var5[0];
         if (var21) {
            var17 = true;
            if (!d1.l6(var4, "url")) {
               com.aspose.slides.internal.b3z.u3.n5(var4).n5().n5(this.y4);
            }
         }
      }

      if (var17 && var18) {
         this.n5 = 0;
      } else if (var17 && !var18) {
         this.n5 = 1;
      } else if (!var17 && var18) {
         this.n5 = 2;
      }
   }

   private static boolean n5(com.aspose.slides.internal.d0e.k5 var0, List<com.aspose.slides.internal.k5.n5> var1, String var2, String[] var3) {
      if (var0.n5(var2, var3)) {
         return true;
      }

      if (var1 != null && var1.size() != 0) {
         List$Enumerator var4 = var1.iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.k5.n5 var5 = (com.aspose.slides.internal.k5.n5)var4.next();
               var3[0] = var5.o2(var2);
               if (!d1.n5(var3[0])) {
                  return true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var3[0] = null;
         return false;
      } else {
         var3[0] = null;
         return false;
      }
   }

   public final String n5(String var1) {
      try {
         String[] var2 = d1.n5(d1.l6(var1), new String[]{","}, 1);

         for (String var6 : var2) {
            String var7 = d1.k5(d1.l6(var6),new char[]{ '"', '\''});
            switch (j5.n5(var7)) {
               case 0:
                  return com.aspose.slides.internal.o9b.y4.u3().a6();
               case 1:
                  return com.aspose.slides.internal.o9b.y4.k5().a6();
               case 2:
                  return com.aspose.slides.internal.o9b.y4.l6().a6();
            }

            for (com.aspose.slides.internal.o9b.y4 var11 : com.aspose.slides.internal.o9b.y4.n5()) {
               if (d1.u3(var11.a6(), var7, (short)5)) {
                  return var11.a6();
               }
            }

            if (this.z8.n5().containsKey(var7)) {
               List var33 = com.aspose.slides.internal.k2s.l6.n5(this.z8.n5().get_Item(var7), this.u9);
               var33 = com.aspose.slides.internal.k2s.l6.l6(var33, this.s7);
               var33 = com.aspose.slides.internal.k2s.l6.n5(var33, this.h0);
               if (var33.size() > 0) {
                  return ((l6)var33.get_Item(0)).n5().a0();
               }
            }
         }

         i1 var28 = com.aspose.slides.internal.e1x.x8.u3().n5(var1, this.l6());
         if (var28 != null) {
            return var28.n5();
         }

         com.aspose.slides.internal.o9b.n3 var29 = new com.aspose.slides.internal.o9b.n3(var1, 10.0F);
         if (d1.u9(var29.h0(), var1, (short)1) > -1) {
            return var29.h0();
         }

         if (this.z3.containsKey(var1)) {
            return var1;
         }

         if (this.k7.n5() != null) {
            IGenericEnumerator var30 = this.k7.n5().l6().iterator();

            try {
               while (var30.hasNext()) {
                  q0 var31 = (q0)var30.next();
                  if (var31.n5() == 5) {
                     com.aspose.slides.internal.t9.u9 var32 = com.aspose.slides.internal.t9.u9.n5(com.aspose.slides.internal.v6g.k5.n5(var31, e2.class));
                     if (d1.a6(var32.n5(), var1)) {
                        IGenericEnumerator var36 = var32.l6().iterator();

                        try {
                           while (var36.hasNext()) {
                              com.aspose.slides.internal.t9.h0 var37 = (com.aspose.slides.internal.t9.h0)var36.next();

                              try {
                                 if (!var37.n5()) {
                                    t1 var39 = this.m3.n5(this, new u6(var37.l6()));
                                    byte[] var40;
                                    if ((d1.n5(var37.k5()) || !d1.u3(var37.k5(), "woff", (short)5))
                                       && (d1.n5(var37.l6()) || !d1.u3(com.aspose.slides.internal.z0k.z1.a6(var37.l6()), ".woff", (short)5))
                                       && (d1.n5(var37.l6()) || !d1.t2(var37.l6(), "x-font-woff"))) {
                                       var40 = var39.n5();
                                    } else {
                                       com.aspose.slides.internal.u1s.n5 var12 = new com.aspose.slides.internal.u1s.n5();
                                       com.aspose.slides.internal.z0k.e2 var13 = new com.aspose.slides.internal.z0k.e2();
                                       var12.n5(new com.aspose.slides.internal.z0k.e2(var39.n5()), var13);
                                       var40 = var13.getBuffer();
                                    }

                                    this.z3.addItem(var1, var40);
                                    return var1;
                                 }

                                 com.aspose.slides.internal.o9b.n3 var38 = new com.aspose.slides.internal.o9b.n3(var37.l6(), 10.0F);
                                 if (d1.u9(var38.h0(), var1, (short)1) > -1) {
                                    return var38.h0();
                                 }
                              } catch (RuntimeException var24) {
                                 if (!com.aspose.slides.internal.n1n.n5.n5) {
                                    throw var24;
                                 }
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var36, IDisposable.class)) {
                              var36.dispose();
                           }
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  var30.dispose();
               }
            }
         }

         return "Times-Roman";
      } catch (RuntimeException var27) {
         if (com.aspose.slides.internal.n1n.n5.n5) {
            return "Arial";
         } else {
            throw var27;
         }
      }
   }

   public final boolean n5(a6 var1) {
      return d1.a6(this.l6, var1.l6)
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && this.h0 == var1.h0
         && this.n5() == var1.n5()
         && this.s7 == var1.s7
         && this.x8 == var1.x8
         && com.aspose.slides.internal.o9b.c8.n5(this.n3, var1.n3)
         && com.aspose.slides.internal.o9b.c8.n5(this.y4, var1.y4)
         && this.e2 == var1.e2
         && this.t9 == var1.t9
         && this.z1 == var1.z1
         && this.t4 == var1.t4
         && this.q0 == var1.q0;
   }
}
