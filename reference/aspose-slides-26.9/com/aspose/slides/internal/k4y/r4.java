package com.aspose.slides.internal.k4y;

public class r4 extends j5 {
   private c8q n5;
   private z6y l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("dataDisplayOptions16");

   public r4(x8 var1) {
      if (var1 != null) {
         this.l6 = n5(var1, "{56B9EC1D-385E-4148-901F-78D8002777C0}");
         if (this.l6 != null) {
            try {
               for (Object recoveredElement$var3$421 : this.l6.l6().getDocumentElement()) {
                  com.aspose.slides.ms.System.Xml.l0 var3 = (com.aspose.slides.ms.System.Xml.l0)recoveredElement$var3$421;
                  switch (k5.n5(var3.getLocalName())) {
                     case 0:
                        com.aspose.slides.internal.z0k.w1 var4 = new com.aspose.slides.internal.z0k.w1(var3.getOuterXml());

                        try {
                           com.aspose.slides.ms.System.Xml.p5 var5 = new com.aspose.slides.ms.System.Xml.p5(var4);

                           try {
                              var5.k5(true);

                              while (!var5.j5() && var5.s7() != 1) {
                                 var5.u9();
                              }

                              if (!var5.j5()) {
                                 this.n5(new c8q(var5));
                              }
                           } finally {
                              if (var5 != null) {
                                 var5.dispose();
                              }
                           }
                        } finally {
                           if (var4 != null) {
                              var4.dispose();
                           }
                        }
                  }
               }
            } catch (RuntimeException var16) {
               com.aspose.slides.internal.n8e.v4.n5(var16);
            }
         }
      }
   }

   public final c8q n5() {
      return this.n5;
   }

   public final void n5(c8q var1) {
      this.n5 = var1;
   }
}
