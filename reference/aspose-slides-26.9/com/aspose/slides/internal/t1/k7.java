package com.aspose.slides.internal.t1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.a0.c4;
import com.aspose.slides.internal.h2.d5;
import com.aspose.slides.ms.System.d1;

public class k7 extends com.aspose.slides.internal.e5.t9 implements d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private h0 h0;
   private u3 c8;
   private com.aspose.slides.internal.a5.k5 t2 = null;
   private List<com.aspose.slides.internal.z7.n5> s7;
   private List<c4> x8;
   private com.aspose.slides.internal.x7n.l6 n3;
   private boolean y4 = false;
   private int e2 = 0;
   private int t9 = 0;
   private com.aspose.slides.internal.e5.y4 z1;
   private com.aspose.slides.internal.e5.c8 t4 = null;

   public k7(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
      this.x8 = new List<>();
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
      String var2 = var1.u3(134).j_();
      String var3 = var1.u3(81).j_();
      if (this.a6(var2)) {
         if (this.a6(var3)) {
            this.n3 = new com.aspose.slides.internal.x7n.l6(d1.n5(new String[]{var2, "-", var3}));
         } else {
            this.n3 = new com.aspose.slides.internal.x7n.l6(var2);
         }
      }
   }

   private boolean a6(String var1) {
      return var1 != null && !d1.a6(var1, "none");
   }

   @Override
   public void u9() {
      this.t4.n5(this);
   }

   @Override
   public void c8() {
      if (!this.y4 || this.h0 == null) {
         this.l6(d1.n5(new String[]{"(layout-master-set, declarations?, ", "bookmark-tree?, (page-sequence|fox:external-document)+)"}));
      }

      this.t4.l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "layout-master-set")) {
            if (this.h0 != null) {
               this.n5(var1, "fo:layout-master-set");
            }
         } else if (d1.a6(var3, "declarations")) {
            if (this.h0 == null) {
               this.l6(var1, "fo:layout-master-set", "fo:declarations");
            } else if (this.c8 != null) {
               this.n5(var1, "fo:declarations");
            } else if (this.t2 != null) {
               this.l6(var1, "fo:declarations", "fo:bookmark-tree");
            } else if (this.y4) {
               this.l6(var1, "fo:declarations", "fo:page-sequence");
            }
         } else if (d1.a6(var3, "bookmark-tree")) {
            if (this.h0 == null) {
               this.l6(var1, "fo:layout-master-set", "fo:bookmark-tree");
            } else if (this.t2 != null) {
               this.n5(var1, "fo:bookmark-tree");
            } else if (this.y4) {
               this.l6(var1, "fo:bookmark-tree", "fo:page-sequence");
            }
         } else if (d1.a6(var3, "page-sequence")) {
            if (this.h0 == null) {
               this.l6(var1, "fo:layout-master-set", "fo:page-sequence");
            } else {
               this.y4 = true;
            }
         } else {
            this.k5(var1, var2, var3);
         }
      } else if (d1.a6("http://xmlgraphics.apache.org/fop/extensions", var2) && d1.a6(var3, "external-document")) {
         this.y4 = true;
      }
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.internal.e5.c8 var1) {
      this.t4 = var1;
   }

   @Override
   public com.aspose.slides.internal.e5.c8 n_() {
      return this.t4;
   }

   public final void n5(com.aspose.slides.internal.e5.y4 var1) {
      this.z1 = var1;
   }

   @Override
   public com.aspose.slides.internal.e5.y4 o_() {
      return this.z1;
   }

   public final int e5() {
      return this.e2;
   }

   public final void n5(int var1, int var2) {
      if (var2 >= 0) {
         this.t9 += var2;
         this.e2 = var1;
      } else {
         throw new ArgumentException("Number of additional pages must be zero or greater.");
      }
   }

   public final h0 b3() {
      return this.h0;
   }

   public final void n5(h0 var1) {
      this.h0 = var1;
   }

   public final u3 o0() {
      return this.c8;
   }

   public final void n5(u3 var1) {
      this.c8 = var1;
   }

   public final void n5(com.aspose.slides.internal.a5.k5 var1) {
      this.t2 = var1;
   }

   public final void n5(com.aspose.slides.internal.z7.n5 var1) {
      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      this.s7.addItem(var1);
   }

   public final List<com.aspose.slides.internal.z7.n5> z7() {
      return this.s7;
   }

   public final com.aspose.slides.internal.a5.k5 v4() {
      return this.t2;
   }

   @Override
   public k7 e2() {
      return this;
   }

   @Override
   public String z1() {
      return "root";
   }

   @Override
   public int z3() {
      return 66;
   }

   public final com.aspose.slides.internal.x7n.l6 u6() {
      return this.n3;
   }
}
