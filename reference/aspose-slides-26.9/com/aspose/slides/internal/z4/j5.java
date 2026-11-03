package com.aspose.slides.internal.z4;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class j5 extends z1 {
   private final float n5;
   private final float k5;
   private final a0 u3;
   private final com.aspose.slides.internal.f1s.t2 a6;
   private final d2 u9;
   private final com.aspose.slides.internal.f1s.h0 h0;
   private final com.aspose.slides.internal.e6r.l6 c8;
   private int t2;
   private com.aspose.slides.internal.e6r.c8 s7;
   private r4 x8;
   private com.aspose.slides.internal.e1.m1 n3;
   private u3 y4;
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "Title",
      "SubTitle",
      "Paragraph",
      "Textbox",
      "TOC",
      "TOCI",
      "List",
      "ListItem",
      "ListLabel",
      "ListBody",
      "Table",
      "THead",
      "TFoot",
      "TBody",
      "TR",
      "TH",
      "TD",
      "MathBlock",
      "Diagram",
      "Figure",
      "Chart",
      "Artifact"
   );

   public j5(c8 var1, float var2, float var3) {
      super(var1);
      this.n5 = var2;
      this.k5 = var3;
      this.u3 = new a0(this.l6);
      this.a6 = new com.aspose.slides.internal.f1s.t2(this.u3);
      this.u9 = new d2(this.l6, this.u3);
      this.h0 = new com.aspose.slides.internal.f1s.h0(this.l6, this.l6.k5(), this.u3);
      this.c8 = new com.aspose.slides.internal.e6r.l6();
      this.l6.x8().n5();
      this.l6.x8().n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.k5), this.u3);
      t2 var4 = this.n5(com.aspose.slides.internal.o9b.w1.n5.u3());
      this.l6.u9().n5(this.h0().a6().n5() + 1, var4);
      if (this.l6.y4()) {
         this.t2 = this.l6.z1().z1();
         this.s7 = this.l6.z1().a6(this.t2());
      }
   }

   public final boolean n5() {
      return "/Formula".equals(this.s7.n5());
   }

   public final boolean l6() {
      return "/Artifact".equals(this.s7.n5()) || "/Figure".equals(this.s7.n5()) || "/Diagram".equals(this.s7.n5());
   }

   public final void k5() {
      this.u9.l6();
   }

   public final void n5(com.aspose.slides.internal.e1.p8 var1) {
      this.u9.l6();
      this.n5(var1, false);
   }

   public final void n5(com.aspose.slides.internal.e1.t2 var1) {
      this.l6(var1, false);
      if (var1.u9() != null) {
         this.n5(var1.u9());
      }
   }

   public final void n5(com.aspose.slides.internal.e1.z3 var1) {
      if (this.l6.y4()) {
         com.aspose.slides.internal.e6r.c8 var2 = null;
         switch (e2.n5(var1.k5())) {
            case 0:
               var2 = this.s7.s7("/H1");
               break;
            case 1:
               var2 = this.s7.s7("/H2");
               break;
            case 2:
               var2 = this.s7.s7("/P");
               break;
            case 3:
               var2 = this.s7.s7("/Textbox");
               var2.a6(var1.l6());
               break;
            case 4:
               var2 = this.s7.s7("/TOC");
               var2.a6(var1.l6());
               break;
            case 5:
               var2 = this.s7.s7("/TOCI");
               var2.a6(var1.l6());
               break;
            case 6:
               var2 = this.s7.s7("/L");
               var2.a6(var1.l6());
               break;
            case 7:
               var2 = this.s7.s7("/LI");
               var2.a6(var1.l6());
               break;
            case 8:
               var2 = this.s7.s7("/Lbl");
               int var10 = this.h0().z1().n5(this.t2, var2.t2());
               this.c8.n5("/Lbl", var10, this.u3);
               break;
            case 9:
               var2 = this.s7.s7("/LBody");
               int var9 = this.h0().z1().n5(this.t2, var2.t2());
               this.c8.n5("/LBody", var9, this.u3);
               break;
            case 10:
               var2 = this.s7.s7("/Table");
               var2.a6(var1.l6());
               break;
            case 11:
               var2 = this.s7.s7("/THead");
               break;
            case 12:
               var2 = this.s7.s7("/TFoot");
               break;
            case 13:
               var2 = this.s7.s7("/TBody");
               break;
            case 14:
               var2 = this.s7.s7("/TR");
               break;
            case 15:
               var2 = this.s7.s7("/TH");
               var2.m1().addItem("/O", "/Table");
               var2.m1().addItem("/Scope", (String)var1.n5());
               break;
            case 16:
               var2 = this.s7.s7("/TD");
               break;
            case 17:
               var2 = this.s7.s7("/Formula");
               com.aspose.slides.internal.e6r.c8[] var13 = new com.aspose.slides.internal.e6r.c8[]{var2};
               this.n5(var13, var1, true);
               var2 = var13[0];
               break;
            case 18:
               var2 = this.s7.s7("/Diagram");
               com.aspose.slides.internal.e6r.c8[] var12 = new com.aspose.slides.internal.e6r.c8[]{var2};
               this.n5(var12, var1, true);
               var2 = var12[0];
               break;
            case 19:
               var2 = this.s7.s7("/Figure");
               com.aspose.slides.internal.e6r.c8[] var11 = new com.aspose.slides.internal.e6r.c8[]{var2};
               this.n5(var11, var1, false);
               var2 = var11[0];
               break;
            case 20:
               var2 = this.s7.s7("/Figure");
               com.aspose.slides.internal.e6r.c8[] var4 = new com.aspose.slides.internal.e6r.c8[]{var2};
               this.n5(var4, var1, true);
               var2 = var4[0];
               break;
            case 21:
               var2 = this.s7.s7("/Artifact");
               int var3 = this.h0().z1().n5(this.t2, var2.t2());
               var2.n5(var3);
               this.c8.n5("/P", var3, this.u3);
         }

         if (var2 != null) {
            this.s7 = var2;
         }
      }
   }

   private void n5(com.aspose.slides.internal.e6r.c8[] var1, com.aspose.slides.internal.e1.z3 var2, boolean var3) {
      var1[0].a6(var2.l6());
      com.aspose.slides.internal.o9b.y1 var4 = com.aspose.slides.internal.v6g.k5.u3(var2.n5(), com.aspose.slides.internal.o9b.y1.class).y4();
      var1[0].n5(var4.y4());
      var1[0].c8("/Block");
      int var5 = this.h0().z1().n5(this.t2, var1[0].t2());
      var1[0].n5(var5);
      this.c8.n5("/P", var5, this.u3);
      if (var3 && this.h0().n3()) {
         this.s7 = var1[0];
         com.aspose.slides.internal.e1.r4 var6 = com.aspose.slides.internal.e1.r4.n5(var4.y4());
         var6.n5(new com.aspose.slides.internal.w0.n3(new com.aspose.slides.internal.p1s.n5(0, 0, 0, 0)));
         var6.n5(new com.aspose.slides.internal.w0.s7(new com.aspose.slides.internal.w0.n3(new com.aspose.slides.internal.p1s.n5(0, 0, 0, 0))));
         this.n5(var6, true);
         this.h0.n5(0.0F, 0.0F);
         this.n5(var6);
         this.n5(com.aspose.slides.internal.v6g.k5.n5(var6.s7().get_Item(0), com.aspose.slides.internal.e1.c4.class));
         this.n5(
            com.aspose.slides.internal.v6g.k5.n5(
               ((com.aspose.slides.internal.e1.c4)var6.s7().get_Item(0)).s7().get_Item(0), com.aspose.slides.internal.e1.y2.class
            )
         );
         this.l6(com.aspose.slides.internal.v6g.k5.n5(var6.s7().get_Item(0), com.aspose.slides.internal.e1.c4.class));
         this.l6(var6);
         this.l6(var6, true);
         this.c8.u3(this.u3);
         this.c8.n5(this.u3);
      }
   }

   public final void l6(com.aspose.slides.internal.e1.z3 var1) {
      if (this.l6.y4()) {
         if (this.s7.k7() != this.z1()
            && (
               "/L".equals(this.s7.n5())
                  || "/LI".equals(this.s7.n5())
                  || "/LBody".equals(this.s7.n5())
                  || "/Lbl".equals(this.s7.n5())
                  || "/Header".equals(this.s7.n5())
                  || "/Footer".equals(this.s7.n5())
                  || "/H1".equals(this.s7.n5())
                  || "/H2".equals(this.s7.n5())
                  || "/P".equals(this.s7.n5())
                  || "/Textbox".equals(this.s7.n5())
                  || "/TOC".equals(this.s7.n5())
                  || "/TOCI".equals(this.s7.n5())
                  || "/P".equals(this.s7.n5())
                  || "/Table".equals(this.s7.n5())
                  || "/THead".equals(this.s7.n5())
                  || "/TFoot".equals(this.s7.n5())
                  || "/TR".equals(this.s7.n5())
                  || "/TH".equals(this.s7.n5())
                  || "/TD".equals(this.s7.n5())
                  || "/TBody".equals(this.s7.n5())
            )) {
            this.s7 = this.s7.k7();
         }

         if ("ListLabel".equals(var1.k5()) || "ListBody".equals(var1.k5()) || "Artifact".equals(var1.k5())) {
            this.c8.u3(this.u3);
         }

         if ("/Figure".equals(this.s7.n5()) || "Diagram".equals(var1.k5()) || "MathBlock".equals(var1.k5())) {
            this.c8.u3(this.u3);
            this.s7 = this.s7.k7();
         }

         this.u3();
      }
   }

   public final void n5(com.aspose.slides.internal.e1.z1 var1) {
      boolean var2 = false;
      int var3 = 0;
      if (var1.w1()) {
         if (var1.r4()) {
            this.c8.l6(this.u3);
            var3++;
         } else if (var1.c4()) {
            this.c8.k5(this.u3);
            var3++;
         } else {
            this.c8.n5(this.u3);
            var3++;
         }
      } else if (this.l6.y4() && !this.n5()) {
         if (var1.z1() != null) {
            var2 = this.n3 != null && d1.a6(this.n3.k5(), var1.z1().k5());
            if (this.n3 == null || !var2) {
               int var4 = this.h0().z1().n5().n5(this.t2);
               this.c8.n5(var4, this.u3);
               var3++;
            }
         } else {
            this.u3();
            com.aspose.slides.internal.e6r.c8 var9 = this.s7;
            com.aspose.slides.internal.e6r.c8 var5 = var9.n5("/Span", var1.x8());
            var5.h0(var1.m1());
            var5.n5(this.h0().z1().n5(this.t2, var5.t2()));
            this.c8.n5("/Span", var5.m3(), this.u3, var1.m1());
            var3++;
         }
      }

      boolean var10 = var1.u3() != null && var1.u3().n5();
      this.n5(var1, var10);
      if (var1.z1() != null) {
         if (!var2) {
            u3 var11 = this.n5(var1.z1());
            if (this.l6.y4()) {
               com.aspose.slides.internal.e6r.c8 var6 = this.s7.x8(var11.t2());
               this.h0().z1().n5(this.t2, var6.t2());
               var11.n5(this.h0().z1().u9(var6.t2()));
               var11.n5(var1.x8());
               com.aspose.slides.internal.e6r.c8 var7 = var6;
               com.aspose.slides.internal.e6r.c8 var8 = var7.n5("/Span", var1.x8());
               var8.h0(var1.m1());
               var8.n5(this.h0().z1().n5(this.t2, var8.t2()));
               this.c8.n5("/Span", var8.m3(), this.u3, var1.m1());
               this.n3 = var1.z1();
               this.y4 = var11;
               var3++;
            }
         } else {
            this.y4.n5(d1.n5(new String[]{this.y4.k5(), var1.x8()}));
            com.aspose.slides.internal.o9b.y1 var12 = this.l6.x8().n5(var1.z1().n5().y4()).y4();
            this.y4
               .n5(
                  new com.aspose.slides.internal.o9b.y1(
                     q1.l6(this.y4.n5().x8(), var12.x8()),
                     q1.l6(this.y4.n5().n3(), var12.n3()),
                     q1.n5(this.y4.n5().s7(), var12.s7()),
                     this.y4.n5().k5() + var12.k5()
                  )
               );
         }
      }

      this.u9.n5(var1);
      this.l6(var1, var10);
      if (this.y4 == null) {
         while (var3-- > 0) {
            this.c8.u3(this.u3);
         }
      }
   }

   public final void n5(com.aspose.slides.internal.e1.r4 var1) {
      this.u9.l6();
      if (var1.s7().size() != 0 || var1.n3() != null) {
         if (var1.l6() != null) {
            com.aspose.slides.internal.g3.n5 var2 = null;
            com.aspose.slides.internal.g3.n5[] var3 = new com.aspose.slides.internal.g3.n5[]{var2};
            boolean var4 = !this.h0().t4().n5(var1.l6(), var3) && this.h0().l6().m3() != null && !this.h0().l6().m3().n5(var3[0]);
            var2 = var3[0];
            if (var4) {
               throw var2;
            }
         }

         if (this.l6.y4() && !this.n5() && !this.l6()) {
            if (var1.n3() != null) {
               int var8 = this.h0().z1().n5().n5(this.t2);
               this.c8.k5(var8, this.u3);
            } else {
               this.c8.n5(this.u3);
            }
         }

         this.n5(var1, com.aspose.slides.internal.e1.q0.n5(var1));
         if (var1.k5() != null) {
            try {
               this.h0.n5(var1.k5(), false);
            } catch (com.aspose.slides.internal.g3.k5 var6) {
               if (this.h0().l6().m3() == null || !this.h0().l6().m3().n5(var6)) {
                  throw var6;
               }
            }
         }

         if (var1.l6() != null) {
            try {
               this.h0.n5(var1.l6());
            } catch (com.aspose.slides.internal.g3.k5 var5) {
               if (this.h0().l6().m3() == null || !this.h0().l6().m3().n5(var5)) {
                  throw var5;
               }
            }
         }

         if (var1.n5() != null) {
            if (this.h0().u3() == null) {
               this.h0().t9().n3().u3();
            }

            this.h0().u3().n5().n5(var1.n5().n5(), var1.n5().l6(), var1.n5().k5());
         }
      }
   }

   public final void u3() {
      if (this.y4 != null) {
         this.c8.u3(this.u3);
         this.c8.u3(this.u3);
      }

      this.n3 = null;
      this.y4 = null;
   }

   public final void l6(com.aspose.slides.internal.e1.r4 var1) {
      if (var1.s7().size() != 0 || var1.n3() != null) {
         this.u3.k5(k5(var1));
         if (var1.n3() != null) {
            u3 var2 = this.n5(var1.n3());
            if (this.l6.y4()) {
               com.aspose.slides.internal.e6r.c8 var3 = this.s7.x8(var2.t2());
               this.h0().z1().n5(this.t2, var3.t2());
               var2.n5(this.h0().z1().u9(var3.t2()));
               var2.n5(var1.n3().h0());
               if (d1.n5(var2.k5())) {
                  var3.a6("Hyperlink");
               }
            }
         }

         this.l6(var1, com.aspose.slides.internal.e1.q0.n5(var1));
         if (this.l6.y4() && !this.n5() && !this.l6()) {
            this.c8.u3(this.u3);
         }
      }
   }

   private static String k5(com.aspose.slides.internal.e1.r4 var0) {
      a5 var1 = new a5();
      if (var0.k5() != null && var0.l6() != null) {
         var1.n5(var0.x8() ? "b" : "B");
         if (var0.h0() == 0) {
            var1.n5("*");
         }
      } else if (var0.k5() != null) {
         var1.n5("f");
         if (var0.h0() == 0) {
            var1.n5("*");
         }
      } else if (var0.l6() != null) {
         var1.n5(var0.x8() ? "s" : "S");
      }

      return var1.toString();
   }

   public final void n5(com.aspose.slides.internal.e1.c4 var1) {
      this.a6.n5(var1);
   }

   public final void l6(com.aspose.slides.internal.e1.c4 var1) {
      this.a6.l6(var1);
   }

   public final void n5(com.aspose.slides.internal.e1.y2 var1) {
      this.a6.n5(var1);
   }

   public final void n5(com.aspose.slides.internal.e1.a6 var1) {
      this.a6.n5(var1);
   }

   public final void n5(com.aspose.slides.internal.e1.k7 var1) {
      this.u9.l6();
      com.aspose.slides.internal.o9b.y1 var2 = var1.k5().y4();
      if (!com.aspose.slides.internal.s5.c8.n5(var1.h0())) {
         var1.h0().l6(var2.y4()).a6(var2);
      }

      if (this.l6.y4()) {
         if (var1.w1() && var1.c8() == null) {
            this.c8.n5(this.u3);
         } else {
            int var4;
            if (var1.c8() == null) {
               com.aspose.slides.internal.e6r.c8 var3 = this.s7.n5(var1.x8(), var2.y4());
               var4 = this.h0().z1().n5(this.t2, var3.t2());
               var3.n5(var4);
            } else {
               var4 = this.h0().z1().n5().n5(this.t2);
            }

            this.c8.l6(var4, this.u3);
         }
      }

      this.h0.n5(var1.u3(), var1.h0(), var2.y4(), var1.t2(), true);
      if (var1.c8() != null) {
         u3 var7 = this.n5(var1.c8());
         var7.n5(var1.x8());
         if (this.l6.y4()) {
            com.aspose.slides.internal.e6r.c8 var6 = this.s7.x8(var7.t2());
            com.aspose.slides.internal.e6r.c8 var5 = var6.n5(var1.x8(), var2.y4());
            var5.c8("/Inline");
            var5.n5(this.h0().z1().n5(this.t2, var5.t2()));
            var7.n5(this.h0().z1().u9(var6.t2()));
         }
      }

      if (this.l6.y4()) {
         this.c8.u3(this.u3);
      }

      if (var1.a6() != null) {
         if (this.h0().u3() == null) {
            this.h0().t9().n3().u3();
         }

         this.h0().u3().n5().n5(var1.a6().n5(), var1.a6().l6(), var1.a6().k5());
      }
   }

   public final void n5(com.aspose.slides.internal.f6.l6 var1) {
      this.t9().addItem(var1.t2());
   }

   @Override
   public void n5(t4 var1) {
      this.l6(var1);
      this.u3.n5(var1);
   }

   private void l6(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Page");
      var1.k5("/Parent", this.l6.a6().t2());
      var1.k5("/Contents", this.u3.t2());
      var1.n5("/MediaBox", new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, this.n5, this.k5));
      var1.n5("/Resources");
      var1.c8();
      this.l6.a6().l6().n5(var1);
      var1.t2();
      if (!this.l6.e2()) {
         var1.k5("/Group", "<</Type/Group/S/Transparency/CS/DeviceRGB>>");
      }

      if (this.x8 != null) {
         var1.n5("/Annots");
         this.x8.n5(var1);
      }

      if (this.l6.y4()) {
         var1.k5("/Tabs", "/S");
         var1.n5("/StructParents", this.t2);
      }

      var1.t2();
      var1.l6();
   }

   private void n5(com.aspose.slides.internal.e1.p8 var1, boolean var2) {
      if (var2 || com.aspose.slides.internal.e1.q0.n5(var1)) {
         this.u9.l6();
         this.l6.x8().n5(this.u3);
         if (com.aspose.slides.internal.e1.q0.l6(var1)) {
            this.l6.x8().n5(var1.u3(), this.u3);
         }

         if (com.aspose.slides.internal.e1.q0.k5(var1)) {
            com.aspose.slides.internal.f1s.t2 var3 = new com.aspose.slides.internal.f1s.t2(this.u3);
            var3.l6(var1.a6());
            this.u3.k5("W n");
         }
      }
   }

   private void l6(com.aspose.slides.internal.e1.p8 var1, boolean var2) {
      if (var2 || com.aspose.slides.internal.e1.q0.n5(var1)) {
         this.u9.l6();
         this.l6.x8().l6(this.u3);
      }
   }

   public final u3 n5(com.aspose.slides.internal.e1.m1 var1) {
      u3 var2 = new u3(this.l6, this.l6.x8().n5(var1.n5().y4()).y4(), com.aspose.slides.internal.h3.u9.n5(var1));
      if (com.aspose.slides.internal.v6g.k5.l6(var2.l6(), com.aspose.slides.internal.h3.a6.class)) {
         ((com.aspose.slides.internal.h3.a6)var2.l6()).n5(this.h0().y4());
         ((com.aspose.slides.internal.h3.a6)var2.l6()).n5(this.h0().a6().n5());
      }

      this.t9().addItem(var2.t2());
      this.l6.u9().n5(var2);
      return var2;
   }

   public final void n5(com.aspose.slides.internal.e1.u9 var1) {
      t2 var2 = this.n5(var1.n5().u3());
      this.l6.u9().n5(var1.l6(), var2);
      int var3 = this.l6.l6().a6();
      if (var3 > 0 && !var1.k5()) {
         this.l6.h0().n5(var1.l6(), var3, var2);
      }
   }

   public final void n5(com.aspose.slides.internal.e1.j5 var1) {
      t2 var2 = this.n5(var1.n5().u3());
      int var3 = this.l6.l6().k5();
      if (var1.l6() < var3) {
         this.l6.h0().n5(var1.k5(), var1.l6(), var2);
      }
   }

   private t2 n5(com.aspose.slides.internal.o9b.w1 var1) {
      return new t2(this.t2(), this.l6.x8().n5(var1.u3()).u3());
   }

   public final float a6() {
      return this.n5;
   }

   public final float u9() {
      return this.k5;
   }

   private r4 t9() {
      if (this.x8 == null) {
         this.x8 = new r4();
      }

      return this.x8;
   }

   private com.aspose.slides.internal.e6r.c8 z1() {
      return this.u3.h0().z1().l6();
   }
}
