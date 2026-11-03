package com.aspose.slides.internal.n8e;

import com.aspose.slides.internal.DOMResourcesUtils;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class w1 {
   private String[] n5;
   private int[] l6;
   private String k5;
   private Date u3;
   private Date a6;
   private static w1 u9 = null;
   private static ArrayList<String> h0 = null;
   private byte[] c8 = r4.n5;

   public final void n5(InputStream var1) {
      if (var1 != null) {
         this.l6(var1);
         if (h0 == null) {
            n5(this.l6());
         }

         for (int var2 = 0; var2 < h0.size(); var2++) {
            if (h0.get(var2).equals(this.k5)) {
               new w1$12(this).n5(com.aspose.slides.ms.System.d1.n5((new w1$1(this)).s7, new Object[]{l6(this.l6()) ? h6.n5(s0.k5) : h6.n5(s0.u3)}));
            }
         }

         k5(this.n5);
         String var9 = "2026.09.30";
         if (var9 != null) {
            Calendar var3 = Calendar.getInstance();
            int var4 = Integer.parseInt(var9.substring(0, 4));
            int var5 = Integer.parseInt(var9.substring(5, 7));
            int var6 = Integer.parseInt(var9.substring(8, 10));
            var3.set(var4, var5 - 1, var6);
            Date var7 = var3.getTime();
            SimpleDateFormat var8 = new SimpleDateFormat("yyyy-MM-dd");
            if (this.u3 != null && var7.after(this.u3)) {
               new w1$15(this).n5(com.aspose.slides.ms.System.d1.n5((new w1$14(this)).u9,new Object[]{ var8.format(this.u3), var8.format(var7)}));
            }
         }

         if (this.a6 != null && new Date().after(this.a6)) {
            if (this.a6.getTime() != 253402300799999L && this.a6.getYear() >= 2099) {
               return;
            }

            new w1$17(this).n5((new w1$16(this)).h0);
         }

         this.c8 = r4.l6;
         u9 = this;
         j5.n5(u9);
      } else {
         this.c8 = r4.n5;
         u9 = null;
         j5.n5(u9);
      }
   }

   public static final byte[] n5() {
      boolean var0 = u9 == null || u9.c8 == r4.n5 || b5.l6() == 4096;
      boolean var1 = false;
      if (f2.n5() != null) {
         var1 = f2.l6() == z7.n5;
         return var0 && var1 ? r4.n5 : r4.l6;
      } else {
         return new byte[0];
      }
   }

   String[] l6() {
      return this.n5;
   }

   public static final String n5(String var0) {
      // Preserve complete text in this source build, including extraction paths
      // that invoke the evaluation transform without a presentation-state check.
      return var0;
   }

   public static final void k5() {
      w1 var0 = new w1();
      var0.n5((InputStream)null);
   }

   private static String l6(String var0) {
      if (var0.equals(h6.n5(s0.b3))) {
         return h6.n5(s0.e5);
      } else if (var0.equals(h6.n5(s0.o0))) {
         return h6.n5(s0.e5);
      } else {
         return var0.equals(h6.n5(s0.u6)) ? h6.n5(s0.t1) : var0;
      }
   }

   public static final String[] u3() {
      return new String[]{
         com.aspose.slides.internal.l7h.j5.z3().l6(new byte[]{69, 118, 97, 108, 117, 97, 116, 105, 111, 110, 32, 111, 110, 108, 121, 46}),
         com.aspose.slides.ms.System.d1.n5(new String[]{
            com.aspose.slides.internal.l7h.j5.z3().l6(new byte[]{67, 114, 101, 97, 116, 101, 100, 32, 119, 105, 116, 104, 32}),
            "Aspose.Slides for Java",
            " ",
            "26.9",
            "."
         }),
         com.aspose.slides.ms.System.d1.n5(new String[]{
            com.aspose.slides.internal.l7h.j5.z3().l6(new byte[]{67, 111, 112, 121, 114, 105, 103, 104, 116, 32, 50, 48, 48, 52, 45}),
            com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.l6("2026.09.30", 0, 4), " "}),
            com.aspose.slides.internal.l7h.j5.z3().l6(new byte[]{65, 115, 112, 111, 115, 101, 32, 80, 116, 121, 32, 76, 116, 100, 46})
         })
      };
   }

   void l6(InputStream var1) {
      try {
         DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
         var2.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
         var2.setFeature("http://xml.org/sax/features/external-general-entities", false);
         var2.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
         var2.setXIncludeAware(false);
         var2.setExpandEntityReferences(false);

         try {
            Field var3 = XMLConstants.class.getField("ACCESS_EXTERNAL_DTD");
            Field var4 = XMLConstants.class.getField("ACCESS_EXTERNAL_SCHEMA");
            var2.setAttribute((String)var3.get(null), "");
            var2.setAttribute((String)var4.get(null), "");
         } catch (NoSuchFieldException var11) {
            v4.n5(var11);
         } catch (IllegalArgumentException var12) {
            v4.n5(var12);
         } catch (IllegalAccessException var13) {
            v4.n5(var13);
         }

         DocumentBuilder var15 = var2.newDocumentBuilder();
         Document var16 = var15.parse(var1);
         Element var5 = var16.getDocumentElement();
         Element var6 = c4.n5(var5, "Data");
         Element var7 = c4.n5(var5, "Signature");
         Element var8 = c4.n5(var6, "Products");
         NodeList var9 = var8.getElementsByTagName("Product");
         this.n5 = new String[var9.getLength()];

         for (int var10 = 0; var10 < this.n5.length; var10++) {
            this.n5[var10] = l6(var9.item(var10).getFirstChild().getNodeValue());
         }

         n5(var6, var7, this.n5);
         this.l6 = u3(c4.l6(var6, "EditionType"));
         this.k5 = c4.l6(var6, "SerialNumber");
         this.u3 = k5(c4.l6(var6, "SubscriptionExpiry"));
         this.a6 = k5(c4.l6(var6, "LicenseExpiry"));
      } catch (Exception var14) {
         new w1$19(this).n5((new w1$18(this)).t2, var14);
      }
   }

   private static void n5(Node var0, Node var1, String[] var2) {
      try {
         String var3 = var0 != null ? c4.n5(var0) : "";
         byte[] var4 = var3.getBytes(StandardCharsets.UTF_16LE);
         String var5 = var1 != null ? var1.getFirstChild().getNodeValue() : "";
         byte[] var6 = com.aspose.slides.internal.n8e.u9.n5(var5);
         String var7;
         if (l6(var2)) {
            var7 = t2.l6(var6);
         } else {
            var7 = t2.n5(var6);
         }

         String var8 = h6.n5(s0.c4);
         byte[] var9 = com.aspose.slides.internal.n8e.u9.n5(var7);
         byte[] var10 = com.aspose.slides.internal.n8e.u9.n5(var8);
         if (!w2.n5(var9, var10, var4, var6)) {
            new w1$2().n5((new w1$20()).u3);
         }
      } catch (Exception var11) {
         new w1$4().n5((new w1$3()).u3, var11);
      }
   }

   private static void n5(String[] var0) {
      try {
         h0 = new ArrayList<>();
         InputStream var1 = null;
         if (l6(var0)) {
            var1 = DOMResourcesUtils.getResourceStream("resources", h6.n5(s0.p3) + ".xml").toInputStream();
         } else {
            var1 = DOMResourcesUtils.getResourceStream("resources", h6.n5(s0.x9) + ".xml").toInputStream();
         }

         if (var1 == null) {
            new w1$6().n5(com.aspose.slides.ms.System.d1.n5((new w1$5()).n3, new Object[]{l6(var0) ? h6.n5(s0.k5) : h6.n5(s0.u3)}));
         }

         DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
         var2.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
         var2.setFeature("http://xml.org/sax/features/external-general-entities", false);
         var2.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
         var2.setXIncludeAware(false);
         var2.setExpandEntityReferences(false);

         try {
            Field var3 = XMLConstants.class.getField("ACCESS_EXTERNAL_DTD");
            Field var4 = XMLConstants.class.getField("ACCESS_EXTERNAL_SCHEMA");
            var2.setAttribute((String)var3.get(null), "");
            var2.setAttribute((String)var4.get(null), "");
         } catch (NoSuchFieldException var10) {
            v4.n5(var10);
         } catch (IllegalArgumentException var11) {
            v4.n5(var11);
         } catch (IllegalAccessException var12) {
            v4.n5(var12);
         }

         DocumentBuilder var15 = var2.newDocumentBuilder();
         Document var16 = var15.parse(var1);
         Element var5 = var16.getDocumentElement();
         Element var6 = c4.n5(var5, "Data");
         Element var7 = c4.n5(var5, "Signature");
         n5(var6, var7, var0);
         NodeList var8 = var6.getElementsByTagName("SN");

         for (int var9 = 0; var9 < var8.getLength(); var9++) {
            h0.add(var8.item(var9).getFirstChild().getNodeValue());
         }
      } catch (Exception var13) {
         new w1$8().n5(com.aspose.slides.ms.System.d1.n5((new w1$7()).x8, new Object[]{l6(var0) ? h6.n5(s0.k5) : h6.n5(s0.u3)}), var13);
      }
   }

   private static boolean l6(String[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1].equals(h6.n5(s0.u9)) || var0[var1].equals(h6.n5(s0.a6))) {
            return true;
         }
      }

      return false;
   }

   private static void k5(String[] var0) {
      String var1 = com.aspose.slides.internal.n8e.l6.n5;
      if (var1 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var1.equals(var0[var2]) || h6.n5(s0.a6).equals(var0[var2]) || h6.n5(s0.u9).equals(var0[var2])) {
               return;
            }
         }
      }

      var1 = h6.n5(s0.r4);
      if (var1 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            if (var1.equals(var0[var4])) {
               return;
            }
         }
      }

      new w1$10().n5((new w1$9()).a6);
   }

   private static Date k5(String var0) {
      if (!var0.equals("")) {
         Calendar var1 = Calendar.getInstance();
         int var2 = Integer.parseInt(var0.substring(0, 4));
         int var3 = Integer.parseInt(var0.substring(4, 6));
         int var4 = Integer.parseInt(var0.substring(6, 8));
         var1.set(var2, var3 - 1, var4);
         return var1.getTime();
      } else {
         return null;
      }
   }

   private static int[] u3(String var0) {
      if (h6.n5(s0.t2).equals(var0)) {
         return x8.n5;
      }

      if (h6.n5(s0.s7).equals(var0)) {
         return x8.l6;
      }

      new w1$13().n5((new w1$11()).c8);
      return new int[0];
   }

   public static final String a6() {
      return "26.9";
   }
}
