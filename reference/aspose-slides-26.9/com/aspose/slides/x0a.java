package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class x0a extends o9a {
   private final com.aspose.slides.internal.k4y.e1u n5;
   private final OdpSerializationContext l6;
   private final String k5;
   private final Dictionary<IShape, String> u3 = new Dictionary<>();

   public x0a(com.aspose.slides.internal.k4y.e1u var1, OdpSerializationContext var2, String var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final com.aspose.slides.internal.k4y.y2i n5(String var1, int var2) {
      com.aspose.slides.internal.k4y.y2i var3 = (com.aspose.slides.internal.k4y.y2i)this.n5().n5("style").l6();
      var3.n5(var2);
      var3.l6(com.aspose.slides.ms.System.d1.n5("{0}{1}{2}", this.k5, var1, this.k5().size()));
      this.k5().set_Item(var3.n5(), var3);
      return var3;
   }

   public final com.aspose.slides.internal.k4y.a8r n5(String var1) {
      com.aspose.slides.internal.k4y.a8r var2 = (com.aspose.slides.internal.k4y.a8r)this.n5().n5("list-style").l6();
      var2.l6(com.aspose.slides.ms.System.d1.n5("{0}{1}{2}", this.k5, var1, this.k5().size()));
      this.u3().set_Item(var2.n5(), var2);
      return var2;
   }

   protected final com.aspose.slides.internal.k4y.e1u n5() {
      return this.n5;
   }

   public final OdpSerializationContext l6() {
      return this.l6;
   }
}
