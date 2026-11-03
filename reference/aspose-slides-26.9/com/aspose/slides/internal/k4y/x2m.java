package com.aspose.slides.internal.k4y;

import com.aspose.slides.ms.System.Xml.XmlDocument;

public class x2m {
   public static q3j n5(x8 var0) {
      if (var0 != null) {
         for (d3 var4 : var0.n5()) {
            com.aspose.slides.ms.System.Xml.u8 var5 = var4.l6().getDocumentElement().getAttributes().n5("uri");
            if (var5 != null && "{E76CE94A-603C-4142-B9EB-6D1370010A27}".equals(var5.getValue())) {
               return n5(var4.l6());
            }
         }
      }

      return null;
   }

   public static a8y l6(x8 var0) {
      if (var0 != null) {
         for (d3 var4 : var0.n5()) {
            com.aspose.slides.ms.System.Xml.u8 var5 = var4.l6().getDocumentElement().getAttributes().n5("uri");
            if (var5 != null && "{D31A062A-798A-4329-ABDD-BBA856620510}".equals(var5.getValue())) {
               return l6(var4.l6());
            }
         }
      }

      return null;
   }

   public static e7j k5(x8 var0) {
      if (var0 != null) {
         for (d3 var4 : var0.n5()) {
            com.aspose.slides.ms.System.Xml.u8 var5 = var4.l6().getDocumentElement().getAttributes().n5("uri");
            if (var5 != null && "{FD5EFAAD-0ECE-453E-9831-46B23BE46B34}".equals(var5.getValue())) {
               return k5(var4.l6());
            }
         }
      }

      return null;
   }

   public static t1f u3(x8 var0) {
      if (var0 != null) {
         for (d3 var4 : var0.n5()) {
            com.aspose.slides.ms.System.Xml.u8 var5 = var4.l6().getDocumentElement().getAttributes().n5("uri");
            if (var5 != null && "{1BD7E111-0CB8-44D6-8891-C1BB2F81B7CC}".equals(var5.getValue())) {
               return u3(var4.l6());
            }
         }
      }

      return null;
   }

   private static q3j n5(XmlDocument var0) {
      try {
         if (var0 != null) {
            com.aspose.slides.internal.z0k.w1 var1 = new com.aspose.slides.internal.z0k.w1(var0.getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var2 = new com.aspose.slides.ms.System.Xml.p5(var1);

               try {
                  var2.n5((com.aspose.slides.ms.System.Xml.o8)null);

                  while (!var2.j5()) {
                     var2.u9();
                     if ("discardImageEditData".equals(var2.n3())) {
                        return new q3j(var2);
                     }
                  }
               } finally {
                  if (var2 != null) {
                     var2.dispose();
                  }
               }
            } finally {
               if (var1 != null) {
                  var1.dispose();
               }
            }
         }
      } catch (RuntimeException var14) {
         com.aspose.slides.internal.n8e.v4.n5(var14);
      }

      return null;
   }

   private static a8y l6(XmlDocument var0) {
      try {
         if (var0 != null) {
            com.aspose.slides.internal.z0k.w1 var1 = new com.aspose.slides.internal.z0k.w1(var0.getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var2 = new com.aspose.slides.ms.System.Xml.p5(var1);

               try {
                  var2.n5((com.aspose.slides.ms.System.Xml.o8)null);

                  while (!var2.j5()) {
                     var2.u9();
                     if ("defaultImageDpi".equals(var2.n3())) {
                        return new a8y(var2);
                     }
                  }
               } finally {
                  if (var2 != null) {
                     var2.dispose();
                  }
               }
            } finally {
               if (var1 != null) {
                  var1.dispose();
               }
            }
         }
      } catch (RuntimeException var14) {
         com.aspose.slides.internal.n8e.v4.n5(var14);
      }

      return null;
   }

   private static e7j k5(XmlDocument var0) {
      try {
         if (var0 != null) {
            com.aspose.slides.internal.z0k.w1 var1 = new com.aspose.slides.internal.z0k.w1(var0.getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var2 = new com.aspose.slides.ms.System.Xml.p5(var1);

               try {
                  var2.n5((com.aspose.slides.ms.System.Xml.o8)null);

                  while (!var2.j5()) {
                     var2.u9();
                     if ("chartTrackingRefBased".equals(var2.n3())) {
                        return new e7j(var2);
                     }
                  }
               } finally {
                  if (var2 != null) {
                     var2.dispose();
                  }
               }
            } finally {
               if (var1 != null) {
                  var1.dispose();
               }
            }
         }
      } catch (RuntimeException var14) {
         com.aspose.slides.internal.n8e.v4.n5(var14);
      }

      return null;
   }

   private static t1f u3(XmlDocument var0) {
      try {
         if (var0 != null) {
            com.aspose.slides.internal.z0k.w1 var1 = new com.aspose.slides.internal.z0k.w1(var0.getDocumentElement().getOuterXml());

            try {
               com.aspose.slides.ms.System.Xml.p5 var2 = new com.aspose.slides.ms.System.Xml.p5(var1);

               try {
                  var2.n5((com.aspose.slides.ms.System.Xml.o8)null);

                  while (!var2.j5()) {
                     var2.u9();
                     if ("readonlyRecommended".equals(var2.n3())) {
                        return new t1f(var2);
                     }
                  }
               } finally {
                  if (var2 != null) {
                     var2.dispose();
                  }
               }
            } finally {
               if (var1 != null) {
                  var1.dispose();
               }
            }
         }
      } catch (RuntimeException var14) {
         com.aspose.slides.internal.n8e.v4.n5(var14);
      }

      return null;
   }

   public static void n5(x8 var0, boolean var1) {
      b2l var2 = n5(var0, "{E76CE94A-603C-4142-B9EB-6D1370010A27}");

      try {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.ms.System.Xml.k3 var4 = new com.aspose.slides.ms.System.Xml.k3(var3, com.aspose.slides.internal.l7h.j5.z3());

            try {
               var4.n5("p", "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
               var4.u3("uri", "{E76CE94A-603C-4142-B9EB-6D1370010A27}");
               var4.n5("p14", "discardImageEditData", "http://schemas.microsoft.com/office/powerpoint/2010/main");
               var4.u3("val", var1 ? "1" : "0");
               var4.s7();
               var4.s7();
               var4.u9();
               var3.setPosition(0L);
               if (var2.l6() == null) {
                  var2.n5(new XmlDocument());
                  var2.l6().setXmlResolver(null);
               }

               var2.l6().load(var3);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } catch (RuntimeException var15) {
         com.aspose.slides.internal.n8e.v4.n5(var15);
      }
   }

   public static void n5(x8 var0, long var1) {
      b2l var3 = n5(var0, "{D31A062A-798A-4329-ABDD-BBA856620510}");

      try {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.ms.System.Xml.k3 var5 = new com.aspose.slides.ms.System.Xml.k3(var4, com.aspose.slides.internal.l7h.j5.z3());

            try {
               var5.n5("p", "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
               var5.u3("uri", "{D31A062A-798A-4329-ABDD-BBA856620510}");
               var5.n5("p14", "defaultImageDpi", "http://schemas.microsoft.com/office/powerpoint/2010/main");
               var5.u3("val", com.aspose.slides.ms.System.l4.l6(var1));
               var5.s7();
               var5.s7();
               var5.u9();
               var4.setPosition(0L);
               if (var3.l6() == null) {
                  var3.n5(new XmlDocument());
                  var3.l6().setXmlResolver(null);
               }

               var3.l6().load(var4);
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
      } catch (RuntimeException var16) {
         com.aspose.slides.internal.n8e.v4.n5(var16);
      }
   }

   public static void l6(x8 var0, boolean var1) {
      b2l var2 = n5(var0, "{FD5EFAAD-0ECE-453E-9831-46B23BE46B34}");

      try {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.ms.System.Xml.k3 var4 = new com.aspose.slides.ms.System.Xml.k3(var3, com.aspose.slides.internal.l7h.j5.z3());

            try {
               var4.n5("p", "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
               var4.u3("uri", "{FD5EFAAD-0ECE-453E-9831-46B23BE46B34}");
               var4.n5("p15", "chartTrackingRefBased", "http://schemas.microsoft.com/office/powerpoint/2012/main");
               var4.u3("val", var1 ? "1" : "0");
               var4.s7();
               var4.s7();
               var4.u9();
               var3.setPosition(0L);
               if (var2.l6() == null) {
                  var2.n5(new XmlDocument());
                  var2.l6().setXmlResolver(null);
               }

               var2.l6().load(var3);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } catch (RuntimeException var15) {
         com.aspose.slides.internal.n8e.v4.n5(var15);
      }
   }

   public static void k5(x8 var0, boolean var1) {
      b2l var2 = n5(var0, "{1BD7E111-0CB8-44D6-8891-C1BB2F81B7CC}");

      try {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.ms.System.Xml.k3 var4 = new com.aspose.slides.ms.System.Xml.k3(var3, com.aspose.slides.internal.l7h.j5.z3());

            try {
               var4.n5("p", "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
               var4.u3("uri", "{1BD7E111-0CB8-44D6-8891-C1BB2F81B7CC}");
               var4.n5("p1710", "readonlyRecommended", "http://schemas.microsoft.com/office/powerpoint/2017/10/main");
               var4.u3("val", var1 ? "1" : "0");
               var4.s7();
               var4.s7();
               var4.u9();
               var3.setPosition(0L);
               if (var2.l6() == null) {
                  var2.n5(new XmlDocument());
                  var2.l6().setXmlResolver(null);
               }

               var2.l6().load(var3);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } catch (RuntimeException var15) {
         com.aspose.slides.internal.n8e.v4.n5(var15);
      }
   }

   private static b2l n5(x8 var0, String var1) {
      b2l var2 = l6(var0, var1);
      if (var2 == null) {
         var2 = (b2l)var0.l6();
      }

      return var2;
   }

   private static b2l l6(x8 var0, String var1) {
      if (var0 == null) {
         return null;
      }

      for (d3 var5 : var0.n5()) {
         com.aspose.slides.ms.System.Xml.u8 var6 = var5.l6().getDocumentElement().getAttributes().n5("uri");
         if (var6 != null && com.aspose.slides.ms.System.d1.a6(var6.getValue(), var1)) {
            return (b2l)var5;
         }
      }

      return null;
   }
}
