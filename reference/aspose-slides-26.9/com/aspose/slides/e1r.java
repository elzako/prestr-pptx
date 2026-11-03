package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class e1r extends j3e {
   private final List<com.aspose.slides.internal.e1.m3> n5 = new List<>();

   public e1r(k3w var1, com.aspose.slides.internal.h6.n5 var2) {
      super(var1, var2);
   }

   final void l6(com.aspose.slides.internal.e1.m3 var1) {
      this.n5.addItem(var1);
   }

   final com.aspose.slides.internal.e1.m3[] u3() {
      return this.n5.toArray(new com.aspose.slides.internal.e1.m3[0]);
   }

   final void n5(TextFrame var1) {
      this.n5(var1, this.k5());
   }

   final void n5(ITextFrame var1) {
      if (this.n5.isEmpty() && var1.getParagraphs().getCount() > 1) {
         var1.getParagraphs().clear();
      } else {
         List var2 = this.u9();
         if (var2.size() >= 2) {
            List var3 = new List();
            IGenericEnumerator var4 = var1.getParagraphs().iterator();

            try {
               while (var4.hasNext()) {
                  IParagraph var5 = (IParagraph)var4.next();
                  int var6 = 0;
                  IGenericEnumerator var7 = var5.getPortions().iterator();

                  try {
                     while (var7.hasNext()) {
                        Portion var8 = (Portion)var7.next();
                        boolean var9 = false;
                        String var10 = var8.u9();
                        List$Enumerator var11 = var2.iterator();

                        try {
                           while (var11.hasNext()) {
                              String var12 = (String)var11.next();
                              if (com.aspose.slides.ms.System.d1.a6(var10, var12)) {
                                 var9 = true;
                                 var6++;
                                 break;
                              } else if (com.aspose.slides.ms.System.d1.l6(var10, var12)) {
                                 var8.n5(var12);
                                 var9 = true;
                                 var6++;
                                 break;
                              }
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                              var11.dispose();
                           }
                        }

                        if (!var9) {
                           var8.n5(com.aspose.slides.ms.System.d1.n5);
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                        var7.dispose();
                     }
                  }

                  if (var6 == 0) {
                     var3.addItem(var5);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            List$Enumerator var37 = var3.iterator();

            try {
               while (var37.hasNext()) {
                  IParagraph var38 = (IParagraph)var37.next();
                  var1.getParagraphs().remove(var38);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
                  var37.dispose();
               }
            }
         }
      }
   }

   private void n5(TextFrame var1, com.aspose.slides.internal.h6.n5 var2) {
      int var3 = this.n5(var2);
      TextFrame var4 = var1;
      float var5 = 0.0F;
      if ((var3 & 12) == 0) {
         if (var4 == null) {
            var4 = this.n5(this.n5().l6().l6(var2), 0.0F);
         }

         x3s var6 = new x3s((ParagraphCollection)var4.getParagraphs(), this.n5().k5(), this.n5().u3(), true);
         var6.n5(var2);
         if (m1j.h0(var2)) {
            IGenericEnumerator var7 = var4.getParagraphs().iterator();

            try {
               while (var7.hasNext()) {
                  IParagraph var8 = (IParagraph)var7.next();
                  var8.getParagraphFormat().setAlignment(1);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         } else if (m1j.c8(var2)) {
            IGenericEnumerator var35 = var4.getParagraphs().iterator();

            try {
               while (var35.hasNext()) {
                  IParagraph var37 = (IParagraph)var35.next();
                  IGenericEnumerator var9 = var37.getPortions().iterator();

                  try {
                     while (var9.hasNext()) {
                        IPortion var10 = (IPortion)var9.next();
                        var10.getPortionFormat().setFontBold((byte)1);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                        var9.dispose();
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
                  var35.dispose();
               }
            }
         }
      } else {
         List var34 = new List();
         IGenericEnumerator var36 = var2.y1().iterator();

         try {
            while (var36.hasNext()) {
               com.aspose.slides.internal.j3.z8 var38 = (com.aspose.slides.internal.j3.z8)var36.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var38, com.aspose.slides.internal.h6.n5.class)) {
                  com.aspose.slides.internal.h6.n5 var39 = (com.aspose.slides.internal.h6.n5)var38;
                  if ((this.n5(var39) & 12) == 0) {
                     if (m1j.t2(var39)) {
                        var34.addItem(var38);
                     }
                  } else {
                     this.n5(var1, var5, var2, var34);
                     if (!m1j.l6(var39) && !m1j.n5(var2)) {
                        this.n5(var1, var39);
                     }

                     var5 = (this.n5().l6().l6(var39).k5().l6() - this.n5().l6().l6(var2).k5().t2()) * 0.75F;
                  }
               } else {
                  var34.addItem(var38);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var36, IDisposable.class)) {
               var36.dispose();
            }
         }

         this.n5(var1, var5, var2, var34);
      }
   }

   private void n5(TextFrame var1, float var2, com.aspose.slides.internal.h6.n5 var3, IGenericList<com.aspose.slides.internal.j3.z8> var4) {
      if (var4.size() != 0) {
         if (var1 == null) {
            var1 = this.n5(this.n5().l6().l6(var3), var2);
         }

         x3s var5 = new x3s((ParagraphCollection)var1.getParagraphs(), this.n5().k5(), this.n5().u3(), true);
         var5.n5(var3, var4);
         var4.clear();
      }
   }

   private TextFrame n5(com.aspose.slides.internal.f4.l6 var1, float var2) {
      com.aspose.slides.internal.o9b.y1 var3 = var1.k5().y4();
      com.aspose.slides.internal.o9b.w1 var4 = this.n5(this.u3()[0]).u3();
      this.n5((AutoShape)this.n5().a6().addAutoShape(5, this.l6().l6(), var4.k5() + var2, var3.s7(), 0.0F));
      this.a6().getShapeStyle().setFillStyleIndex((short)0);
      this.a6().getShapeStyle().setLineStyleIndex(0);
      this.a6().getShapeStyle().setFontCollectionIndex((byte)0);
      this.a6().getShapeStyle().getFontColor().setSchemeColor(1);
      this.a6().addTextFrame("");
      TextFrame var5 = (TextFrame)this.a6().getTextFrame();
      var5.getTextFrameFormat().setAutofitType((byte)2);
      var5.getTextFrameFormat().setAnchoringType((byte)0);
      ((TextFrameFormat)var5.getTextFrameFormat()).n5(c0u.n5.l6());
      var5.getParagraphs().clear();
      return var5;
   }

   private int n5(com.aspose.slides.internal.h6.n5 var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      int var4 = this.n5().n5().tryGetValue(var1, var3) ? var3[0] : 0;
      var2 = var3[0];
      return var4;
   }

   private List<String> u9() {
      List var1 = new List();
      if (this.n5.isEmpty()) {
         return var1;
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      String var3 = this.n5.get_Item(0).j5();

      for (int var4 = 0; var4 < this.n5.size(); var4++) {
         com.aspose.slides.internal.e1.z1 var5 = com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var4), com.aspose.slides.internal.e1.z1.class);
         if (var5 != null) {
            if (com.aspose.slides.ms.System.d1.a6(var3, var5.j5())) {
               if (var2.l6() > 0 && !" ".equals(var5.x8()) && var2.l6(var2.l6() - 1) != ' ') {
                  var2.n5(" ");
               }

               var2.n5(var5.x8());
            } else {
               if (var2.l6() > 0) {
                  var1.addItem(var2.toString());
                  var2 = new com.aspose.slides.internal.l7h.a5();
               }

               var2.n5(var5.x8());
               var3 = var5.j5();
            }
         }
      }

      if (var2.l6() > 0) {
         var1.addItem(var2.toString());
      }

      return var1;
   }
}
