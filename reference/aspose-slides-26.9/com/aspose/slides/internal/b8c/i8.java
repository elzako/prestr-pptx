package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.ms.System.IDisposable;

public final class i8 extends r7 {
   private static final int[] n5 = new int[]{1};
   private static final int[] l6 = new int[]{2, 3};
   private static final int[] k5 = new int[]{4, 6, 3, 5, 7};
   private static final int[] u3 = new int[]{8};
   private static final int[] a6 = new int[]{4, 6};
   private static final i8$a6[] u9 = new i8$a6[]{new i8$a6(1, 0, new a4()), new i8$a6(22, 10, new w4())};
   private static final i8$a6[] h0 = new i8$a6[]{
      new i8$a6(1, 10, 256, new k3()),
      new i8$a6(9, 10, new q6()),
      new i8$a6(6, 10, new y7()),
      new i8$a6(14, 10, new b8()),
      new i8$a6(41, 0, new q7()),
      new i8$a6(42, 7, new r3()),
      new i8$a6(43, 0, new q8()),
      new i8$a6(44, 0, new x3())
   };
   private static final i8$a6[] c8 = new i8$a6[]{
      new i8$a6(1, 10, new b2()),
      new i8$a6(18, 10, new m4()),
      new i8$a6(30, 0, new b1()),
      new i8$a6(41, 10, new j1()),
      new i8$a6(42, 7, new k6()),
      new i8$a6(43, 0, new o7()),
      new i8$a6(44, 0, new v9())
   };
   private static final i8$a6[] t2 = new i8$a6[]{new i8$a6(2, 10, 256, new r9()), new i8$a6(4, 0, new c7()), new i8$a6(3, 0, new n0())};
   private static final i8$a6[] s7 = new i8$a6[]{new i8$a6(2, 10, new f1()), new i8$a6(18, 10, new k2()), new i8$a6(30, 0, new o8())};
   private static final i8$a6[] x8 = new i8$a6[]{new i8$a6(14, 10, new n8()), new i8$a6(4, 0, new t0()), new i8$a6(3, 0, new n6())};
   private static final i8$a6[] n3 = new i8$a6[]{
      new i8$a6(41, 0, new p5()), new i8$a6(42, 7, new b0()), new i8$a6(43, 0, new r0()), new i8$a6(44, 0, new d7())
   };
   private static final i8$a6[] y4 = new i8$a6[]{
      new i8$a6(41, 10, new o1()), new i8$a6(42, 7, new m0()), new i8$a6(43, 0, new o4()), new i8$a6(44, 0, new k1())
   };
   private static final i8$t2[] e2 = new i8$t2[]{
      new i8$t2(0, n5, null, null, null, null, false),
      new i8$t2(31, l6, u9, new o6(), new g2(), new l8(), false),
      new i8$t2(32, k5, h0, new s8(), new i3(), new g1(), false),
      new i8$t2(35, u3, c8, new k4(), new e8(), new b6(), false),
      new i8$t2(33, null, t2, new v7(), null, new t7(), false),
      new i8$t2(36, null, s7, new c9(), new d3(), new o3(), false),
      new i8$t2(34, a6, x8, new l1(), null, new i7(), false),
      new i8$t2(37, null, n3, new c6(), null, new x1(), true),
      new i8$t2(37, null, y4, new s6(), null, new b7(), true)
   };
   private x0 t9;
   private String z1;
   private com.aspose.slides.ms.System.Xml.c7 t4;
   private com.aspose.slides.ms.System.Xml.o5 q0;
   private l5 z3;
   private i8$t2 m1;
   private i8$t2 k7;
   private com.aspose.slides.ms.System.Xml.a0 m3;
   private com.aspose.slides.ms.System.Xml.a0 z8;
   private String j5;
   private String w1;
   private i8$k5 r4;
   private i8$u3 c4;
   private i8$n5 y2;
   private i8$l6 y1;
   private i8$l6 a0;
   private com.aspose.slides.ms.System.Xml.z9 d2;
   private o2 d5;
   private com.aspose.slides.ms.System.Xml.s2 s3;
   private String p8;
   private b4 f2;
   private Hashtable i1 = new Hashtable();
   private com.aspose.slides.ms.System.Xml.o8 e5 = null;

   public i8(
      com.aspose.slides.ms.System.Xml.c7 var1,
      com.aspose.slides.ms.System.Xml.s2 var2,
      x0 var3,
      String var4,
      com.aspose.slides.ms.System.Xml.z9 var5,
      o2 var6,
      b4 var7
   ) {
      this.t9 = var3;
      this.z1 = var4;
      this.t4 = var1;
      this.s3 = var2;
      this.f2 = var7;
      this.m3 = new com.aspose.slides.ms.System.Xml.a0(10);
      this.r4 = new i8$k5(null);
      this.y2 = new i8$n5(null);
      this.z8 = new com.aspose.slides.ms.System.Xml.a0(10);
      this.c4 = new i8$u3(null);
      this.d2 = var5;
      this.d5 = var6;
      this.m1 = e2[0];
      this.q0 = com.aspose.slides.ms.System.Xml.o5.n5(this.t4);
      this.e5 = com.aspose.slides.internal.s5g.n5.l6();
   }

   @Override
   public boolean n5(String var1, String var2, String var3) {
      com.aspose.slides.ms.System.Xml.k6 var4 = new com.aspose.slides.ms.System.Xml.k6(var2, v5.n5(var3, this.d2, this.d5));
      if (this.n5(var4)) {
         this.u3();
         if (this.m1.u3 != null) {
            this.m1.u3.n5(this, var4);
         }

         return true;
      } else {
         if (!this.l6(var4)) {
            this.n5("The '{0}' element is not supported in this context.", com.aspose.slides.ms.System.Xml.k6.n5(var2, var1));
         }

         return false;
      }
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      com.aspose.slides.ms.System.Xml.k6 var5 = new com.aspose.slides.ms.System.Xml.k6(var2, v5.n5(var3, this.d2, this.d5));

      for (int var6 = 0; var6 < this.m1.k5.length; var6++) {
         i8$a6 var7 = this.m1.k5[var6];
         if (this.d5.a4[var7.n5].equals(var5)) {
            i8$h0 var8 = var7.u3;
            if (var7.k5.t2() == 10) {
               String var9 = null;
               String[] var10 = new String[]{var9};
               com.aspose.slides.ms.System.Xml.k6 var11 = com.aspose.slides.ms.System.Xml.k6.n5(var4, this.s3, var10);
               var9 = var10[0];
               var11.n5(this.d2);
               if (var9.length() != 0) {
                  if (var7.n5 != 2) {
                     throw new XmlException("This is an unexpected token. The expected token is '{0}'.", "NAME");
                  }
               } else if (this.n5(var7.l6)) {
                  var11 = new com.aspose.slides.ms.System.Xml.k6(var11.l6(), this.z1);
               } else {
                  var11 = new com.aspose.slides.ms.System.Xml.k6(var11.l6());
               }

               var8.n5(this, var11, var9);
            } else {
               var8.n5(this, var7.k5.n5(var4, this.d2, this.s3), com.aspose.slides.ms.System.d1.n5);
            }

            return;
         }
      }

      if (var3 == this.d5.a6 && l6(var4)) {
         this.k5(var4);
      } else {
         if (!this.k5(var5)) {
            this.n5("The '{0}' attribute is not supported in this context.", com.aspose.slides.ms.System.Xml.k6.n5(var5.l6(), var1));
         }
      }
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.e5 = var1;
   }

   private boolean k5(String var1) {
      if (this.e5 == null) {
         return false;
      }

      var1 = this.d2.n5(var1);
      if (this.t9.n3().containsKey(var1)) {
         return false;
      }

      x0 var2 = null;
      com.aspose.slides.ms.System.r8 var3 = this.e5.n5(null, this.t4.q0());
      com.aspose.slides.ms.System.Xml.p5 var4 = null;

      try {
         com.aspose.slides.ms.System.r8 var5 = this.e5.n5(var3, com.aspose.slides.ms.System.d1.k5(var1, "x-Schema:".length()));
         com.aspose.slides.internal.z0k.t4 var6 = (com.aspose.slides.internal.z0k.t4)this.e5.n5(var5, null, null);
         var4 = new com.aspose.slides.ms.System.Xml.p5(var5.toString(), var6, this.d2);
         new x0();
         n7 var7 = new n7(2, this.d2, this.d5, this.f2);
         var7.n5(this.e5);
         var7.n5(var4, var1);
         var2 = var7.k5();
      } catch (XmlException var11) {
         this.n5("Cannot load the Schema for the namespace '{0}' - {1}", new String[]{var1, var11.getMessage()}, 1);
         var2 = null;
      } finally {
         if (var4 != null) {
            var4.w1();
         }
      }

      if (var2 != null && var2.z1() == 0) {
         this.t9.n5(var2, this.f2);
         return true;
      } else {
         return false;
      }
   }

   public static boolean l6(String var0) {
      return var0.length() >= "x-Schema:".length()
         && 0 == com.aspose.slides.ms.System.d1.n5(var0, 0, "x-Schema:", 0, "x-Schema:".length(), (short)4)
         && !com.aspose.slides.ms.System.d1.n5(var0, "x-Schema:#", (short)4);
   }

   @Override
   public boolean n5() {
      return true;
   }

   @Override
   public void n5(com.aspose.slides.ms.System.Xml.l0[] var1) {
      throw new InvalidOperationException(com.aspose.slides.ms.System.Xml.v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void n5(String var1) {
      if (this.m1.h0) {
         this.p8 = var1;
      } else {
         this.n5("The following text is not allowed in this context: '{0}'.", var1);
      }
   }

   @Override
   public void l6() {
      if (this.m1.a6 != null) {
         this.m1.a6.n5(this);
      }
   }

   @Override
   public void k5() {
      if (this.m1.u9 != null) {
         this.m1.u9.n5(this);
      }

      this.a6();
   }

   private void u3() {
      this.m3.n5();
      this.m3.n5(this.m3.u3() - 1, this.m1);
      this.m1 = this.k7;
   }

   private void a6() {
      this.m1 = (i8$t2)this.m3.l6();
   }

   private void u9() {
      this.z8.n5();
      this.z8.n5(this.z8.u3() - 1, i8$u3.n5(this.c4));
   }

   private void h0() {
      this.c4 = (i8$u3)this.z8.l6();
   }

   private static void t2(i8 var0, Object var1) {
      var0.t9.n5(2);
      var0.r4.n5 = null;
      var0.r4.e2 = null;
      var0.y2.n5 = null;
   }

   private static void c4(i8 var0, Object var1, String var2) {
      var0.j5 = (String)var1;
      var0.w1 = var2;
   }

   private static void y2(i8 var0, Object var1, String var2) {
   }

   private static void y4(i8 var0) {
      if (var0.z1 == null) {
         if (var0.j5 != null) {
            var0.z1 = var0.d2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"x-Schema:#", var0.j5}));
         } else {
            var0.z1 = com.aspose.slides.ms.System.d1.n5;
         }
      }

      var0.t9.n3().addItem(var0.z1, true);
   }

   private static void e2(i8 var0) {
      while (var0.y1 != null) {
         com.aspose.slides.ms.System.Xml.k6 var1 = var0.y1.k5;
         if (var1.n5().length() == 0) {
            var1 = new com.aspose.slides.ms.System.Xml.k6(var1.l6(), var0.z1);
         }

         h9 var2 = null;
         h9[] var3 = new h9[]{var2};
         boolean var4 = var0.t9.e2().tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4) {
            var0.y1.x8 = var2.k7();
            var0.y1.x8.n5(var1);
            var0.n5(var0.y1, var0.y1.x8);
         } else {
            var0.n5("The '{0}' attribute is not declared.", var1.l6());
         }

         var0.y1 = var0.y1.n3;
      }

      IEnumerator var8 = var0.i1.getValues().iterator();

      try {
         while (var8.hasNext()) {
            t6 var10 = (t6)var8.next();
            var0.n5("The '{0}' element is not declared.", com.aspose.slides.ms.System.Xml.k6.n5(var10.z8().l6(), var10.j5()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            ((IDisposable)var8).dispose();
         }
      }
   }

   private static void s7(i8 var0, Object var1) {
      var0.r4.n5 = new t6();
      var0.z3 = new l5(3);
      var0.z3.n5(true);
      var0.r4.l6 = 0;
      var0.r4.k5 = 0;
      var0.r4.u3 = false;
      var0.r4.a6 = false;
      var0.r4.u9 = true;
      var0.r4.h0 = false;
      var0.r4.t2 = false;
      var0.r4.e2 = new Hashtable();
      var0.r4.n3 = 4294967295L;
      var0.r4.y4 = 4294967295L;
   }

   private static void y1(i8 var0, Object var1, String var2) {
      com.aspose.slides.ms.System.Xml.k6 var3 = (com.aspose.slides.ms.System.Xml.k6)var1;
      if (var0.t9.h0().containsKey(var3)) {
         var0.n5("The '{0}' element has already been declared.", com.aspose.slides.ms.System.Xml.k6.n5(var3.l6(), var2));
      }

      var0.r4.n5.n5(var3);
      var0.r4.n5.l6(var2);
      var0.t9.h0().addItem(var3, var0.r4.n5);
      if (var0.i1.get_Item(var3) != null) {
         var0.i1.removeItem(var3);
      }
   }

   private static void a0(i8 var0, Object var1, String var2) {
      var0.r4.l6 = var0.a6((com.aspose.slides.ms.System.Xml.k6)var1);
   }

   private static void d2(i8 var0, Object var1, String var2) {
      var0.z3.n5(var0.u9((com.aspose.slides.ms.System.Xml.k6)var1));
   }

   private static void d5(i8 var0, Object var1, String var2) {
      int var3 = var0.u3((com.aspose.slides.ms.System.Xml.k6)var1);
      var0.c4.a6 = var3;
      var0.r4.k5 = var3;
   }

   private static void s3(i8 var0, Object var1, String var2) {
      var0.r4.h0 = true;
      String var3 = com.aspose.slides.ms.System.d1.l6((String)var1);
      if (var3.length() == 0) {
         var0.a6("The DataType value cannot be empty.");
      } else {
         v5 var4 = v5.l6(var3);
         if (var4 == null) {
            var0.n5("Reference to an unknown data type, '{0}'.", var3);
         }

         var0.r4.n5.n5(var4);
      }
   }

   private static void p8(i8 var0, Object var1, String var2) {
      var0.r4.t2 = true;
      var0.r4.n5.n5(new List<>(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.k5(var1, String[].class))));
   }

   private static void f2(i8 var0, Object var1, String var2) {
      long[] var3 = new long[]{var0.r4.n3};
      n5(var3, var1, var0);
      var0.r4.n3 = var3[0];
   }

   private static void i1(i8 var0, Object var1, String var2) {
      long[] var3 = new long[]{var0.r4.y4};
      l6(var3, var1, var0);
      var0.r4.y4 = var3[0];
   }

   private static void t9(i8 var0) {
      String var1 = null;
      String var2 = null;
      if (var0.r4.n5.z8().k5()) {
         var1 = "The '{0}' attribute is either invalid or missing.";
         var2 = "name";
         if (var1 != null) {
            var0.n5(var1, var2);
         }
      }

      if (var0.r4.h0) {
         if (!var0.r4.u9) {
            var1 = "Content must be \"textOnly\" when using DataType on an ElementType.";
            if (var1 != null) {
               var0.n5(var1, var2);
            }
         } else {
            var0.r4.l6 = 2;
         }
      } else if (var0.r4.l6 == 0) {
         switch (var0.r4.k5) {
            case 0:
               var0.r4.l6 = 3;
               var0.r4.k5 = 1;
               break;
            case 1:
               var0.r4.l6 = 3;
               break;
            case 2:
               var0.r4.l6 = 4;
               break;
            case 3:
               var0.r4.l6 = 4;
         }
      }

      boolean var3 = var0.z3.u3();
      i8$k5 var4 = var0.r4;
      switch (var0.r4.l6) {
         case 1:
            var0.r4.n5.n5(com.aspose.slides.internal.b8c.z1.n5);
            var0.z3 = null;
            break;
         case 2:
            var0.r4.n5.n5(com.aspose.slides.internal.b8c.z1.l6);
            var0.c4.a6 = 1;
            var0.z3 = null;
            break;
         case 3:
            if (var4.k5 != 0 && var4.k5 != 1) {
               var1 = "The order must be many when content is mixed.";
               if (var1 != null) {
                  var0.n5(var1, var2);
               }
            } else {
               var0.c4.a6 = 1;
            }

            var4.u3 = true;
            var0.z3.n5(var3);
            break;
         case 4:
            var0.z3 = new l5(2);
            if (var4.k5 == 0) {
               var0.c4.a6 = 2;
            }

            var4.u3 = true;
            var0.z3.n5(var3);
      }

      if (var4.l6 == 3 || var4.l6 == 4) {
         var0.z3.a6();
         var0.z3.u9();
      }
   }

   private static void z1(i8 var0) {
      t6 var1 = var0.r4.n5;
      if (var0.y1 != null && var0.r4.e2 != null) {
         i8$l6 var2 = var0.y1;
         i8$l6 var3 = var2;

         while (var2 != null) {
            h9 var4 = null;
            if (var2.s7 == var1) {
               com.aspose.slides.ms.System.Xml.k6 var5 = var2.k5;
               var4 = (h9)var0.r4.e2.get_Item(var5);
               if (var4 != null) {
                  var2.x8 = var4.k7();
                  var2.x8.n5(var5);
                  var0.n5(var2, var4);
                  if (var2 == var0.y1) {
                     i8$l6 var6 = var2.n3;
                     var0.y1 = var6;
                     var2 = var6;
                     var3 = var2;
                  } else {
                     var3.n3 = var2.n3;
                     var2 = var3.n3;
                  }
               }
            }

            if (var4 == null) {
               if (var2 != var0.y1) {
                  var3 = var3.n3;
               }

               var2 = var2.n3;
            }
         }
      }

      if (var0.r4.u3) {
         var0.z3.h0();
         if (!var0.r4.a6) {
            if (var0.z3.u3()) {
               var0.r4.n5.n5(com.aspose.slides.internal.b8c.z1.u3);
               var0.z3 = null;
            } else if (var0.r4.l6 != 3) {
               var0.a6("There is a missing element.");
            }
         } else if (var0.c4.a6 == 1) {
            var0.z3.s7();
         }
      }

      if (var1.a0() != null) {
         int var7 = var1.a0().t2();
         if (var7 == 9 && !var0.r4.t2) {
            var0.a6("The dt:values attribute is missing.");
         }

         if (var7 != 9 && var0.r4.t2) {
            var0.a6("Data type should be enumeration when the values attribute is present.");
         }
      }

      n5(var0.r4.y4, var0.r4.n3, var0);
      var1.n5(var0.r4.n3 & 4294967295L);
      var1.l6(var0.r4.y4 & 4294967295L);
      if (var0.z3 != null) {
         var0.r4.n5.n5(var0.z3.l6(true));
         var0.z3 = null;
      }

      var0.r4.n5 = null;
      var0.r4.e2 = null;
   }

   private static void x8(i8 var0, Object var1) {
      i8$n5 var2 = var0.y2;
      var2.n5 = new h9(com.aspose.slides.ms.System.Xml.k6.n5, null);
      var2.u3 = false;
      var2.k5 = null;
      var2.n3 = null;
      var2.a6 = 0L;
      var2.u9 = 1L;
      var2.t2 = false;
      var2.s7 = false;
      var2.x8 = var0.m3.u3() == 2;
      var2.h0 = 4294967295L;
      var2.c8 = 4294967295L;
   }

   private static void e5(i8 var0, Object var1, String var2) {
      com.aspose.slides.ms.System.Xml.k6 var3 = (com.aspose.slides.ms.System.Xml.k6)var1;
      var0.y2.l6 = var3;
      var0.y2.k5 = var2;
      var0.y2.n5.n5(var3);
      if (var0.r4.n5 != null) {
         if (var0.r4.e2.get_Item(var3) == null) {
            var0.r4.e2.addItem(var3, var0.y2.n5);
         } else {
            var0.n5("The '{0}' attribute has already been declared for this ElementType.", com.aspose.slides.ms.System.Xml.k6.n5(var3.l6(), var2));
         }
      } else {
         var3 = new com.aspose.slides.ms.System.Xml.k6(var3.l6(), var0.z1);
         var0.y2.n5.n5(var3);
         if (!var0.t9.e2().containsKey(var3)) {
            var0.t9.e2().addItem(var3, var0.y2.n5);
         } else {
            var0.n5("The '{0}' attribute has already been declared for this ElementType.", com.aspose.slides.ms.System.Xml.k6.n5(var3.l6(), var2));
         }
      }
   }

   private static void b3(i8 var0, Object var1, String var2) {
      var0.y2.u3 = n5(var1, var0);
   }

   private static void o0(i8 var0, Object var1, String var2) {
      var0.y2.n3 = var1;
   }

   private static void z7(i8 var0, Object var1, String var2) {
      com.aspose.slides.ms.System.Xml.k6 var3 = (com.aspose.slides.ms.System.Xml.k6)var1;
      var0.y2.s7 = true;
      var0.y2.n5.n5(var0.u3(var3.l6()));
   }

   private static void v4(i8 var0, Object var1, String var2) {
      var0.y2.t2 = true;
      var0.y2.n5.n5(new List<>(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.k5(var1, String[].class))));
   }

   private static void u6(i8 var0, Object var1, String var2) {
      long[] var3 = new long[]{var0.y2.h0};
      n5(var3, var1, var0);
      var0.y2.h0 = var3[0];
   }

   private static void t1(i8 var0, Object var1, String var2) {
      long[] var3 = new long[]{var0.y2.c8};
      l6(var3, var1, var0);
      var0.y2.c8 = var3[0];
   }

   private static void t4(i8 var0) {
      if (var0.y2.l6.k5()) {
         var0.a6("The '{0}' attribute is either invalid or missing.");
      }
   }

   private static void q0(i8 var0) {
      String var1 = null;
      if (var0.y2.s7 && var0.y2.n5.a0() != null) {
         int var2 = var0.y2.n5.a0().t2();
         if (var2 == 9 && !var0.y2.t2) {
            var1 = "The dt:values attribute is missing.";
            if (var1 != null) {
               var0.a6(var1);
            }
         }

         if (var2 != 9 && var0.y2.t2) {
            var1 = "Data type should be enumeration when the values attribute is present.";
            if (var1 != null) {
               var0.a6(var1);
            }
         }

         if (var0.y2.n3 != null && var2 == 1) {
            var1 = "An attribute or element of type xs:ID or derived from xs:ID, should not have a value constraint.";
            if (var1 != null) {
               var0.a6(var1);
            }
         }
      } else {
         var0.y2.n5.n5(v5.u9(0));
      }

      n5(var0.y2.c8, var0.y2.h0, var0);
      var0.y2.n5.n5(var0.y2.h0 & 4294967295L);
      var0.y2.n5.l6(var0.y2.c8 & 4294967295L);
      if (var0.y2.n3 != null) {
         String var6 = (String)var0.y2.n3;
         var0.y2.n5.n5(var6);
         var0.y2.n5.u3(var6);
         var0.n5(var0.y2.n5);
      }

      var0.n5(var0.y2.n5, var0.y2.u3);
   }

   private static void n3(i8 var0, Object var1) {
      if (var0.r4.h0 || var0.r4.l6 == 1 || var0.r4.l6 == 2) {
         var0.a6("Element is not allowed when the content is empty or textOnly.");
      }

      var0.r4.u9 = false;
      var0.r4.c8 = false;
      var0.r4.s7 = 1L;
      var0.r4.x8 = 1L;
   }

   private static void a5(i8 var0, Object var1, String var2) {
      com.aspose.slides.ms.System.Xml.k6 var3 = (com.aspose.slides.ms.System.Xml.k6)var1;
      if (!var0.t9.h0().containsKey(var3)) {
         t6 var4 = (t6)var0.i1.get_Item(var3);
         if (var4 == null) {
            var4 = new t6(var3, var2);
            var0.i1.addItem(var3, var4);
         }
      }

      var0.r4.c8 = true;
      if (var0.r4.a6) {
         var0.c8();
      } else {
         var0.r4.a6 = true;
      }

      var0.z3.n5(var3, null);
   }

   private static void h2(i8 var0, Object var1, String var2) {
      var0.r4.s7 = l6(var1, var0);
   }

   private static void v0(i8 var0, Object var1, String var2) {
      var0.r4.x8 = k5(var1, var0);
   }

   private static void z3(i8 var0) {
      if (var0.r4.c8) {
         n5(var0.z3, var0.r4.s7, var0.r4.x8);
      } else {
         var0.a6("The '{0}' attribute is either invalid or missing.");
      }
   }

   private static void y4(i8 var0, Object var1) {
      if (var0.a0 == null) {
         var0.a0 = new i8$l6();
      }

      var0.a0.c8 = 0L;
   }

   private static void f0(i8 var0, Object var1, String var2) {
      var0.a0.k5 = (com.aspose.slides.ms.System.Xml.k6)var1;
      var0.a0.l6 = var2;
   }

   private static void a3(i8 var0, Object var1, String var2) {
      if (n5(var1, var0)) {
         var0.a0.c8 = 1L;
      }
   }

   private static void p3(i8 var0, Object var1, String var2) {
      var0.a0.a6 = var1;
   }

   private static void m1(i8 var0) {
      if (var0.a0.k5.k5()) {
         var0.a6("The '{0}' attribute is either invalid or missing.");
      }

      h9 var1 = null;
      com.aspose.slides.ms.System.Xml.k6 var2 = var0.a0.k5;
      String var3 = var0.a0.l6;
      if (var0.r4.e2 != null) {
         var1 = (h9)var0.r4.e2.get_Item(var2);
      }

      if (var1 == null) {
         com.aspose.slides.ms.System.Xml.k6 var4 = var2;
         if (var3.length() == 0) {
            var4 = new com.aspose.slides.ms.System.Xml.k6(var2.l6(), var0.z1);
         }

         h9 var5 = null;
         h9[] var6 = new h9[]{var5};
         boolean var7 = var0.t9.e2().tryGetValue(var4, var6);
         var5 = var6[0];
         if (var7) {
            var1 = var5.k7();
            var1.n5(var2);
         } else if (var3.length() != 0) {
            var0.n5("The '{0}' attribute is not declared.", com.aspose.slides.ms.System.Xml.k6.n5(var2.l6(), var3));
         }
      }

      if (var1 != null) {
         var0.n5(var0.a0, var1);
      } else {
         var1 = new h9(var2, var3);
         i8$l6 var8 = new i8$l6();
         var8.t2 = true;
         var8.x8 = var1;
         var8.k5 = var0.a0.k5;
         var8.s7 = var0.r4.n5;
         var8.c8 = var0.a0.c8;
         var8.a6 = var0.a0.a6;
         var8.n3 = var0.y1;
         var0.y1 = var8;
      }

      var0.r4.n5.n5(var1);
   }

   private static void k7(i8 var0) {
      var0.a0.n5();
   }

   private static void e2(i8 var0, Object var1) {
      if (var0.r4.l6 == 1 || var0.r4.l6 == 2) {
         var0.a6("The group is not allowed when ElementType has empty or textOnly content.");
      }

      var0.u9();
      var0.c4.n5 = 1L;
      var0.c4.l6 = 1L;
      var0.c4.k5 = false;
      var0.c4.u3 = false;
      if (var0.r4.a6) {
         var0.c8();
      }

      var0.r4.a6 = false;
      var0.z3.u9();
   }

   private static void x9(i8 var0, Object var1, String var2) {
      var0.c4.a6 = var0.u3((com.aspose.slides.ms.System.Xml.k6)var1);
      if (var0.r4.l6 == 3 && var0.c4.a6 != 1) {
         var0.a6("The order must be many when content is mixed.");
      }
   }

   private static void y0(i8 var0, Object var1, String var2) {
      var0.c4.n5 = l6(var1, var0);
      var0.c4.u3 = true;
   }

   private static void j9(i8 var0, Object var1, String var2) {
      var0.c4.l6 = k5(var1, var0);
      var0.c4.k5 = true;
   }

   private static void m3(i8 var0) {
      if (!var0.r4.a6) {
         var0.a6("There is a missing element.");
      }

      var0.z3.h0();
      if (var0.c4.a6 == 1) {
         var0.z3.s7();
      }

      if (1 == var0.c4.a6 && var0.c4.k5 && (var0.c4.l6 & 4294967295L) != 4294967295L) {
         var0.a6("When the order is many, the maxOccurs attribute must have a value of '*'.");
      }

      n5(var0.z3, var0.c4.n5, var0.c4.l6);
      var0.h0();
   }

   private static void t9(i8 var0, Object var1) {
      if (var0.r4.h0) {
         var0.a6("Data type has already been declared.");
      }

      if (!var0.r4.u9) {
         var0.a6("Content must be \"textOnly\" when using DataType on an ElementType.");
      }
   }

   private static void z8(i8 var0) {
      if (!var0.r4.h0) {
         var0.a6("The '{0}' attribute is either invalid or missing.");
      }

      var0.r4.n5.n5(com.aspose.slides.internal.b8c.z1.l6);
      var0.r4.l6 = 2;
      var0.r4.u3 = false;
      var0.z3 = null;
   }

   private static void z1(i8 var0, Object var1) {
      if (var0.y2.s7) {
         var0.a6("Data type has already been declared.");
      }
   }

   private static void j5(i8 var0) {
      String var1 = null;
      if (!var0.y2.s7) {
         var1 = "The '{0}' attribute is either invalid or missing.";
      } else if (var0.y2.n5.a0() != null) {
         int var2 = var0.y2.n5.a0().t2();
         if (var2 == 9 && !var0.y2.t2) {
            var1 = "The dt:values attribute is missing.";
         } else if (var2 != 9 && var0.y2.t2) {
            var1 = "Data type should be enumeration when the values attribute is present.";
         }
      }

      if (var1 != null) {
         var0.a6(var1);
      }
   }

   private boolean n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      if (this.m1.l6 != null) {
         for (int var2 = 0; var2 < this.m1.l6.length; var2++) {
            if (this.d5.a4[e2[this.m1.l6[var2]].n5].equals(var1)) {
               this.k7 = e2[this.m1.l6[var2]];
               return true;
            }
         }
      }

      return false;
   }

   private boolean l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      String var2 = var1.n5();
      return var2 != null && !com.aspose.slides.ms.System.Xml.v8.n5(var2, this.d5.u9) ? true : this.d5.a4[38].equals(var1) || this.d5.a4[39].equals(var1);
   }

   private boolean k5(com.aspose.slides.ms.System.Xml.k6 var1) {
      String var2 = var1.n5();
      return var2.length() != 0 && !com.aspose.slides.ms.System.Xml.v8.n5(var2, this.d5.u9) && !com.aspose.slides.ms.System.Xml.v8.n5(var2, this.d5.n5)
         ? true
         : com.aspose.slides.ms.System.Xml.v8.n5(var2, this.d5.n5)
            && this.m1.n5 == 37
            && (this.d5.j3.equals(var1) || this.d5.n1.equals(var1) || this.d5.d1.equals(var1) || this.d5.p6.equals(var1));
   }

   private int u3(com.aspose.slides.ms.System.Xml.k6 var1) {
      byte var2 = 0;
      if (this.d5.a4[15].equals(var1)) {
         var2 = 2;
      } else if (this.d5.a4[16].equals(var1)) {
         var2 = 3;
      } else if (this.d5.a4[17].equals(var1)) {
         var2 = 1;
      } else {
         this.n5("The order attribute must have a value of 'seq', 'one', or 'many', not '{0}'.", var1.l6());
      }

      return var2;
   }

   private void c8() {
      switch (this.c4.a6) {
         case 1:
         case 3:
            this.z3.c8();
            break;
         case 2:
            this.z3.t2();
            break;
         case 4:
         default:
            throw new XmlException("This is an unexpected token. The expected token is '{0}'.", "NAME");
      }
   }

   private static boolean n5(Object var0, i8 var1) {
      com.aspose.slides.ms.System.Xml.k6 var2 = (com.aspose.slides.ms.System.Xml.k6)var0;
      boolean var3 = false;
      if ("yes".equals(var2.l6())) {
         var3 = true;
      } else if (!"no".equals(var2.l6())) {
         var1.a6("The required attribute must have a value of yes or no.");
      }

      return var3;
   }

   private static long l6(Object var0, i8 var1) {
      long var2 = 1L;
      long[] var4 = new long[]{1L};
      boolean var5 = !n5((String)var0, var4) || (var4[0] & 4294967295L) != 0L && (var4[0] & 4294967295L) != 1L;
      var2 = var4[0];
      if (var5) {
         var1.a6("The minOccurs attribute must have a value of 0 or 1.");
      }

      return var2;
   }

   private static long k5(Object var0, i8 var1) {
      long var2 = 4294967295L;
      String var4 = (String)var0;
      long[] var5 = new long[]{4294967295L};
      boolean var6 = !com.aspose.slides.ms.System.d1.a6(var4, "*")
         && (!n5(var4, var5) || (var5[0] & 4294967295L) != 4294967295L && (var5[0] & 4294967295L) != 1L);
      var2 = var5[0];
      if (var6) {
         var1.a6("The maxOccurs attribute must have a value of 1 or *.");
      }

      return var2;
   }

   private static void n5(l5 var0, long var1, long var3) {
      if (var0 != null) {
         if (var3 == 4294967295L) {
            if ((var1 & 4294967295L) == 0L) {
               var0.s7();
            } else {
               var0.x8();
            }
         } else if ((var1 & 4294967295L) == 0L) {
            var0.n3();
         }
      }
   }

   private static void n5(long[] var0, Object var1, i8 var2) {
      if (4294967295L != (var0[0] & 4294967295L)) {
         var2.a6("The value of maxLength has already been declared.");
      }

      if (!n5((String)var1, var0) || (var0[0] & 4294967295L) < 0L) {
         var2.n5("The value '{0}' is invalid for dt:maxLength.", var1.toString());
      }
   }

   private static void l6(long[] var0, Object var1, i8 var2) {
      if (4294967295L != (var0[0] & 4294967295L)) {
         var2.a6("The value of minLength has already been declared.");
      }

      if (!n5((String)var1, var0) || (var0[0] & 4294967295L) < 0L) {
         var2.n5("The value '{0}' is invalid for dt:minLength.", var1.toString());
      }
   }

   private static void n5(long var0, long var2, i8 var4) {
      if ((var0 & 4294967295L) != 4294967295L && (var2 & 4294967295L) != 4294967295L && (var0 & 4294967295L) > (var2 & 4294967295L)) {
         var4.a6("The maxLength value must be equal to or greater than the minLength value.");
      }
   }

   private static boolean n5(String var0, long[] var1) {
      return com.aspose.slides.ms.System.l4.n5(var0, 3, com.aspose.slides.internal.x7n.s7.x8(), var1);
   }

   private void n5(i8$l6 var1, h9 var2) {
      if ((var1.a6 != null || var2.s3() != null) && var1.a6 != null) {
         String var3 = (String)var1.a6;
         var2.n5(var3);
         var2.u3(var3);
         this.n5(var2);
      }

      this.n5(var2, 1L == (var1.c8 & 4294967295L));
   }

   private void n5(h9 var1, boolean var2) {
      if (3 != var1.r4()) {
         if (!var2 && 1 != var1.r4()) {
            if (var1.s3() != null) {
               var1.h0(0);
            } else {
               var1.h0(2);
            }
         } else if (var1.s3() != null) {
            var1.h0(3);
         } else {
            var1.h0(1);
         }
      }
   }

   private int a6(com.aspose.slides.ms.System.Xml.k6 var1) {
      byte var2 = 0;
      if (this.d5.a4[11].equals(var1)) {
         var2 = 1;
         this.r4.u9 = false;
      } else if (this.d5.a4[12].equals(var1)) {
         var2 = 4;
         this.r4.u9 = false;
      } else if (this.d5.a4[10].equals(var1)) {
         var2 = 3;
         this.r4.u9 = false;
      } else if (this.d5.a4[13].equals(var1)) {
         var2 = 2;
      } else {
         this.n5("The content attribute must have a value of 'textOnly', 'eltOnly', 'mixed', or 'empty', not '{0}'.", var1.l6());
      }

      return var2;
   }

   private boolean u9(com.aspose.slides.ms.System.Xml.k6 var1) {
      boolean var2 = false;
      if (this.d5.a4[7].equals(var1)) {
         var2 = true;
      } else if (this.d5.a4[8].equals(var1)) {
         var2 = false;
      } else {
         this.n5("The model attribute must have a value of open or closed, not '{0}'.", var1.l6());
      }

      return var2;
   }

   private v5 u3(String var1) {
      v5 var2 = v5.l6(var1);
      if (var2 == null) {
         this.n5("Reference to an unknown data type, '{0}'.", var1);
      } else if (var2.t2() == 1 && !this.y2.x8) {
         if (this.r4.n5.h0()) {
            this.n5(
               "The attribute of type ID is already declared on the '{0}' element.",
               com.aspose.slides.ms.System.Xml.k6.n5(this.r4.n5.z8().l6(), this.r4.n5.j5())
            );
         }

         this.r4.n5.l6(true);
      }

      return var2;
   }

   private void n5(h9 var1) {
      String var2 = com.aspose.slides.ms.System.d1.l6(var1.d5());
      w0.n5(var2, var1, this.t9, this.s3, this.d2, null, this.f2, this.t4.q0(), this.q0.ah_(), this.q0.ai_());
   }

   private boolean n5(int var1) {
      return var1 == 256;
   }

   private void n5(String var1, String[] var2, int var3) {
      this.n5(new XmlSchemaException(var1, var2, this.t4.q0(), this.q0.ah_(), this.q0.ai_()), var3);
   }

   private void a6(String var1) {
      this.n5(var1, com.aspose.slides.ms.System.d1.n5);
   }

   private void n5(String var1, String var2) {
      this.n5(new XmlSchemaException(var1, var2, this.t4.q0(), this.q0.ah_(), this.q0.ai_()), 0);
   }

   private void n5(XmlSchemaException var1, int var2) {
      this.t9.l6(this.t9.z1() + 1);
      if (this.f2 != null) {
         this.f2.n5(this, new i0(var1, var2));
      } else if (var2 == 0) {
         throw var1;
      }
   }

   // $VF: synthetic method
   static void n5(i8 var0, Object var1, String var2) {
      c4(var0, var1, var2);
   }

   // $VF: synthetic method
   static void l6(i8 var0, Object var1, String var2) {
      y2(var0, var1, var2);
   }

   // $VF: synthetic method
   static void k5(i8 var0, Object var1, String var2) {
      y1(var0, var1, var2);
   }

   // $VF: synthetic method
   static void u3(i8 var0, Object var1, String var2) {
      a0(var0, var1, var2);
   }

   // $VF: synthetic method
   static void a6(i8 var0, Object var1, String var2) {
      d2(var0, var1, var2);
   }

   // $VF: synthetic method
   static void u9(i8 var0, Object var1, String var2) {
      d5(var0, var1, var2);
   }

   // $VF: synthetic method
   static void h0(i8 var0, Object var1, String var2) {
      s3(var0, var1, var2);
   }

   // $VF: synthetic method
   static void c8(i8 var0, Object var1, String var2) {
      p8(var0, var1, var2);
   }

   // $VF: synthetic method
   static void t2(i8 var0, Object var1, String var2) {
      f2(var0, var1, var2);
   }

   // $VF: synthetic method
   static void s7(i8 var0, Object var1, String var2) {
      i1(var0, var1, var2);
   }

   // $VF: synthetic method
   static void x8(i8 var0, Object var1, String var2) {
      e5(var0, var1, var2);
   }

   // $VF: synthetic method
   static void n3(i8 var0, Object var1, String var2) {
      b3(var0, var1, var2);
   }

   // $VF: synthetic method
   static void y4(i8 var0, Object var1, String var2) {
      o0(var0, var1, var2);
   }

   // $VF: synthetic method
   static void e2(i8 var0, Object var1, String var2) {
      z7(var0, var1, var2);
   }

   // $VF: synthetic method
   static void t9(i8 var0, Object var1, String var2) {
      v4(var0, var1, var2);
   }

   // $VF: synthetic method
   static void z1(i8 var0, Object var1, String var2) {
      u6(var0, var1, var2);
   }

   // $VF: synthetic method
   static void t4(i8 var0, Object var1, String var2) {
      t1(var0, var1, var2);
   }

   // $VF: synthetic method
   static void q0(i8 var0, Object var1, String var2) {
      a5(var0, var1, var2);
   }

   // $VF: synthetic method
   static void z3(i8 var0, Object var1, String var2) {
      h2(var0, var1, var2);
   }

   // $VF: synthetic method
   static void m1(i8 var0, Object var1, String var2) {
      v0(var0, var1, var2);
   }

   // $VF: synthetic method
   static void k7(i8 var0, Object var1, String var2) {
      f0(var0, var1, var2);
   }

   // $VF: synthetic method
   static void m3(i8 var0, Object var1, String var2) {
      a3(var0, var1, var2);
   }

   // $VF: synthetic method
   static void z8(i8 var0, Object var1, String var2) {
      p3(var0, var1, var2);
   }

   // $VF: synthetic method
   static void j5(i8 var0, Object var1, String var2) {
      x9(var0, var1, var2);
   }

   // $VF: synthetic method
   static void w1(i8 var0, Object var1, String var2) {
      y0(var0, var1, var2);
   }

   // $VF: synthetic method
   static void r4(i8 var0, Object var1, String var2) {
      j9(var0, var1, var2);
   }

   // $VF: synthetic method
   static void n5(i8 var0, Object var1) {
      t2(var0, var1);
   }

   // $VF: synthetic method
   static void n5(i8 var0) {
      y4(var0);
   }

   // $VF: synthetic method
   static void l6(i8 var0) {
      e2(var0);
   }

   // $VF: synthetic method
   static void l6(i8 var0, Object var1) {
      s7(var0, var1);
   }

   // $VF: synthetic method
   static void k5(i8 var0) {
      t9(var0);
   }

   // $VF: synthetic method
   static void u3(i8 var0) {
      z1(var0);
   }

   // $VF: synthetic method
   static void k5(i8 var0, Object var1) {
      x8(var0, var1);
   }

   // $VF: synthetic method
   static void a6(i8 var0) {
      t4(var0);
   }

   // $VF: synthetic method
   static void u9(i8 var0) {
      q0(var0);
   }

   // $VF: synthetic method
   static void u3(i8 var0, Object var1) {
      n3(var0, var1);
   }

   // $VF: synthetic method
   static void h0(i8 var0) {
      z3(var0);
   }

   // $VF: synthetic method
   static void a6(i8 var0, Object var1) {
      y4(var0, var1);
   }

   // $VF: synthetic method
   static void c8(i8 var0) {
      m1(var0);
   }

   // $VF: synthetic method
   static void t2(i8 var0) {
      k7(var0);
   }

   // $VF: synthetic method
   static void u9(i8 var0, Object var1) {
      e2(var0, var1);
   }

   // $VF: synthetic method
   static void s7(i8 var0) {
      m3(var0);
   }

   // $VF: synthetic method
   static void h0(i8 var0, Object var1) {
      t9(var0, var1);
   }

   // $VF: synthetic method
   static void x8(i8 var0) {
      z8(var0);
   }

   // $VF: synthetic method
   static void c8(i8 var0, Object var1) {
      z1(var0, var1);
   }

   // $VF: synthetic method
   static void n3(i8 var0) {
      j5(var0);
   }
}
