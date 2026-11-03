package com.aspose.slides.internal.n8e;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class f2 {
   static f2 n5 = new f2();
   private String l6;
   private String k5;
   private int u3 = 4096;
   private String a6;
   private String u9;
   private String h0;
   private String c8 = h6.n5(s0.u3);
   private final long t2 = 86400000L;
   private final int s7 = 10;
   private final long x8 = 86400000L;

   public static f2 n5() {
      return n5;
   }

   public f2() {
      if (i1.n5) {
         this.a6 = h6.n5(s0.a0);
         this.u9 = h6.n5(s0.d2);
         this.h0 = h6.n5(s0.d5);
      } else {
         this.a6 = h6.n5(s0.s3);
         this.u9 = h6.n5(s0.p8);
         this.h0 = h6.n5(s0.f2);
      }

      if (i1.l6) {
         this.c8 = h6.n5(s0.i1);
      }
   }

   public boolean n5(String var1, String var2) {
      boolean var3 = false;
      boolean var4 = false;

      try {
         if (var1 != null && var2 != null && var1.length() != 0 && var2.length() != 0) {
            List var5 = this.l6(var1, var2);
            if (var5 != null && var5.size() == 0) {
            }

            boolean var21 = this.n5(var5);
            if (var21) {
               this.l6 = var1;
               this.k5 = var2;
               this.u3 = 256;
               n5 = this;
            }

            var3 = var21;
            var4 = true;
         }
      } catch (s3 var19) {
         if (var19.n5() == 500) {
            boolean var6 = false;
            e5.n5().a6.lock();

            try {
               if (e5.n5().u3 == -1L) {
                  e5.n5().u3 = System.currentTimeMillis();
               }

               if (System.currentTimeMillis() - e5.n5().u3 > 86400000L) {
                  var6 = true;
               }
            } finally {
               e5.n5().a6.unlock();
            }

            if (!var6) {
               this.l6 = var1;
               this.k5 = var2;
               this.u3 = 256;
               n5 = this;
               var3 = true;
            }
         }
      } catch (Exception var20) {
      }

      if (var4) {
         e5.n5().a6.lock();

         try {
            e5.n5().u3 = -1L;
         } finally {
            e5.n5().a6.unlock();
         }
      }

      return var3;
   }

   private boolean n5(List<y8> var1) {
      boolean var2 = false;
      if (var1 != null && var1.size() > 0) {
         String var3 = ((y8)var1.get(0)).l6();
         if (var3 != null) {
            var3 = var3.toLowerCase();
            if (var3.contains("active") || var3.contains("trialing") || var3.contains("billnotpaidontimeretrying")) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   private List<y8> l6(String var1, String var2) {
      b3 var3 = new b3(this.a6, this.u9);
      p8 var4 = p8.n5(var3, this.h0, false);
      String var5 = "/subscriptions/site-{siteSubdomain}?status={status}&pageNumber={pageNumber}&pageSize={pageSize}&publicApiKey={publicApiKey}&privateApiKey={privateApiKey}";
      var5 = var5.replace("{format}", "xml").replaceAll("\\*", "");
      String var6 = "GET";
      HashMap var7 = new HashMap();
      HashMap var8 = new HashMap();
      String var9 = this.c8;
      String var10 = var1.toLowerCase();
      if (var10.startsWith("asposeforcloud")) {
         var9 = "asposeforcloud";
      } else if (var10.startsWith("groupdocsforcloud2")) {
         var9 = "groupdocsforcloud2";
      } else if (var10.startsWith("conholdateforcloud")) {
         var9 = "conholdateforcloud";
      } else if (var10.startsWith("conholdate")) {
         var9 = "conholdate";
      }

      var5 = var5.replace("{siteSubdomain}", p8.l6(var9));
      var5 = var5.replace("{publicApiKey}", p8.l6(var1));
      var5 = var5.replace("{privateApiKey}", p8.l6(var2));
      var5 = var5.replaceAll("\\{\\w*\\}", "");
      String var11 = var4.n5(var5, var6, var7, null, var8);
      if (var11 != null && var11.length() != 0) {
         try {
            StringReader var12 = new StringReader(var11);
            InputSource var28 = new InputSource(var12);
            DocumentBuilderFactory var14 = DocumentBuilderFactory.newInstance();
            var14.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            var14.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            var14.setFeature("http://xml.org/sax/features/external-general-entities", false);
            var14.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            var14.setXIncludeAware(false);
            var14.setExpandEntityReferences(false);
            this.n5(var14);
            DocumentBuilder var15 = var14.newDocumentBuilder();
            Document var16 = var15.parse(var28);
            Element var17 = var16.getDocumentElement();
            ArrayList var18 = new ArrayList();
            if (var17 != null) {
               NodeList var19 = var17.getChildNodes();

               for (int var20 = 0; var20 < var19.getLength(); var20++) {
                  Node var21 = var19.item(var20);
                  var18.add(this.n5(var21));
               }
            }

            return var18;
         } catch (Exception var22) {
            String[] var13 = new String[]{var11};
            throw new s3(1006, var13, "Error in converting response json value to java object : " + var22.getMessage(), var22);
         }
      } else {
         return null;
      }
   }

   private void n5(DocumentBuilderFactory var1) {
      try {
         Field var2 = XMLConstants.class.getField("ACCESS_EXTERNAL_DTD");
         Field var3 = XMLConstants.class.getField("ACCESS_EXTERNAL_SCHEMA");
         var1.setAttribute((String)var2.get(null), "");
         var1.setAttribute((String)var3.get(null), "");
      } catch (NoSuchFieldException var4) {
         v4.n5(var4);
      } catch (IllegalArgumentException var5) {
         v4.n5(var5);
      } catch (IllegalAccessException var6) {
         v4.n5(var6);
      }
   }

   public static int[] l6() {
      boolean var0 = n5 == null || n5.u3 != 256;
      return var0 ? z7.n5 : z7.l6;
   }

   public static void k5() {
      n5 = new f2();
   }

   public double u3() {
      if (this.l6 != null && this.k5 != null) {
         double var1 = 0.0;

         try {
            List var3 = this.l6(this.l6, this.k5);
            if (var3 != null && var3.size() > 0) {
               y8 var4 = (y8)var3.get(0);
               List var5 = this.n5(var4.n5());
               if (var5 != null && var5.size() > 0) {
                  for (Object recoveredElement$var7$6947 : var5) {
                     c3 var7 = (c3)recoveredElement$var7$6947;
                     if ("Processed Quantity".equals(var7.a6())) {
                        var1 = var7.u3();
                        break;
                     }
                  }
               }

               return var1;
            } else {
               throw new IllegalStateException("There is no subscription.");
            }
         } catch (Exception var8) {
            throw new IllegalStateException(var8.getMessage());
         }
      } else {
         throw new IllegalStateException("You should set metered key firstly.");
      }
   }

   public double a6() {
      if (this.l6 != null && this.k5 != null) {
         double var1 = 0.0;

         try {
            List var3 = this.l6(this.l6, this.k5);
            if (var3 != null && var3.size() > 0) {
               y8 var4 = (y8)var3.get(0);
               List var5 = this.n5(var4.n5());
               if (var5 != null && var5.size() > 0) {
                  for (Object recoveredElement$var7$7911 : var5) {
                     c3 var7 = (c3)recoveredElement$var7$7911;
                     if ("Credits".equals(var7.a6())) {
                        var1 = var7.u3();
                        break;
                     }
                  }
               }

               return var1;
            } else {
               throw new IllegalStateException("There is no subscription.");
            }
         } catch (Exception var8) {
            throw new IllegalStateException(var8.getMessage());
         }
      } else {
         throw new IllegalStateException("You should set metered key firstly.");
      }
   }

   private List<c3> n5(Long var1) throws s3 {
      b3 var2 = new b3(this.a6, this.u9);
      p8 var3 = p8.n5(var2, this.h0, false);
      String var4 = "/subscriptions/{id}/items";
      var4 = var4.replace("{format}", "xml").replaceAll("\\*", "");
      String var5 = "GET";
      HashMap var6 = new HashMap();
      HashMap var7 = new HashMap();
      if (var1 != null) {
         var4 = var4.replace("{id}", p8.n5(var1));
      }

      var4 = var4.replaceAll("\\{\\w*\\}", "");
      String var8 = var3.n5(var4, var5, var6, null, var7);
      if (var8 != null && var8.length() != 0) {
         try {
            StringReader var9 = new StringReader(var8);
            InputSource var19 = new InputSource(var9);
            DocumentBuilderFactory var11 = DocumentBuilderFactory.newInstance();
            var11.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            var11.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            var11.setFeature("http://xml.org/sax/features/external-general-entities", false);
            var11.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            var11.setXIncludeAware(false);
            var11.setExpandEntityReferences(false);
            this.n5(var11);
            DocumentBuilder var12 = var11.newDocumentBuilder();
            Document var13 = var12.parse(var19);
            Element var14 = var13.getDocumentElement();
            List var15 = null;
            if (var14 != null) {
               var15 = this.u3(var14);
            } else {
               var15 = new ArrayList();
            }

            return var15;
         } catch (Exception var16) {
            String[] var10 = new String[]{var8};
            throw new s3(1006, var10, "Error in converting response json value to java object : " + var16.getMessage(), var16);
         }
      } else {
         return null;
      }
   }

   private x9 l6(Long var1) throws s3 {
      b3 var2 = new b3(this.a6, this.u9);
      p8 var3 = p8.n5(var2, this.h0, false);
      String var4 = "/products/{id}";
      var4 = var4.replace("{format}", "xml").replaceAll("\\*", "");
      String var5 = "GET";
      HashMap var6 = new HashMap();
      HashMap var7 = new HashMap();
      if (var1 != null) {
         var4 = var4.replace("{id}", p8.n5(var1));
      }

      var4 = var4.replaceAll("\\{\\w*\\}", "");
      String var8 = var3.n5(var4, var5, var6, null, var7);
      if (var8 != null && var8.length() != 0) {
         try {
            StringReader var9 = new StringReader(var8);
            InputSource var19 = new InputSource(var9);
            DocumentBuilderFactory var11 = DocumentBuilderFactory.newInstance();
            var11.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            var11.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            var11.setFeature("http://xml.org/sax/features/external-general-entities", false);
            var11.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            var11.setXIncludeAware(false);
            var11.setExpandEntityReferences(false);
            this.n5(var11);
            DocumentBuilder var12 = var11.newDocumentBuilder();
            Document var13 = var12.parse(var19);
            Element var14 = var13.getDocumentElement();
            x9 var15 = null;
            if (var14 != null) {
               var15 = this.l6(var14);
            }

            return var15;
         } catch (Exception var16) {
            String[] var10 = new String[]{var8};
            throw new s3(1006, var10, "Error in converting response json value to java object : " + var16.getMessage(), var16);
         }
      } else {
         return null;
      }
   }

   void u9() {
      if (this.l6 != null && this.k5 != null) {
         double var1 = e5.n5().l6();
         long var3 = e5.n5().k5();
         if (var1 != 0.0 || var3 != 0L) {
            boolean var5 = true;
            boolean var6 = false;
            boolean var7 = false;

            try {
               List var8 = this.l6(this.l6, this.k5);
               if (!this.n5(var8)) {
                  n5 = new f2();
                  return;
               }

               if (var8 != null
                  && var8.size() > 0
                  && ((y8)var8.get(0)).k5() != null
                  && ((y8)var8.get(0)).k5().size() > 0
                  && ((y8)var8.get(0)).k5().get(0).n5() != null) {
                  p3 var55 = ((y8)var8.get(0)).k5().get(0).n5();
                  x9 var10 = this.l6(var55.k5());
                  if (var10 != null) {
                     for (p3 var12 : var10.n5()) {
                        if (var12.l6() == var55.l6()) {
                           var55 = var12;
                           break;
                        }
                     }
                  }

                  ArrayList var56 = new ArrayList();

                  for (y0 var13 : var55.n5()) {
                     if (var1 > 0.0 && "Processed Quantity".equals(var13.n5())) {
                        var56.add(var13);
                     } else if (var3 > 0L && "Credits".equals(var13.n5())) {
                        var56.add(var13);
                     }
                  }

                  if (var56.size() > 0 && (var1 > 0.0 || var3 > 0L)) {
                     ArrayList var58 = new ArrayList();

                     for (Object recoveredElement$var14$13952 : var56) {
                        y0 var14 = (y0)recoveredElement$var14$13952;
                        if ("Processed Quantity".equals(var14.n5())) {
                           c3 var15 = new c3();
                           var15.l6(var14.l6());
                           var15.n5(var1);
                           var15.n5(((y8)var8.get(0)).n5());
                           var15.n5(true);
                           var58.add(var15);
                        } else if ("Credits".equals(var14.n5())) {
                           c3 var60 = new c3();
                           var60.l6(var14.l6());
                           var60.n5((double)var3);
                           var60.n5(((y8)var8.get(0)).n5());
                           var60.n5(true);
                           var58.add(var60);
                        }
                     }

                     try {
                        this.n5(((y8)var8.get(0)).n5(), var58);
                        var5 = false;
                     } catch (Exception var51) {
                        var6 = true;
                     }
                  }
               }

               var7 = true;
            } catch (s3 var53) {
               if (var53.n5() == 500) {
                  boolean var9 = false;
                  e5.n5().a6.lock();

                  try {
                     if (e5.n5().u3 == -1L) {
                        e5.n5().u3 = System.currentTimeMillis();
                     }

                     if (System.currentTimeMillis() - e5.n5().u3 > 86400000L) {
                        var9 = true;
                     }
                  } finally {
                     e5.n5().a6.unlock();
                  }

                  if (var9) {
                     var6 = true;
                  }
               } else {
                  var6 = true;
               }
            } catch (Exception var54) {
               var6 = true;
            }

            if (var5) {
               e5.n5().n5(var1, false);
               e5.n5().n5(var3, false);
            }

            if (var6) {
               e5.n5().k5.lock();

               try {
                  if (e5.n5().n5 == -1L) {
                     e5.n5().n5 = System.currentTimeMillis();
                  }

                  e5.n5().l6++;
                  if (System.currentTimeMillis() - e5.n5().n5 > 86400000L && e5.n5().l6 > 10) {
                     n5 = new f2();
                  }
               } finally {
                  e5.n5().k5.unlock();
               }
            } else {
               e5.n5().k5.lock();

               try {
                  e5.n5().n5 = -1L;
                  e5.n5().l6 = 0;
               } finally {
                  e5.n5().k5.unlock();
               }
            }

            if (var7) {
               e5.n5().a6.lock();

               try {
                  e5.n5().u3 = -1L;
               } finally {
                  e5.n5().a6.unlock();
               }
            }
         }
      }
   }

   private void n5(Long var1, List<c3> var2) throws s3 {
      b3 var3 = new b3(this.a6, this.u9);
      p8 var4 = p8.n5(var3, this.h0, false);
      String var5 = "/subscriptions/{id}/items";
      var5 = var5.replace("{format}", "json").replaceAll("\\*", "");
      String var6 = "PUT";
      HashMap var7 = new HashMap();
      HashMap var8 = new HashMap();
      var5 = var5.replace("{id}", p8.n5(var1));
      var5 = var5.replaceAll("\\{\\w*\\}", "");
      String var9 = this.l6(var2);
      String var10 = var4.n5(var5, var6, var7, var9, var8);
   }

   private y8 n5(Node var1) {
      y8 var2 = new y8();
      NodeList var3 = var1.getChildNodes();

      for (int var4 = 0; var4 < var3.getLength(); var4++) {
         Node var5 = var3.item(var4);
         if (!"SubscriptionPricingPlans".equals(var5.getNodeName())) {
            if ("Id".equals(var5.getNodeName())) {
               var2.n5(Long.parseLong(var5.getTextContent()));
            } else if ("FilteredStatus".equals(var5.getNodeName())) {
               var2.n5(var5.getTextContent());
            }
         } else {
            NodeList var6 = var5.getChildNodes();

            for (int var7 = 0; var7 < var6.getLength(); var7++) {
               Node var8 = var6.item(var7);
               l4 var9 = new l4();
               var2.k5().add(var9);
               NodeList var10 = var8.getChildNodes();

               for (int var11 = 0; var11 < var10.getLength(); var11++) {
                  Node var12 = var10.item(var11);
                  if ("Id".equals(var12.getNodeName())) {
                     var9.n5(Long.parseLong(var12.getTextContent()));
                  } else if ("ProductPricingPlan".equals(var12.getNodeName())) {
                     var9.n5(this.k5(var12));
                  }
               }
            }
         }
      }

      return var2;
   }

   private x9 l6(Node var1) {
      x9 var2 = new x9();
      NodeList var3 = var1.getChildNodes();

      for (int var4 = 0; var4 < var3.getLength(); var4++) {
         Node var5 = var3.item(var4);
         if ("Id".equals(var5.getNodeName())) {
            var2.n5(Long.parseLong(var5.getTextContent()));
         } else if ("Name".equals(var5.getNodeName())) {
            var2.n5(var5.getTextContent());
         } else if ("PricingPlans".equals(var5.getNodeName())) {
            NodeList var6 = var5.getChildNodes();

            for (int var7 = 0; var7 < var6.getLength(); var7++) {
               Node var8 = var6.item(var7);
               var2.n5().add(this.k5(var8));
            }
         }
      }

      return var2;
   }

   private p3 k5(Node var1) {
      p3 var2 = new p3();
      NodeList var3 = var1.getChildNodes();

      for (int var4 = 0; var4 < var3.getLength(); var4++) {
         Node var5 = var3.item(var4);
         if ("Id".equals(var5.getNodeName())) {
            var2.n5(Long.valueOf(Long.parseLong(var5.getTextContent())));
         } else if ("Name".equals(var5.getNodeName())) {
            var2.n5(var5.getTextContent());
         } else if ("ProductId".equals(var5.getNodeName())) {
            var2.n5(Long.parseLong(var5.getTextContent()));
         } else if ("ProductItemsList".equals(var5.getNodeName())) {
            NodeList var6 = var5.getChildNodes();

            for (int var7 = 0; var7 < var6.getLength(); var7++) {
               Node var8 = var6.item(var7);
               y0 var9 = new y0();
               var2.n5().add(var9);
               NodeList var10 = var8.getChildNodes();

               for (int var11 = 0; var11 < var10.getLength(); var11++) {
                  Node var12 = var10.item(var11);
                  if ("Id".equals(var12.getNodeName())) {
                     var9.n5(Long.parseLong(var12.getTextContent()));
                  } else if ("Name".equals(var12.getNodeName())) {
                     var9.n5(var12.getTextContent());
                  }
               }
            }
         }
      }

      return var2;
   }

   private List<c3> u3(Node var1) {
      ArrayList var2 = new ArrayList();
      NodeList var3 = var1.getChildNodes();

      for (int var4 = 0; var4 < var3.getLength(); var4++) {
         Node var5 = var3.item(var4);
         c3 var6 = new c3();
         var2.add(var6);
         NodeList var7 = var5.getChildNodes();

         for (int var8 = 0; var8 < var7.getLength(); var8++) {
            Node var9 = var7.item(var8);
            String var10 = var9.getNodeName();
            String var11 = var9.getTextContent();
            if ("SubscriptionId".equals(var10)) {
               var6.n5(Long.parseLong(var11));
            } else if ("ProductItemId".equals(var10)) {
               var6.l6(Long.parseLong(var11));
            } else if ("Quantity".equals(var10)) {
               var6.n5(Double.parseDouble(var11));
            } else if ("UpdateDescription".equals(var10)) {
               var6.k5(var11);
            } else if ("Name".equals(var10)) {
               var6.l6(var11);
            } else if ("UnitName".equals(var10)) {
               var6.n5(var11);
            } else if ("IsQuantityAccumulated".equals(var10)) {
               var6.n5(Boolean.parseBoolean(var11));
            }
         }
      }

      return var2;
   }

   private String l6(List<c3> var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
      var2.append("<ArrayOfSubscriptionItem xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");

      for (c3 var4 : var1) {
         var2.append("<SubscriptionItem>");
         if (var4.u9() != null) {
            var2.append("<UpdateDescription>" + var4.u9() + "</UpdateDescription>");
         }

         var2.append("<IsQuantityAccumulated>" + String.valueOf(var4.h0()) + "</IsQuantityAccumulated>");
         if (var4.a6() != null) {
            var2.append("<Name>" + var4.a6() + "</Name>");
         }

         var2.append("<ProductItemId>" + String.valueOf(var4.l6()) + "</ProductItemId>");
         var2.append("<Quantity>" + (var4.u3() == null ? "null" : String.format(Locale.US, "%f", var4.u3())) + "</Quantity>");
         var2.append("<SubscriptionId>" + String.valueOf(var4.n5()) + "</SubscriptionId>");
         if (var4.k5() != null) {
            var2.append("<UnitName>" + var4.k5() + "</UnitName>");
         }

         var2.append("<ChangesHistory />");
         var2.append("</SubscriptionItem>");
      }

      var2.append("</ArrayOfSubscriptionItem>");
      return var2.toString();
   }
}
