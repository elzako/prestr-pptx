package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.k4y.d2o;
import com.aspose.slides.internal.k4y.h5w;
import com.aspose.slides.internal.k4y.j6c;
import com.aspose.slides.internal.k4y.l6f;
import com.aspose.slides.internal.k4y.s0d;
import com.aspose.slides.internal.k4y.s5y;
import com.aspose.slides.internal.k4y.y2l;
import com.aspose.slides.internal.k4y.y6f;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class u1n {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "http://www.w3.org/2000/09/xmldsig#sha1",
      "http://www.w3.org/2001/04/xmlenc#sha256",
      "http://www.w3.org/2001/04/xmldsig-more#sha384",
      "http://www.w3.org/2001/04/xmlenc#sha512"
   );

   public static void n5(DigitalSignature var0, com.aspose.slides.internal.k4y.u3k var1, com.aspose.slides.internal.c8m.j8 var2) {
      if (l6(var0, var1, var2) && var2 != null) {
         XmlDocument var3 = new XmlDocument();
         var3.load(var2.h0());
         com.aspose.slides.ms.System.Xml.m8 var4 = (com.aspose.slides.ms.System.Xml.m8)var3.getElementsByTagName("Signature").k5(0);
         n5(var0, var4);
      }
   }

   public static boolean l6(DigitalSignature var0, com.aspose.slides.internal.k4y.u3k var1, com.aspose.slides.internal.c8m.j8 var2) {
      byte[] var3 = com.aspose.slides.ms.System.z3.s7(var1.a6().l6().n5());
      var0.n5(new com.aspose.slides.internal.f3c.h0(var3));
      var0.n5(false);

      for (com.aspose.slides.internal.k4y.g6v var7 : var1.u9()) {
         if (!"idPackageObject".equals(var7.u3())) {
            if ("idOfficeObject".equals(var7.u3())) {
               for (com.aspose.slides.internal.k4y.s7q var19 : var7.u9().l6()) {
                  if ("idOfficeV1Details".equals(var19.k5())) {
                     var0.setComments(var19.a6().n5());
                     break;
                  }
               }
            }
         } else {
            for (com.aspose.slides.internal.k4y.s7q var11 : var7.u9().l6()) {
               if ("idSignatureTime".equals(var11.k5())) {
                  com.aspose.slides.ms.System.j5 var12 = new com.aspose.slides.ms.System.j5();
                  com.aspose.slides.ms.System.j5[] var13 = new com.aspose.slides.ms.System.j5[]{var12};
                  boolean var14 = com.aspose.slides.ms.System.j5.n5(var11.u3().l6(), "yyyy-MM-ddTHH:mm:ssZ", com.aspose.slides.internal.x7n.u3.w1(), 64, var13);
                  var13[0].u3(var12);
                  if (var14) {
                     var0.n5(var12.m3());
                  } else {
                     var13[0] = var12;
                     boolean var15 = com.aspose.slides.ms.System.j5.n5(var11.u3().l6(), var11.u3().n5(), com.aspose.slides.internal.x7n.u3.w1(), 64, var13);
                     var13[0].u3(var12);
                     if (var15) {
                        var0.n5(var12.m3());
                     }
                  }
                  break;
               }
            }

            if (var2 != null && !n5(var7.a6().l6(), com.aspose.slides.internal.v6g.k5.n5(var2.t9(), com.aspose.slides.internal.c8m.d9.class))) {
               return false;
            }
         }
      }

      return true;
   }

   public static void n5(DigitalSignature var0, com.aspose.slides.ms.System.Xml.m8 var1) {
      com.aspose.slides.internal.j2p.s0 var2 = new com.aspose.slides.internal.j2p.s0();
      var2.n5(var1);
      if (var2.n5(var0.n5(), true)) {
         var0.n5(true);
      }
   }

   public static void n5(DigitalSignature var0, com.aspose.slides.internal.k4y.u3k var1, com.aspose.slides.internal.c8m.d9 var2) {
      var0.n5(com.aspose.slides.ms.System.j5.s7().m3());
      var1.n5("idPackageSignature");
      var1.k5().l6().n5("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
      var1.k5().k5().n5("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
      com.aspose.slides.internal.k4y.g6v var3 = var1.l6();
      var3.n5("idPackageObject");
      com.aspose.slides.internal.k4y.r8e var4 = var3.l6();
      com.aspose.slides.internal.k4y.s7q var5 = var4.n5();
      var5.n5("idSignatureTime");
      var5.l6("#idPackageSignature");
      var5.n5();
      var5.u3().n5("YYYY-MM-DDThh:mm:ssTZD");
      var5.u3().l6(var0.l6().k7().n5("yyyy-MM-ddTHH:mm:ssZ"));
      if (var2 != null) {
         n5(var2, var3.n5());
      }

      n5((IDigitalSignature)var0, var1);
      l6(var0, var1);
      com.aspose.slides.internal.j2p.s0 var12 = n5(var0, var1);
      com.aspose.slides.ms.System.Xml.m8 var13 = var12.c8();
      com.aspose.slides.ms.System.Xml.s2 var14 = new com.aspose.slides.ms.System.Xml.s2(var13.getOwnerDocument().getNameTable());
      var14.n5("dsig", "http://www.w3.org/2000/09/xmldsig#");
      String var6 = var13.selectSingleNode("dsig:SignedInfo//dsig:Reference[@URI='#idPackageObject']//dsig:DigestValue", var14).getInnerText();
      String var7 = var13.selectSingleNode("dsig:SignedInfo//dsig:Reference[@URI='#idOfficeObject']//dsig:DigestValue", var14).getInnerText();
      String var8 = var13.selectSingleNode("dsig:SignedInfo//dsig:Reference[@URI='#idSignedProperties']//dsig:DigestValue", var14).getInnerText();
      String var9 = var13.selectSingleNode("dsig:SignatureValue", var14).getInnerText();
      n5(var1, var6);
      l6(var1, var7);
      k5(var1, var8);
      var1.u3().n5(var9);
      com.aspose.slides.internal.k4y.r8u var10 = var1.n5();
      com.aspose.slides.internal.k4y.a3g var11 = var10.n5();
      var11.n5(com.aspose.slides.ms.System.z3.n5(var0.n5().z3()));
   }

   private static boolean n5(com.aspose.slides.internal.k4y.u7a[] var0, com.aspose.slides.internal.c8m.d9 var1) {
      for (com.aspose.slides.internal.k4y.u7a var5 : var0) {
         com.aspose.slides.internal.o8m.f2 var6 = n5(var5.u3().n5());
         String var7 = com.aspose.slides.ms.System.d1.l6(var5.l6(), 0, com.aspose.slides.ms.System.d1.c8(var5.l6(), "?"));
         com.aspose.slides.internal.c8m.j8 var8 = var1.u9(var7);
         byte[] var9 = var8.a6();
         if (var5.k5() != null) {
            boolean var10 = false;
            String var11 = "";

            for (com.aspose.slides.internal.k4y.v8r var15 : var5.k5().l6()) {
               if ("http://www.w3.org/TR/2001/REC-xml-c14n-20010315".equals(var15.l6())) {
                  var10 = true;
                  break;
               }
            }

            for (com.aspose.slides.internal.k4y.v8r var28 : var5.k5().l6()) {
               if ("http://schemas.openxmlformats.org/package/2006/RelationshipTransform".equals(var28.l6())) {
                  List var16 = new List();

                  for (com.aspose.slides.internal.k4y.v1o var20 : var28.k5()) {
                     var16.addItem(var20.n5());
                  }

                  var16.sort();
                  List$Enumerator var29 = var16.iterator();

                  try {
                     while (var29.hasNext()) {
                        String var30 = (String)var29.next();
                        com.aspose.slides.internal.c8m.r7 var31 = var8.e2().n5(var30);
                        if (var31 != null) {
                           String var32 = var31.h0() == 1 ? com.aspose.slides.internal.h3r.n5.l6(var31.n5()) : n5(var31.n5(), var8.l6());
                           var11 = com.aspose.slides.ms.System.d1.n5(
                              var11,
                              com.aspose.slides.ms.System.d1.n5(new String[]{
                                 "<Relationship Id=\"",
                                 var31.a6(),
                                 "\" ",
                                 "Target=\"",
                                 var32,
                                 "\" ",
                                 var10
                                    ? com.aspose.slides.ms.System.d1.n5(new String[]{
                                       "TargetMode=\"",
                                       var31.h0() != -1 ? com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.c8m.n9.class, var31.h0()) : "Internal",
                                       "\" "
                                    })
                                    : "",
                                 "Type=\"",
                                 var31.u9(),
                                 "\"></Relationship>"
                              })
                           );
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
                        var29.dispose();
                     }
                  }

                  var11 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     "<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">", var11, "</Relationships>"
                  });
                  var9 = com.aspose.slides.internal.l7h.u6.z3().u3(var11);
                  break;
               }
            }
         }

         if (var8 == null || !com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.z3.n5(var6.l6(var9)), var5.a6())) {
            return false;
         }
      }

      return true;
   }

   private static String n5(String var0, String var1) {
      int var2 = 0;

      while (var2 < var0.length() && var2 < var1.length() && var0.charAt(var2) == var1.charAt(var2)) {
         var2++;
      }

      int var3 = com.aspose.slides.ms.System.d1.u3(com.aspose.slides.ms.System.d1.l6(var0, 0, var2), "/");
      String var4 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var1, 0, var3 + 1), "_rels/", "");
      String var5 = com.aspose.slides.ms.System.d1.n5(var0, 0, com.aspose.slides.ms.System.d1.u3(com.aspose.slides.ms.System.d1.l6(var0, 0, var2), "/") + 1);

      for (int var6 = com.aspose.slides.ms.System.d1.c8(var4, "/"); var6 != -1; var6 = com.aspose.slides.ms.System.d1.n5(var4, "/", var6 + 1)) {
         var5 = com.aspose.slides.ms.System.d1.n5(new String[]{"../", var5});
      }

      return var5;
   }

   private static com.aspose.slides.internal.j2p.s0 n5(DigitalSignature var0, com.aspose.slides.internal.k4y.u3k var1) {
      XmlDocument var2 = new XmlDocument();
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.n8e.u4 var4 = new com.aspose.slides.internal.n8e.u4(var3, com.aspose.slides.internal.l7h.u6.z3());
         var1.n5("", var4, "Signature");
         var4.u9();
         var3.setPosition(0L);
         var2.load(var3);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      com.aspose.slides.ms.System.Xml.l0 var13 = var2.getDocumentElement().k5("SignedInfo").k5(0);
      com.aspose.slides.ms.System.Xml.l0 var5 = var2.getDocumentElement().k5("SignatureValue").k5(0);
      com.aspose.slides.ms.System.Xml.l0 var6 = var2.getDocumentElement().k5("KeyInfo").k5(0);
      if (var13 != null) {
         var2.getDocumentElement().removeChild(var13);
      }

      if (var5 != null) {
         var2.getDocumentElement().removeChild(var5);
      }

      if (var6 != null) {
         var2.getDocumentElement().removeChild(var6);
      }

      com.aspose.slides.internal.j2p.s0 var7 = new com.aspose.slides.internal.j2p.s0(var2);
      var7.n5(var0.n5().t4());
      com.aspose.slides.internal.j2p.e9 var8 = new com.aspose.slides.internal.j2p.e9();
      var8.n5("#idPackageObject");
      var8.l6("http://www.w3.org/2000/09/xmldsig#Object");
      var8.k5("http://www.w3.org/2000/09/xmldsig#sha1");
      var7.n5(var8);
      com.aspose.slides.internal.j2p.e9 var9 = new com.aspose.slides.internal.j2p.e9();
      var9.n5("#idOfficeObject");
      var9.l6("http://www.w3.org/2000/09/xmldsig#Object");
      var9.k5("http://www.w3.org/2000/09/xmldsig#sha1");
      var7.n5(var9);
      com.aspose.slides.internal.j2p.e9 var10 = new com.aspose.slides.internal.j2p.e9();
      var10.n5("#idSignedProperties");
      var10.l6("http://uri.etsi.org/01903#SignedProperties");
      var10.k5("http://www.w3.org/2000/09/xmldsig#sha1");
      var10.a6().n5(new com.aspose.slides.internal.j2p.p6());
      var7.n5(var10);
      var7.t2();
      return var7;
   }

   private static void n5(com.aspose.slides.internal.k4y.u3k var0, String var1) {
      com.aspose.slides.internal.k4y.u7a var2 = var0.k5().n5();
      var2.l6("#idPackageObject");
      var2.n5("http://www.w3.org/2000/09/xmldsig#Object");
      var2.u3().n5("http://www.w3.org/2000/09/xmldsig#sha1");
      var2.k5(var1);
   }

   private static void n5(IDigitalSignature var0, com.aspose.slides.internal.k4y.u3k var1) {
      com.aspose.slides.internal.k4y.g6v var2 = var1.l6();
      var2.n5("idOfficeObject");
      com.aspose.slides.internal.k4y.r8e var3 = var2.l6();
      com.aspose.slides.internal.k4y.s7q var4 = var3.n5();
      var4.n5("idOfficeV1Details");
      var4.l6("#idPackageSignature");
      com.aspose.slides.internal.k4y.l6w var5 = var4.l6();
      var5.n5("http://schemas.microsoft.com/office/2006/digsig");
      var5.a6(var0.getComments());
      var5.m3("http://www.w3.org/2000/09/xmldsig#sha1");
      var5.l6("");
      var5.k5("");
      var5.u3("");
      var5.u9("5.1");
      var5.h0("12.0");
      var5.c8("12.0");
      var5.t2("1");
      var5.s7("1280");
      var5.x8("800");
      var5.n3("32");
      var5.y4("{00000000-0000-0000-0000-000000000000}");
      var5.z3("");
      var5.m1("9");
      var5.k7("1");
   }

   private static void l6(com.aspose.slides.internal.k4y.u3k var0, String var1) {
      com.aspose.slides.internal.k4y.u7a var2 = var0.k5().n5();
      var2.l6("#idOfficeObject");
      var2.n5("http://www.w3.org/2000/09/xmldsig#Object");
      var2.u3().n5("http://www.w3.org/2000/09/xmldsig#sha1");
      var2.k5(var1);
   }

   private static void l6(IDigitalSignature var0, com.aspose.slides.internal.k4y.u3k var1) {
      com.aspose.slides.internal.k4y.g6v var2 = var1.l6();
      s5y var3 = var2.k5();
      var3.n5("#idPackageSignature");
      l6f var4 = var3.n5();
      var4.n5("idSignedProperties");
      j6c var5 = var4.n5();
      var5.n5(((DigitalSignature)var0).l6().k7().n5("yyyy-MM-ddTHH:mm:ssZ"));
      y6f var6 = var5.n5();
      d2o var7 = var6.n5();
      var7.n5().n5().n5("http://www.w3.org/2000/09/xmldsig#sha1");
      var7.n5().n5(com.aspose.slides.ms.System.z3.n5(n5(var7.n5().n5().n5()).l6(((DigitalSignature)var0).n5().z3())));
      var7.l6().n5(((DigitalSignature)var0).n5().e2().k5());
      var7.l6().l6(l6(((DigitalSignature)var0).n5().m1()));
      y2l var8 = var5.l6();
      var8.n5("");
      s0d var9 = var4.l6();
      h5w var10 = var9.n5();
      var10.n5().n5("http://uri.etsi.org/01903/v1.2.2#ProofOfOrigin");
      var10.n5().l6("");
      var10.n5("");
   }

   private static void k5(com.aspose.slides.internal.k4y.u3k var0, String var1) {
      com.aspose.slides.internal.k4y.u7a var2 = var0.k5().n5();
      var2.l6("#idSignedProperties");
      var2.n5("http://uri.etsi.org/01903#SignedProperties");
      var2.u3().n5("http://www.w3.org/2000/09/xmldsig#sha1");
      var2.k5(var1);
      com.aspose.slides.internal.k4y.n5v var3 = var2.n5();
      com.aspose.slides.internal.k4y.v8r var4 = var3.n5();
      var4.n5("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
   }

   private static void n5(com.aspose.slides.internal.c8m.d9 var0, com.aspose.slides.internal.k4y.j2x var1) {
      for (com.aspose.slides.internal.c8m.j8 var5 : var0.t2()) {
         if (!com.aspose.slides.ms.System.d1.l6(var5.l6(), "/_xmlsignatures")
            && !com.aspose.slides.ms.System.d1.l6(var5.l6(), "/docProps")
            && (!com.aspose.slides.ms.System.d1.l6(var5.l6(), "/ppt/_rels/") || "/ppt/_rels/presentation.xml.rels".equals(var5.l6()))
            && (!com.aspose.slides.internal.v6g.k5.l6(var5.y4(), com.aspose.slides.internal.c8m.h1.class) || var5.e2().n5() != 0)) {
            com.aspose.slides.internal.k4y.u7a var6 = var1.n5();
            String var7 = var5.l6();
            String var8 = var5.y4().n5();
            var6.l6(com.aspose.slides.ms.System.d1.n5(new String[]{var7, "?ContentType=", var8}));
            var6.u3().n5("http://www.w3.org/2000/09/xmldsig#sha1");
            byte[] var9 = var5.a6();
            if (com.aspose.slides.internal.v6g.k5.l6(var5.y4(), com.aspose.slides.internal.c8m.h1.class)) {
               com.aspose.slides.internal.k4y.n5v var10 = var6.n5();
               com.aspose.slides.internal.k4y.v8r var11 = var10.n5();
               var11.n5("http://schemas.openxmlformats.org/package/2006/RelationshipTransform");
               String var12 = "";
               List var13 = new List();
               IGenericEnumerator var14 = var5.e2().iterator();

               try {
                  while (var14.hasNext()) {
                     com.aspose.slides.internal.c8m.r7 var15 = (com.aspose.slides.internal.c8m.r7)var14.next();
                     if (!"/_rels/.rels".equals(var5.l6()) || "/ppt/presentation.xml".equals(var15.n5())) {
                        com.aspose.slides.internal.k4y.v1o var16 = var11.n5();
                        var16.n5(var15.a6());
                        var13.addItem(var15.a6());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                     var14.dispose();
                  }
               }

               var13.sort();
               List$Enumerator var28 = var13.iterator();

               try {
                  while (var28.hasNext()) {
                     String var29 = (String)var28.next();
                     com.aspose.slides.internal.c8m.r7 var17 = var5.e2().n5(var29);
                     if (var17 != null) {
                        String var18 = var17.h0() == 1 ? com.aspose.slides.internal.h3r.n5.l6(var17.n5()) : n5(var17.n5(), var5.l6());
                        var12 = com.aspose.slides.ms.System.d1.n5(
                           var12,
                           com.aspose.slides.ms.System.d1.n5(new String[]{
                              "<Relationship Id=\"",
                              var17.a6(),
                              "\" ",
                              "Target=\"",
                              var18,
                              "\" ",
                              "TargetMode=\"",
                              var17.h0() != -1 ? com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.c8m.n9.class, var17.h0()) : "Internal",
                              "\" ",
                              "Type=\"",
                              var17.u9(),
                              "\"></Relationship>"
                           })
                        );
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
                     var28.dispose();
                  }
               }

               var12 = com.aspose.slides.ms.System.d1.n5(new String[]{
                  "<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">", var12, "</Relationships>"
               });
               var9 = com.aspose.slides.internal.l7h.u6.z3().u3(var12);
               com.aspose.slides.internal.k4y.v8r var30 = var10.n5();
               var30.n5("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
            }

            com.aspose.slides.internal.o8m.f2 var26 = n5(var6.u3().n5());
            var6.k5(com.aspose.slides.ms.System.z3.n5(var26.l6(var9)));
         }
      }
   }

   private static com.aspose.slides.internal.o8m.f2 n5(String var0) {
      switch (n5.n5(var0)) {
         case 0:
            return com.aspose.slides.internal.o8m.s4.a6();
         case 1:
            return com.aspose.slides.internal.o8m.l4.a6();
         case 2:
            return com.aspose.slides.internal.o8m.a7.a6();
         case 3:
            return com.aspose.slides.internal.o8m.r1.a6();
         default:
            throw new NotImplementedException("Unknown hashing algorithm");
      }
   }

   private static String l6(String var0) {
      List var1 = new List();
      var1.addItem(0);

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         int var4 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.ms.System.t9.q0(var3), 16);

         for (int var5 = 0; var5 < var1.size(); var5++) {
            int var6 = (Integer)var1.get_Item(var5) * 16 + var4;
            var1.set_Item(var5, var6 % 10);
            var4 = var6 / 10;
         }

         while (var4 > 0) {
            var1.addItem(var4 % 10);
            var4 /= 10;
         }
      }

      var1.reverse();
      String var10 = "";
      List$Enumerator var11 = var1.iterator();

      try {
         while (var11.hasNext()) {
            int var12 = com.aspose.slides.internal.v6g.k5.u3(var11.next(), int.class);
            var10 = com.aspose.slides.ms.System.d1.n5(var10, com.aspose.slides.ms.System.a3.l6(var12));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }

      return var10;
   }
}
