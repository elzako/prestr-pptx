package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.d1;

public class j5 extends com.aspose.slides.internal.e1.y4 {
   private com.aspose.slides.internal.z0k.t4 n5;
   private l6 l6;
   private Stack<y2> k5 = new Stack<>();
   private com.aspose.slides.internal.w0.c8 u3 = new com.aspose.slides.internal.w0.c8();
   private com.aspose.slides.internal.g0.l6 a6 = new com.aspose.slides.internal.g0.l6();
   private com.aspose.slides.internal.b8.u9 u9 = new com.aspose.slides.internal.b8.u9();
   private long h0 = 19L;

   public j5(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.b8.u9 var2, t9 var3) {
      this.n5 = var1;
      this.l6 = new l6(new com.aspose.slides.internal.z0k.e2(), var3);
      this.u9 = var2;
      this.u3.n5(20.0F, 20.0F, 0);
   }

   public final void l6(com.aspose.slides.internal.e1.m3 var1, com.aspose.slides.internal.b8.s7 var2) {
      this.l6(var1);
   }

   private void l6() {
      s7 var1 = new s7(this.l6);
      if (this.l6.u9() != null) {
         var1.n5(this.l6.k5().n5(), this.l6.u9().n5(), this.l6.u9().l6());
      } else {
         var1.n5(this.l6.k5().n5(), 20000, 12000);
      }

      this.h0 = this.l6.u3().l6().n5().getPosition() - 2L;
      u3 var2 = new u3(this.l6);
      var2.n5();
      e2 var3 = new e2(this.l6);
      var3.n5(this.u9);
      if (this.l6.k5().l6()) {
         this.l6.k5().n5(65535);
         this.l6.k5().k7().clear();
         this.l6.k5().k7().addItem("actualSizeBtn", "Actual size");
         this.l6.k5().k7().addItem("fitToHeighthBtn", "Fit to height");
         this.l6.k5().k7().addItem("fitToWidthBtn", "Fit to width");
         this.l6.k5().k7().addItem("zoomOutBtn", "Zoom out");
         this.l6.k5().k7().addItem("zoomInBtn", "Zoom in");
         this.l6.k5().k7().addItem("selectionModeSwitcher", "Text selection mode");
         this.l6.k5().k7().addItem("dragModeSwitcher", "Page drag mode");
         this.l6.k5().k7().addItem("singlePageContLayoutBtn", "Enable page scrolling");
         this.l6.k5().k7().addItem("singlePageLayoutBtn", "Single page view");
         this.l6.k5().k7().addItem("twoPageContLayoutBtn", "Two page scrolling");
         this.l6.k5().k7().addItem("twoPageLayoutBtn", "Two page view");
         this.l6.k5().k7().addItem("readModeBtn", "Enable read mode");
         this.l6.k5().k7().addItem("fsBtn", "Switch full screen mode");
         this.l6.k5().k7().addItem("decrementButton", "Previous page");
         this.l6.k5().k7().addItem("textDisplay", "Enter value");
         this.l6.k5().k7().addItem("incrementButton", "Next page");
         this.l6.k5().k7().addItem("searchField", "Enter search term");
         this.l6.k5().k7().addItem("searchBtn", "Search/Next entry");
         this.l6.k5().j5().clear();
         this.l6.k5().j5().addItem("closeBtn", "Exit read mode");
         this.l6.k5().m3().clear();
         this.l6.k5().m3().addItem("aboutBtn", "About this application");
         this.l6.k5().m3().addItem("pagePreviewPane", "Page preview");
         this.l6.k5().m3().addItem("collapsePanelBtn", "Collapse Panel");
         this.l6.k5().m3().addItem("toc", "Document map");
         this.l6.u3().n5(w1.n5());
         this.l6.n5();
      }
   }

   public final void n5() {
      this.l6();
      this.l6.n5(this.l6.k5().l6());
      this.l6.u3().n5(0, 0);
      com.aspose.slides.internal.z0k.t4 var1 = this.l6.u3().l6().n5();
      var1.setPosition(4L);
      this.l6.u3().k5((int)var1.getLength());
      var1.setPosition(this.h0);
      this.l6.u3().l6((short)(this.l6.a6().size() + (this.l6.k5().l6() ? 2 : 0)));
      var1.setPosition(0L);
      if (this.l6.k5().n5()) {
         this.n5(var1);
      } else {
         com.aspose.slides.internal.n2d.t4.n5(var1, this.n5);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.w1 var1) {
      short var2 = this.l6.l6();
      this.l6.n5(var2, var1.n5().a6());
      y2 var3 = new y2(this.l6, var2);
      this.n5(var3);
      y2 var4 = new y2(this.l6, this.l6.l6());
      this.n5(var4);
      com.aspose.slides.internal.e1.r4 var5 = new com.aspose.slides.internal.e1.r4();
      com.aspose.slides.internal.e1.c4 var6 = new com.aspose.slides.internal.e1.c4();
      var6.l6(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.l6(), var1.k5()));
      var6.n5(true);
      var5.n5(var6);
      com.aspose.slides.internal.e1.r4 var7 = var5.y4();
      short var8 = this.l6.u9().n5(var7);
      var3.n5(var8, this.u3, d1.n5, false);
      this.n5(var5, this.u3, var3);
      var3.n5(var4.l6(), this.u3, null);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.w1 var1) {
      this.l6.u9().n5(this.k5());
      y2 var2 = this.k5();
      if (this.l6.k5().u9()) {
         com.aspose.slides.internal.e1.r4 var3 = new com.aspose.slides.internal.e1.r4();
         com.aspose.slides.internal.e1.c4 var4 = new com.aspose.slides.internal.e1.c4();
         var4.l6(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.l6(), var1.k5()));
         var4.n5(true);
         var3.n5(var4);
         var3.n5(new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.b2));
         var3.n5(new com.aspose.slides.internal.w0.s7(new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.c8), 1.0F));
         short var5 = this.l6.u9().n5(var3);
         var2.n5(var5, this.u3, d1.n5, false);
      }

      this.l6.n5(var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.t2 var1) {
      y2 var2 = this.u3();
      y2 var3 = new y2(this.l6, this.l6.l6());
      if (var1.a6() != null) {
         this.n5(var1.a6(), var1.u3(), var2);
      }

      String var4 = d1.n5;
      if (var1.u9() != null) {
         var4 = d1.n5("hyperlink{0}", new Object[]{var3.l6()});
         this.l6.u9().n5(var3.l6(), var1.u9());
      }

      var2.n5(var3.l6(), var1.u3(), var4);
      this.n5(var3);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.t2 var1) {
      this.l6.u9().n5(this.k5());
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.z1 var1) {
      y2 var2 = this.u3();
      short var3 = this.l6.u9().n5(var1);
      if (var1.z1() != null) {
         var2 = this.n5(var1.z1(), var2);
      }

      com.aspose.slides.internal.w0.c8 var4 = var1.u3() != null ? var1.u3().k5() : new com.aspose.slides.internal.w0.c8();
      var4.n5(0.05F, 0.05F, 0);
      com.aspose.slides.internal.e1.r4 var5 = new com.aspose.slides.internal.e1.r4();
      com.aspose.slides.internal.e1.c4 var6 = new com.aspose.slides.internal.e1.c4();
      var6.l6(new com.aspose.slides.internal.o9b.y1(var1.s7().l6(), var1.s7().k5() - var1.l6().c8(), var1.q0().s7(), var1.q0().k5()));
      var6.n5(true);
      var5.n5(var6);
      short var7 = this.l6.u9().n5(var5);
      var2.n5(var7, new com.aspose.slides.internal.w0.c8(), d1.n5, false);
      if (var1.a6() != null) {
         this.n5(var1.a6(), var1.u3(), var2);
      }

      var2.n5(var3, var4, d1.n5);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.r4 var1) {
      y2 var2 = this.u3();
      if (var1.a6() != null) {
         this.n5(var1.a6(), var1.u3(), var2);
      }

      short var3 = this.l6.u9().n5(var1);
      var2.n5(var3, var1.u3(), d1.n5);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.k7 var1) {
      var1 = var1.n5(this, this.a6, false, false);
      if (var1 != null) {
         this.l6(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.u9 var1) {
      this.l6.n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.j5 var1) {
      this.l6.n5(var1);
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1) {
      n5 var2 = new n5(this.n5);
      byte[] var3 = new byte[8];
      var1.read(var3, 0, var3.length);
      var2.n5(var3);
      byte[] var4 = new byte[(int)(var1.getLength() - var3.length)];
      var1.read(var4, 0, var4.length);
      byte[] var5 = com.aspose.slides.internal.j7.t9.n5(var4, 1);
      var2.n5(var5);
   }

   private void l6(com.aspose.slides.internal.e1.k7 var1) {
      com.aspose.slides.internal.e1.r4 var2 = new com.aspose.slides.internal.e1.r4();
      com.aspose.slides.internal.e1.c4 var3 = new com.aspose.slides.internal.e1.c4();
      var3.l6(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.l6().l6(), var1.l6().k5()));
      var3.n5(true);
      var2.n5(var3);
      var2.n5(k5(var1));
      com.aspose.slides.internal.w0.c8 var4 = new com.aspose.slides.internal.w0.c8();
      var4.l6(var1.n5().l6(), var1.n5().k5(), 0);
      y2 var5 = this.u3();
      if (var1.c8() != null) {
         var5 = this.n5(var1.c8(), var5);
      }

      short var6 = this.l6.u9().n5(var2);
      var5.n5(var6, var4, d1.n5);
   }

   private static com.aspose.slides.internal.w0.y4 k5(com.aspose.slides.internal.e1.k7 var0) {
      com.aspose.slides.internal.w0.y4 var1 = new com.aspose.slides.internal.w0.y4(var0.u3());
      var1.n5(4);
      com.aspose.slides.internal.w0.c8 var2 = new com.aspose.slides.internal.w0.c8();
      com.aspose.slides.internal.k4d.u3 var3 = com.aspose.slides.internal.k4d.a6.z3(var0.u3());
      float var4 = var0.l6().l6() / var3.n5();
      float var5 = var0.l6().k5() / var3.l6();
      var2.n5(var4, var5, 0);
      var1.n5(var2);
      return var1;
   }

   private y2 n5(com.aspose.slides.internal.e1.m1 var1, y2 var2) {
      y2 var3 = new y2(this.l6, this.l6.l6());
      var2.n5(var3.l6(), new com.aspose.slides.internal.w0.c8(), d1.n5("hyperlink{0}", new Object[]{var3.l6()}));
      this.l6.u9().n5(var3.l6(), var1);
      var2 = var3;
      this.l6.u9().n5(var3);
      return var2;
   }

   private void n5(com.aspose.slides.internal.e1.r4 var1, com.aspose.slides.internal.w0.c8 var2, y2 var3) {
      short var4 = this.l6.u9().n5(var1);
      com.aspose.slides.internal.w0.c8 var5 = var1.u3() != null ? var1.u3().k5() : new com.aspose.slides.internal.w0.c8();
      if (var2 != null) {
         var5.n5(var2, 0);
      }

      var3.n5(var4, var5, d1.n5, true);
   }

   private void n5(y2 var1) {
      this.k5.push(var1);
   }

   private y2 k5() {
      return this.k5.pop();
   }

   private y2 u3() {
      return this.k5.peek();
   }
}
