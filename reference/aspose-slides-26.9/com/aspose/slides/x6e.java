package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Date;

class x6e extends l5x {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "generator",
      "title",
      "description",
      "subject",
      "keyword",
      "initial-creator",
      "creator",
      "printed-by",
      "creation-date",
      "date",
      "print-date",
      "template",
      "auto-reload",
      "hyperlink-behaviour",
      "language",
      "editing-cycles",
      "editing-duration",
      "document-statistic",
      "user-defined"
   );

   final void n5(IDocumentProperties var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "document-meta".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.a7z var2 = new com.aspose.slides.internal.k4y.a7z(this.s7());
            List$Enumerator var3 = var2.l6().n5().iterator();

            try {
               while (var3.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
                  switch (n5.n5(var4.n5())) {
                     case 0:
                        var1.setNameOfApplication((String)var4.k5());
                        break;
                     case 1:
                        var1.setTitle((String)var4.k5());
                        break;
                     case 2:
                        var1.setComments((String)var4.k5());
                        break;
                     case 3:
                        var1.setSubject((String)var4.k5());
                        break;
                     case 4:
                        var1.setKeywords((String)var4.k5());
                        break;
                     case 5:
                        var1.setAuthor((String)var4.k5());
                        break;
                     case 6:
                        var1.setLastSavedBy((String)var4.k5());
                        break;
                     case 7:
                        String var5 = (String)var4.k5();
                        break;
                     case 8:
                        ((DocumentProperties)var1).n5(com.aspose.slides.internal.v6g.k5.u3(var4.k5(), com.aspose.slides.ms.System.j5.class).m3());
                        break;
                     case 9:
                        ((DocumentProperties)var1).u3(com.aspose.slides.ms.System.j5.n5((String)var4.k5(), com.aspose.slides.internal.x7n.l6.u3(), 16).m3());
                        break;
                     case 10:
                        ((DocumentProperties)var1).k5(com.aspose.slides.internal.v6g.k5.u3(var4.k5(), com.aspose.slides.ms.System.j5.class).m3());
                        break;
                     case 11:
                        com.aspose.slides.internal.k4y.o1l var6 = (com.aspose.slides.internal.k4y.o1l)var4.k5();
                        break;
                     case 12:
                        com.aspose.slides.internal.k4y.l1a var7 = (com.aspose.slides.internal.k4y.l1a)var4.k5();
                        break;
                     case 13:
                        com.aspose.slides.internal.k4y.a3a var8 = (com.aspose.slides.internal.k4y.a3a)var4.k5();
                        break;
                     case 14:
                        String var9 = (String)var4.k5();
                        break;
                     case 15:
                        var1.setRevisionNumber(((Long)var4.k5()).intValue());
                        break;
                     case 16:
                        ((DocumentProperties)var1).n5(com.aspose.slides.internal.v6g.k5.u3(var4.k5(), com.aspose.slides.ms.System.s4.class).n3());
                        break;
                     case 17:
                        com.aspose.slides.internal.k4y.x2u var10 = (com.aspose.slides.internal.k4y.x2u)var4.k5();
                        break;
                     case 18:
                        com.aspose.slides.internal.k4y.e5e var11 = (com.aspose.slides.internal.k4y.e5e)var4.k5();
                        if (!com.aspose.slides.ms.System.d1.n5(var11.n5())) {
                           Object var12 = null;

                           try {
                              switch (var11.l6()) {
                                 case 1:
                                    int var13 = 0;
                                    int[] var14 = new int[]{0};
                                    boolean var15 = com.aspose.slides.ms.System.a3.n5(var11.k5(), var14);
                                    var13 = var14[0];
                                    if (var15) {
                                       var12 = var13;
                                    } else {
                                       var12 = com.aspose.slides.ms.System.n1.n5(var11.k5(), com.aspose.slides.internal.x7n.l6.k5());
                                    }
                                    break;
                                 case 2:
                                    var12 = com.aspose.slides.ms.System.j5.n5(var11.k5(), com.aspose.slides.internal.x7n.l6.u3(), 16).m3();
                                    break;
                                 case 3:
                                    var12 = t2f.q0(var11.k5()).n3();
                                    break;
                                 case 4:
                                    var12 = com.aspose.slides.ms.System.n3.n5(var11.k5());
                                    break;
                                 default:
                                    var12 = var11.k5();
                              }
                           } catch (RuntimeException var19) {
                              com.aspose.slides.internal.n8e.v4.n5(var19);
                              var12 = var11.k5();
                           }

                           if (var12 != null) {
                              ((DocumentProperties)var1).n5(var11.n5(), var12);
                           }
                        }
                        break;
                     default:
                        throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var4.n5(), "\""}));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      }

      this.n3();
   }

   final void l6(IDocumentProperties var1) {
      this.y4();
      com.aspose.slides.internal.k4y.a7z var2 = new com.aspose.slides.internal.k4y.a7z();
      var2.n5();
      if (!com.aspose.slides.ms.System.d1.n5("Aspose.Slides for Java 26.9")) {
         var2.l6().n5(new com.aspose.slides.internal.k4y.g7("generator", "Aspose.Slides for Java 26.9"));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.getTitle())) {
         var2.l6().n5(new com.aspose.slides.internal.k4y.g7("title", var1.getTitle()));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.getComments())) {
         var2.l6().n5(new com.aspose.slides.internal.k4y.g7("description", var1.getComments()));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.getSubject())) {
         var2.l6().n5(new com.aspose.slides.internal.k4y.g7("subject", var1.getSubject()));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.getKeywords())) {
         var2.l6().n5(new com.aspose.slides.internal.k4y.g7("keyword", var1.getKeywords()));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.getAuthor())) {
         var2.l6().n5(new com.aspose.slides.internal.k4y.g7("initial-creator", var1.getAuthor()));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.getLastSavedBy())) {
         var2.l6().n5(new com.aspose.slides.internal.k4y.g7("creator", var1.getLastSavedBy()));
      }

      var2.l6().n5(new com.aspose.slides.internal.k4y.g7("creation-date", ((DocumentProperties)var1).l6().m3()));
      var2.l6()
         .n5(
            new com.aspose.slides.internal.k4y.g7(
               "date", com.aspose.slides.ms.System.Xml.f4.n5(((DocumentProperties)var1).k5().m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK")
            )
         );
      var2.l6().n5(new com.aspose.slides.internal.k4y.g7("print-date", ((DocumentProperties)var1).u3().m3()));
      var2.l6().n5(new com.aspose.slides.internal.k4y.g7("editing-cycles", var1.getRevisionNumber() & 4294967295L));
      var2.l6().n5(new com.aspose.slides.internal.k4y.g7("editing-duration", ((DocumentProperties)var1).n5().n3()));
      if (var1.getCountOfCustomProperties() > 0) {
         for (int var3 = 0; var3 < var1.getCountOfCustomProperties(); var3++) {
            String var4 = var1.getCustomPropertyName(var3);
            Object var5 = ((DocumentProperties)var1).l6(var4);
            if (!com.aspose.slides.ms.System.d1.n5(var4) && var5 != null) {
               com.aspose.slides.internal.k4y.e5e var6 = new com.aspose.slides.internal.k4y.e5e();
               var6.n5(var4);
               if (com.aspose.slides.internal.v6g.k5.l6(var5, Boolean.class)) {
                  var6.n5(4);
                  var6.l6(com.aspose.slides.ms.System.d1.u9(var5.toString()));
               } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.ms.System.j5.class)) {
                  var6.n5(2);
                  var6.l6(com.aspose.slides.internal.v6g.k5.u3(var5, com.aspose.slides.ms.System.j5.class).n5("yyyy-MM-ddTHH:mm:ss"));
               } else if (com.aspose.slides.internal.v6g.k5.l6(var5, Date.class)) {
                  var6.n5(2);
                  var6.l6(com.aspose.slides.ms.System.j5.n5(com.aspose.slides.internal.v6g.k5.u3(var5, Date.class)).n5("yyyy-MM-ddTHH:mm:ss"));
               } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.ms.System.s4.class)) {
                  var6.n5(3);
                  var6.l6(t2f.n5(com.aspose.slides.internal.v6g.k5.u3(var5, com.aspose.slides.ms.System.s4.class).n3()));
               } else {
                  var6.l6(var5.toString());
                  if (com.aspose.slides.internal.v6g.k5.l6(var5, Integer.class)
                     || com.aspose.slides.internal.v6g.k5.l6(var5, Float.class)
                     || com.aspose.slides.internal.v6g.k5.l6(var5, Double.class)) {
                     var6.n5(1);
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var5, String.class)) {
                     var6.n5(5);
                  }
               }

               var2.l6().n5(new com.aspose.slides.internal.k4y.g7("user-defined", var6));
            }
         }
      }

      var2.n5(null, this.x8(), "document-meta");
      this.e2();
   }

   final void k5(IDocumentProperties var1) {
      this.u3().n3();
      this.l6(var1);
   }

   public x6e(com.aspose.slides.internal.c8m.z5 var1, com.aspose.slides.internal.c8m.x8 var2) {
      super(var1, var2);
   }

   public x6e(com.aspose.slides.internal.c8m.z5 var1, OdpSerializationContext var2) {
      super(var1, var2);
   }
}
