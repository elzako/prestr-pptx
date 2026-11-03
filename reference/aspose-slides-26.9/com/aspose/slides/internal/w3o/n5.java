package com.aspose.slides.internal.w3o;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.o0;

public final class n5 extends com.aspose.slides.internal.a0q.n5 {
   private String l6;
   private String k5;
   private o0 u3 = new o0();
   private String a6;
   private String u9;
   private j5 h0 = new j5();

   public n5() {
      super("stEvt", "http://ns.adobe.com/xap/1.0/sType/ResourceEvent#");
   }

   public final String u3() {
      return this.l6;
   }

   public final String a6() {
      return this.k5;
   }

   o0 u9() {
      return this.u3.k5();
   }

   public final String h0() {
      return this.a6;
   }

   public final String c8() {
      return this.u9;
   }

   j5 t2() {
      return this.h0.m3();
   }

   @Override
   public String n5() {
      a5 var1 = new a5();
      com.aspose.slides.internal.l3a.l6 var2 = new com.aspose.slides.internal.l3a.l6(this.t2().m3());
      var1.n5("<{0}>{1}</{0}>{2}", com.aspose.slides.internal.w3o.l6.n5, this.u3(), '\n');
      var1.n5("<{0}>{1}</{0}>{2}", com.aspose.slides.internal.w3o.l6.l6, this.a6(), '\n');
      var1.n5("<{0}>{1}</{0}>{2}", com.aspose.slides.internal.w3o.l6.k5, this.u9().k5(), '\n');
      var1.n5("<{0}>{1}</{0}>{2}", com.aspose.slides.internal.w3o.l6.u3, this.h0(), '\n');
      var1.n5("<{0}>{1}</{0}>{2}", com.aspose.slides.internal.w3o.l6.a6, this.c8(), '\n');
      var1.n5("<{0}>{1}</{0}>{2}", com.aspose.slides.internal.w3o.l6.u9, var2, '\n');
      return var1.toString();
   }
}
