package com.aspose.slides.internal.a5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e5.t2;
import com.aspose.slides.internal.e5.t9;
import com.aspose.slides.internal.e5.w1;
import com.aspose.slides.internal.h2.c8;
import com.aspose.slides.internal.h2.d5;
import com.aspose.slides.internal.w2.u9;
import com.aspose.slides.ms.System.d1;

public class n5 extends t9 implements d5 {
   private l6 u9;
   private List<n5> h0 = new List<>();
   private c8 c8;
   private String t2;
   private String s7;
   private boolean x8 = true;

   public n5(t2 var1) {
      super(var1);
   }

   @Override
   public void n5(w1 var1) {
      this.c8 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.s7 = var1.u3(94).j_();
      this.t2 = var1.u3(128).j_();
      this.x8 = var1.u3(234).a6() == 130;
      if (this.t2.length() > 0) {
         this.s7 = null;
      } else if (this.s7.length() == 0) {
         this.y4().n5(this, this.t9(), this.k5);
      } else {
         this.y4().u9(this, this.t9(), "external-destination", this.m_());
      }
   }

   @Override
   public void n5(u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "bookmark-title")) {
            if (this.u9 != null) {
               this.n5(var1, "fo:bookmark-title");
            }
         } else if (d1.a6(var3, "bookmark")) {
            if (this.u9 == null) {
               this.l6(var1, "fo:bookmark-title", "fo:bookmark");
            }
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public void c8() {
      if (this.u9 == null) {
         this.l6("(bookmark-title, bookmark*)");
      }
   }

   @Override
   public void n5(t2 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, l6.class)) {
         this.u9 = (l6)var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, n5.class)) {
         this.h0.addItem(com.aspose.slides.internal.v6g.k5.n5(var1, n5.class));
      }
   }

   @Override
   public final c8 i1() {
      return this.c8;
   }

   public final String e5() {
      return this.u9 == null ? d1.n5 : this.u9.e5();
   }

   public final String b3() {
      return this.t2;
   }

   public final boolean o0() {
      return this.x8;
   }

   public final List<n5> z7() {
      return this.h0;
   }

   @Override
   public String z1() {
      return "bookmark";
   }

   @Override
   public int z3() {
      return 6;
   }
}
