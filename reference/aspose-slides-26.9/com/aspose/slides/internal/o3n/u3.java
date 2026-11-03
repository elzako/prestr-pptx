package com.aspose.slides.internal.o3n;

import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.internal.x7n.c8;
import com.aspose.slides.internal.x7n.n3;
import com.aspose.slides.internal.x7n.t2;
import com.aspose.slides.internal.x7n.t4;
import com.aspose.slides.internal.x7n.t9;
import com.aspose.slides.internal.x7n.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.core.resources.ResourcesLoader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class u3 {
   private static final HashMap<Integer, k5> n5 = new HashMap<>();
   private static final HashMap<Integer, t4> l6 = new HashMap<>();
   private static final HashMap<Integer, t4[]> k5 = new HashMap<>();
   private static final HashMap<Integer, Integer> u3 = new HashMap<>();
   private static HashMap<Integer, Integer> a6 = new HashMap<>();

   public static int n5(int var0) {
      return a6.get(var0);
   }

   public static k5 l6(int var0) {
      synchronized (n5) {
         if (!n5.containsKey(var0)) {
            k5 var2 = a6(var0);
            if (var2 == null) {
               throw new FileNotFoundException(var0 + ".xml");
            }

            n5.put(var0, var2);
         }

         return n5.get(var0);
      }
   }

   private static k5 a6(int var0) {
      com.aspose.slides.internal.z0k.t4 var1 = ResourcesLoader.loadResource("System.Globalization", "patterns.dat");
      com.aspose.slides.ms.core.resources.n5 var2 = com.aspose.slides.ms.core.resources.l6.n5(var1, var0 + ".xml");
      return var2 == null ? null : n5(n5(var2));
   }

   private static Element n5(com.aspose.slides.ms.core.resources.n5 var0) {
      try {
         DocumentBuilderFactory var1 = DocumentBuilderFactory.newInstance();
         DocumentBuilder var2 = var1.newDocumentBuilder();
         InputStream var3 = var0.n5().toInputStream();
         return var2.parse(var3).getDocumentElement();
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   private static k5 n5(Element var0) {
      if (!var0.getTagName().equals("CultureInfo")) {
         return null;
      }

      k5 var1 = new k5();
      var1.n5 = var0.getAttribute("Name");
      var1.l6 = Integer.parseInt(var0.getAttribute("LCID"));
      var1.k5 = Boolean.parseBoolean(var0.getAttribute("IsNeutralCulture"));
      if (!var1.k5) {
         NodeList var2 = var0.getChildNodes();

         for (int var3 = 0; var3 < var2.getLength(); var3++) {
            Node var4 = var2.item(var3);
            if (var4.getNodeType() == 1) {
               if (((Element)var4).getTagName().equals("DateTimeFormat")) {
                  var1.u3 = k5((Element)var4);
               } else if (((Element)var4).getTagName().equals("NumberFormat")) {
                  var1.a6 = l6((Element)var4);
               }
            }
         }
      }

      return var1;
   }

   private static h0 l6(Element var0) {
      h0 var1 = (new k5()).a6;
      var1.n5 = Integer.parseInt(n5(var0, "CurrencyDecimalDigits"));
      var1.l6 = n5(var0, "CurrencyDecimalSeparator");
      var1.k5 = n5(var0, "CurrencyGroupSeparator");
      var1.a6 = Integer.parseInt(n5(var0, "CurrencyNegativePattern"));
      var1.u9 = Integer.parseInt(n5(var0, "CurrencyPositivePattern"));
      var1.h0 = n5(var0, "CurrencySymbol");
      var1.n3 = Integer.parseInt(n5(var0, "NumberDecimalDigits"));
      var1.y4 = n5(var0, "NumberDecimalSeparator");
      var1.e2 = n5(var0, "NumberGroupSeparator");
      var1.z1 = Integer.parseInt(n5(var0, "NumberNegativePattern"));
      var1.t4 = Integer.parseInt(n5(var0, "PercentDecimalDigits"));
      var1.q0 = n5(var0, "PercentDecimalSeparator");
      var1.z3 = n5(var0, "PercentGroupSeparator");
      var1.k7 = Integer.parseInt(n5(var0, "PercentNegativePattern"));
      var1.m3 = Integer.parseInt(n5(var0, "PercentPositivePattern"));
      var1.z8 = n5(var0, "PercentSymbol");
      var1.c8 = n5(var0, "NaNSymbol");
      var1.s7 = n5(var0, "NegativeInfinitySymbol");
      var1.w1 = n5(var0, "PositiveInfinitySymbol");
      var1.x8 = n5(var0, "NegativeSign");
      var1.r4 = n5(var0, "PositiveSign");
      var1.j5 = n5(var0, "PerMilleSymbol");
      var1.t2 = l6(var0, "NativeDigits/NativeDigit");
      var1.t9 = k5(var0, "NumberGroupSizes/NumberGroupSize");
      var1.t9 = k5(var0, "NumberGroupSizes/NumberGroupSize");
      var1.m1 = k5(var0, "PercentGroupSizes/PercentGroupSize");
      var1.u3 = k5(var0, "CurrencyGroupSizes/CurrencyGroupSize");
      return var1;
   }

   private static a6 k5(Element var0) {
      a6 var1 = (new k5()).u3;
      var1.n5 = Integer.parseInt(n5(var0, "FirstDayOfWeek"));
      var1.l6 = Integer.parseInt(n5(var0, "CalendarWeekRule"));
      var1.k5 = l6(var0, "EraNames/EraName");
      var1.u3 = l6(var0, "AbbreviatedEraNames/AbbreviatedEraName");
      var1.a6 = l6(var0, "AbbreviatedDayNames/AbbreviatedDayName");
      var1.u9 = l6(var0, "AbbreviatedMonthGenitiveNames/AbbreviatedMonthGenitiveName");
      var1.h0 = l6(var0, "AbbreviatedMonthNames/AbbreviatedMonthName");
      var1.c8 = l6(var0, "DayNames/DayName");
      var1.t2 = l6(var0, "MonthGenitiveNames/MonthGenitiveName");
      var1.s7 = l6(var0, "MonthNames/MonthName");
      var1.x8 = l6(var0, "ShortestDayNames/ShortestDayName");
      var1.n3 = n5(var0, "AMDesignator");
      var1.y4 = n5(var0, "PMDesignator");
      var1.e2 = n5(var0, "DateSeparator");
      var1.t9 = n5(var0, "TimeSeparator");
      var1.z1 = n5(var0, "FullDateTimePattern");
      var1.t4 = n5(var0, "LongDatePattern");
      var1.q0 = n5(var0, "LongTimePattern");
      var1.z3 = n5(var0, "ShortDatePattern");
      var1.m1 = n5(var0, "ShortTimePattern");
      var1.k7 = n5(var0, "RFC1123Pattern");
      var1.m3 = n5(var0, "SortableDateTimePattern");
      var1.z8 = n5(var0, "UniversalSortableDateTimePattern");
      var1.j5 = n5(var0, "MonthDayPattern");
      var1.w1 = n5(var0, "YearMonthPattern");
      var1.r4 = l6(var0, "AllDateTimePatterns/DateTimePattern");
      var1.c4 = u3(var0, "AllStandardDateTimePatterns/StandardDateTimePattern/DateTimePattern");
      return var1;
   }

   private static String n5(Element var0, String var1) {
      return n5(var0.getElementsByTagName(var1).item(0));
   }

   private static String[] l6(Element var0, String var1) {
      String[] var2 = d1.n5(var1, '/');
      ArrayList var3 = new ArrayList();
      Element var4 = (Element)var0.getElementsByTagName(var2[0]).item(0);
      NodeList var5 = var4.getChildNodes();

      for (int var6 = 0; var6 < var5.getLength(); var6++) {
         Node var7 = var5.item(var6);
         if (var7.getNodeType() == 1 && ((Element)var7).getTagName().equals(var2[1])) {
            var3.add(n5(var7));
         }
      }

      return (String[])var3.toArray(new String[0]);
   }

   private static int[] k5(Element var0, String var1) {
      String[] var2 = d1.n5(var1, '/');
      ArrayList var3 = new ArrayList();
      Element var4 = (Element)var0.getElementsByTagName(var2[0]).item(0);
      NodeList var5 = var4.getChildNodes();

      for (int var6 = 0; var6 < var5.getLength(); var6++) {
         Node var7 = var5.item(var6);
         if (var7.getNodeType() == 1 && ((Element)var7).getTagName().equals(var2[1])) {
            var3.add(Integer.parseInt(n5(var7)));
         }
      }

      int[] var10 = new int[var3.size()];
      int var11 = 0;

      for (Object recoveredElement$var9$7581 : var3) {
         Integer var9 = (Integer)recoveredElement$var9$7581;
         var10[var11++] = var9;
      }

      return var10;
   }

   private static HashMap<Character, String[]> u3(Element var0, String var1) {
      HashMap var2 = new HashMap();
      String[] var3 = d1.n5(var1, '/');
      Element var4 = (Element)var0.getElementsByTagName(var3[0]).item(0);
      NodeList var5 = var4.getChildNodes();

      for (int var6 = 0; var6 < var5.getLength(); var6++) {
         Node var7 = var5.item(var6);
         if (var7.getNodeType() == 1 && ((Element)var7).getTagName().equals(var3[1]) && ((Element)var7).getAttribute("Format") != null) {
            ArrayList var8 = new ArrayList();
            Character var9 = ((Element)var7).getAttribute("Format").charAt(0);
            NodeList var10 = var7.getChildNodes();

            for (int var11 = 0; var11 < var10.getLength(); var11++) {
               Node var12 = var10.item(var11);
               if (var12.getNodeType() == 1 && ((Element)var12).getTagName().equals(var3[2])) {
                  var8.add(n5(var12));
               }
            }

            var2.put(var9, var8.toArray(new String[0]));
         }
      }

      return var2;
   }

   private static String n5(Node var0) {
      Node var1 = var0.getFirstChild();
      return var1 == null ? d1.n5 : var1.getNodeValue();
   }

   public static t4 k5(int var0) {
      return l6.containsKey(var0) ? l6.get(var0) : new com.aspose.slides.internal.x7n.a6();
   }

   public static t4[] u3(int var0) {
      return k5.containsKey(var0) ? k5.get(var0) : new t4[]{new com.aspose.slides.internal.x7n.a6()};
   }

   static {
      l6.put(1, new com.aspose.slides.internal.x7n.h0());
      l6.put(2, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(6, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(7, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(8, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(9, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(10, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(11, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(12, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(13, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(14, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(15, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(16, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(17, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(18, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(19, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(20, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(21, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(22, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(24, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(25, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(26, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(27, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(28, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(29, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(30, new t9());
      l6.put(31, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(32, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(33, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(34, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(35, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(36, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(37, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(38, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(39, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(41, new com.aspose.slides.internal.x7n.a6(12));
      l6.put(42, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(43, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(44, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(45, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(47, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(54, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(55, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(56, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(57, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(62, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(63, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(64, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(65, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(67, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(68, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(70, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(71, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(73, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(74, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(75, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(78, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(79, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(80, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(86, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(87, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(90, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(101, new com.aspose.slides.internal.x7n.h0());
      l6.put(127, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1025, new com.aspose.slides.internal.x7n.h0());
      l6.put(1026, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1027, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1028, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1029, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1030, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1031, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1032, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1033, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1035, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1036, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1037, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1038, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1039, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1040, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1041, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1042, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1043, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1044, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1045, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1046, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1048, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1049, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1050, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1051, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1052, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1053, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1054, new t9());
      l6.put(1055, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1056, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1057, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1058, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1059, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1060, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1061, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1062, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1063, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1065, new com.aspose.slides.internal.x7n.a6(12));
      l6.put(1066, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1067, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1068, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1069, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1071, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1078, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1079, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1080, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1081, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1086, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1087, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1088, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1089, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1091, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1092, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1094, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1095, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1097, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1098, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1099, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1102, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1103, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1104, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1110, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1111, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1114, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1125, new com.aspose.slides.internal.x7n.h0());
      l6.put(2049, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2052, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2055, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2057, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2058, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2060, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2064, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2067, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2068, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2070, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2074, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2077, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2092, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2110, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2115, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3073, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3076, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3079, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3081, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3082, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3084, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3098, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4097, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4100, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4103, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4105, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4106, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4108, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5121, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5124, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5127, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5129, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5130, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5132, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(6145, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(6153, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(6154, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(6156, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(7169, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(7177, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(7178, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(8193, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(8201, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(8202, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(9217, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(9225, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(9226, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(10241, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(10249, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(10250, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(11265, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(11273, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(11274, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(12289, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(12297, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(12298, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(13313, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(13321, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(13322, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(14337, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(14346, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(15361, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(15370, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(16385, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(16394, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(17418, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(18442, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(19466, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(20490, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(31748, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(31770, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(6203, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(7194, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1077, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1076, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1122, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1074, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2107, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(7227, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4122, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(9275, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3179, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(3131, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(8251, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1106, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5146, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(8218, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1124, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(4155, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1146, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2141, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1153, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2155, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(2108, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(6170, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1148, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(5179, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1134, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1132, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1131, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1083, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1082, new com.aspose.slides.internal.x7n.a6(1));
      l6.put(1047, new com.aspose.slides.internal.x7n.a6(1));
      k5.put(
         1,
         new t4[]{
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(2, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(3, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(4, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(5, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(6, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(7, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(8, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(9, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(10, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(11, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(12, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(13, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.u9()});
      k5.put(14, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(15, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(16, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(17, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new c8(), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(18, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new t2(), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(19, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(20, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(21, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(22, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(24, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(25, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(26, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(27, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(28, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(29, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(30, new t4[]{new t9(), new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(31, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(32, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(33, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(34, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(35, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(36, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(37, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(38, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(39, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         41,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(12),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(11)
         }
      );
      k5.put(42, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(43, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(44, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(45, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(47, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(54, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(55, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(56, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(57, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(62, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(63, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(64, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(65, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(67, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(68, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(70, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(71, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(73, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(74, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(75, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(78, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(79, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(80, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(86, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(87, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(90, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(101, new t4[]{new com.aspose.slides.internal.x7n.h0(), new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(127, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         1025,
         new t4[]{
            new com.aspose.slides.internal.x7n.h0(),
            new z1(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(1026, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1027, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1028, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2), new n3()});
      k5.put(1029, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1030, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1031, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1032, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1033, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(1035, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1036, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1037, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.u9()});
      k5.put(1038, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1039, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1040, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1041, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new c8(), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(1042, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new t2(), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(1043, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1044, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1045, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1046, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1048, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1049, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1050, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1051, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1052, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1053, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1054, new t4[]{new t9(), new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1055, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1056, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2), new com.aspose.slides.internal.x7n.h0()});
      k5.put(1057, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1058, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1059, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1060, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1061, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1062, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1063, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         1065,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(12),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(11)
         }
      );
      k5.put(1066, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1067, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1068, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1069, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1071, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1078, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1079, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1080, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1081, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1086, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1087, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1088, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1089, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1091, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1092, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1094, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1095, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1097, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1098, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1099, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1102, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1103, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1104, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1110, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1111, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1114, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1125, new t4[]{new com.aspose.slides.internal.x7n.h0(), new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         2049,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(11),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(2052, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2055, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2057, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(2058, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2060, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2064, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2067, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2068, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2070, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2074, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2077, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2092, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2110, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2115, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         3073,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(3076, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(3079, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(3081, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(3082, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(3084, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(3098, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         4097,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new z1(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(4100, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(4103, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(4105, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(4106, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(4108, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         5121,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new z1(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(11)
         }
      );
      k5.put(5124, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(5127, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(5129, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(5130, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(5132, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         6145,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new z1(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(11)
         }
      );
      k5.put(6153, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(6154, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(6156, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         7169,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new z1(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(11)
         }
      );
      k5.put(7177, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(7178, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         8193,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new z1(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(8201, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(8202, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         9217,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(9225, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(9226, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         10241,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(11),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(10249, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(10250, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         11265,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(11),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(11273, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(11274, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         12289,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(11),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(12297, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(12298, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         13313,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new com.aspose.slides.internal.x7n.h0(),
            new z1(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(13321, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(13322, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         14337,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(14346, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         15361,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(15370, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(
         16385,
         new t4[]{
            new com.aspose.slides.internal.x7n.a6(1),
            new z1(),
            new com.aspose.slides.internal.x7n.h0(),
            new com.aspose.slides.internal.x7n.a6(2),
            new com.aspose.slides.internal.x7n.a6(9),
            new com.aspose.slides.internal.x7n.a6(10),
            new com.aspose.slides.internal.x7n.a6(12)
         }
      );
      k5.put(16394, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(17418, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(18442, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(19466, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(20490, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(31748, new t4[]{new com.aspose.slides.internal.x7n.a6(1), new com.aspose.slides.internal.x7n.a6(2)});
      k5.put(31770, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(6203, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(7194, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1077, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1076, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1122, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1074, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2107, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(7227, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(4122, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(9275, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(3179, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(3131, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(8251, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1106, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(5146, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(8218, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1124, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(4155, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1146, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2141, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1153, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2155, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(2108, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(6170, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1148, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(5179, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1134, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1132, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1131, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1083, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1082, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      k5.put(1047, new t4[]{new com.aspose.slides.internal.x7n.a6(1)});
      u3.put(1, 127);
      u3.put(2, 127);
      u3.put(3, 127);
      u3.put(4, 4);
      u3.put(5, 127);
      u3.put(6, 127);
      u3.put(7, 127);
      u3.put(8, 127);
      u3.put(9, 127);
      u3.put(10, 127);
      u3.put(11, 127);
      u3.put(12, 127);
      u3.put(13, 127);
      u3.put(14, 127);
      u3.put(15, 127);
      u3.put(16, 127);
      u3.put(17, 127);
      u3.put(18, 127);
      u3.put(19, 127);
      u3.put(20, 127);
      u3.put(21, 127);
      u3.put(22, 127);
      u3.put(24, 127);
      u3.put(25, 127);
      u3.put(26, 127);
      u3.put(27, 127);
      u3.put(28, 127);
      u3.put(29, 127);
      u3.put(30, 127);
      u3.put(31, 127);
      u3.put(32, 127);
      u3.put(33, 127);
      u3.put(34, 127);
      u3.put(35, 127);
      u3.put(36, 127);
      u3.put(37, 127);
      u3.put(38, 127);
      u3.put(39, 127);
      u3.put(41, 127);
      u3.put(42, 127);
      u3.put(43, 127);
      u3.put(44, 127);
      u3.put(45, 127);
      u3.put(47, 127);
      u3.put(54, 127);
      u3.put(55, 127);
      u3.put(56, 127);
      u3.put(57, 127);
      u3.put(62, 127);
      u3.put(63, 127);
      u3.put(64, 127);
      u3.put(65, 127);
      u3.put(67, 127);
      u3.put(68, 127);
      u3.put(70, 127);
      u3.put(71, 127);
      u3.put(73, 127);
      u3.put(74, 127);
      u3.put(75, 127);
      u3.put(78, 127);
      u3.put(79, 127);
      u3.put(80, 127);
      u3.put(86, 127);
      u3.put(87, 127);
      u3.put(90, 127);
      u3.put(101, 127);
      u3.put(127, 127);
      u3.put(1025, 1);
      u3.put(1026, 2);
      u3.put(1027, 3);
      u3.put(1028, 31748);
      u3.put(1029, 5);
      u3.put(1030, 6);
      u3.put(1031, 7);
      u3.put(1032, 8);
      u3.put(1033, 9);
      u3.put(1035, 11);
      u3.put(1036, 12);
      u3.put(1037, 13);
      u3.put(1038, 14);
      u3.put(1039, 15);
      u3.put(1040, 16);
      u3.put(1041, 17);
      u3.put(1042, 18);
      u3.put(1043, 19);
      u3.put(1044, 20);
      u3.put(1045, 21);
      u3.put(1046, 22);
      u3.put(1048, 24);
      u3.put(1049, 25);
      u3.put(1050, 26);
      u3.put(1051, 27);
      u3.put(1052, 28);
      u3.put(1053, 29);
      u3.put(1054, 30);
      u3.put(1055, 31);
      u3.put(1056, 32);
      u3.put(1057, 33);
      u3.put(1058, 34);
      u3.put(1059, 35);
      u3.put(1060, 36);
      u3.put(1061, 37);
      u3.put(1062, 38);
      u3.put(1063, 39);
      u3.put(1065, 41);
      u3.put(1066, 42);
      u3.put(1067, 43);
      u3.put(1068, 44);
      u3.put(1069, 45);
      u3.put(1071, 47);
      u3.put(1078, 54);
      u3.put(1079, 55);
      u3.put(1080, 56);
      u3.put(1081, 57);
      u3.put(1086, 62);
      u3.put(1087, 63);
      u3.put(1088, 64);
      u3.put(1089, 65);
      u3.put(1091, 67);
      u3.put(1092, 68);
      u3.put(1094, 70);
      u3.put(1095, 71);
      u3.put(1097, 73);
      u3.put(1098, 74);
      u3.put(1099, 75);
      u3.put(1102, 78);
      u3.put(1103, 79);
      u3.put(1104, 80);
      u3.put(1110, 86);
      u3.put(1111, 87);
      u3.put(1114, 90);
      u3.put(1125, 101);
      u3.put(2049, 1);
      u3.put(2052, 4);
      u3.put(2055, 7);
      u3.put(2057, 9);
      u3.put(2058, 10);
      u3.put(2060, 12);
      u3.put(2064, 16);
      u3.put(2067, 19);
      u3.put(2068, 20);
      u3.put(2070, 22);
      u3.put(2074, 31770);
      u3.put(2077, 29);
      u3.put(2092, 44);
      u3.put(2110, 62);
      u3.put(2115, 67);
      u3.put(3073, 1);
      u3.put(3076, 31748);
      u3.put(3079, 7);
      u3.put(3081, 9);
      u3.put(3082, 10);
      u3.put(3084, 12);
      u3.put(3098, 31770);
      u3.put(4097, 1);
      u3.put(4100, 4);
      u3.put(4103, 7);
      u3.put(4105, 9);
      u3.put(4106, 10);
      u3.put(4108, 12);
      u3.put(5121, 1);
      u3.put(5124, 31748);
      u3.put(5127, 7);
      u3.put(5129, 9);
      u3.put(5130, 10);
      u3.put(5132, 12);
      u3.put(6145, 1);
      u3.put(6153, 9);
      u3.put(6154, 10);
      u3.put(6156, 12);
      u3.put(7169, 1);
      u3.put(7177, 9);
      u3.put(7178, 10);
      u3.put(8193, 1);
      u3.put(8201, 9);
      u3.put(8202, 10);
      u3.put(9217, 1);
      u3.put(9225, 9);
      u3.put(9226, 10);
      u3.put(10241, 1);
      u3.put(10249, 9);
      u3.put(10250, 10);
      u3.put(11265, 1);
      u3.put(11273, 9);
      u3.put(11274, 10);
      u3.put(12289, 1);
      u3.put(12297, 9);
      u3.put(12298, 10);
      u3.put(13313, 1);
      u3.put(13321, 9);
      u3.put(13322, 10);
      u3.put(14337, 1);
      u3.put(14346, 10);
      u3.put(15361, 1);
      u3.put(15370, 10);
      u3.put(16385, 1);
      u3.put(16394, 10);
      u3.put(17418, 10);
      u3.put(18442, 10);
      u3.put(19466, 10);
      u3.put(20490, 10);
      u3.put(31748, 31748);
      u3.put(31770, 127);
      u3.put(1118, 127);
      u3.put(2143, 127);
      u3.put(2141, 127);
      u3.put(6203, 127);
      u3.put(2128, 127);
      u3.put(1169, 127);
      u3.put(17417, 9);
      u3.put(1164, 127);
      u3.put(2117, 127);
      u3.put(1160, 127);
      u3.put(1159, 127);
      u3.put(1158, 127);
      u3.put(1157, 127);
      u3.put(1156, 127);
      u3.put(1155, 127);
      u3.put(1154, 127);
      u3.put(1153, 127);
      u3.put(2108, 127);
      u3.put(2107, 127);
      u3.put(1150, 127);
      u3.put(9275, 127);
      u3.put(1148, 127);
      u3.put(1146, 127);
      u3.put(1144, 127);
      u3.put(2094, 127);
      u3.put(1136, 127);
      u3.put(1135, 127);
      u3.put(1134, 127);
      u3.put(1133, 127);
      u3.put(1132, 127);
      u3.put(1131, 127);
      u3.put(1130, 127);
      u3.put(1128, 127);
      u3.put(1124, 127);
      u3.put(1123, 127);
      u3.put(1122, 127);
      u3.put(1121, 127);
      u3.put(1083, 127);
      u3.put(1117, 127);
      u3.put(9242, 127);
      u3.put(1115, 127);
      u3.put(10266, 127);
      u3.put(1108, 127);
      u3.put(1107, 127);
      u3.put(1106, 127);
      u3.put(1105, 127);
      u3.put(8251, 127);
      u3.put(1101, 127);
      u3.put(1100, 127);
      u3.put(16393, 9);
      u3.put(1096, 127);
      u3.put(1093, 127);
      u3.put(1090, 127);
      u3.put(5146, 127);
      u3.put(1082, 127);
      u3.put(12314, 127);
      u3.put(3131, 127);
      u3.put(1077, 127);
      u3.put(1076, 127);
      u3.put(1074, 127);
      u3.put(1070, 127);
      u3.put(8218, 127);
      u3.put(1064, 127);
      u3.put(6170, 127);
      u3.put(4155, 127);
      u3.put(1047, 127);
      u3.put(5179, 127);
      u3.put(2155, 127);
      u3.put(3179, 127);
      u3.put(4122, 26);
      u3.put(11290, 127);
      u3.put(7227, 127);
      u3.put(18441, 9);
      u3.put(1152, 127);
      u3.put(7194, 127);
      u3.put(21514, 10);
      a6.put(1, 1025);
      a6.put(2, 1026);
      a6.put(3, 1027);
      a6.put(4, 2052);
      a6.put(5, 1029);
      a6.put(6, 1030);
      a6.put(7, 1031);
      a6.put(8, 1032);
      a6.put(9, 1033);
      a6.put(10, 3082);
      a6.put(11, 1035);
      a6.put(12, 1036);
      a6.put(13, 1037);
      a6.put(14, 1038);
      a6.put(15, 1039);
      a6.put(16, 1040);
      a6.put(17, 1041);
      a6.put(18, 1042);
      a6.put(19, 1043);
      a6.put(20, 1044);
      a6.put(21, 1045);
      a6.put(22, 1046);
      a6.put(24, 1048);
      a6.put(25, 1049);
      a6.put(26, 1050);
      a6.put(27, 1051);
      a6.put(28, 1052);
      a6.put(29, 1053);
      a6.put(30, 1054);
      a6.put(31, 1055);
      a6.put(32, 1056);
      a6.put(33, 1057);
      a6.put(34, 1058);
      a6.put(35, 1059);
      a6.put(36, 1060);
      a6.put(37, 1061);
      a6.put(38, 1062);
      a6.put(39, 1063);
      a6.put(41, 1065);
      a6.put(42, 1066);
      a6.put(43, 1067);
      a6.put(44, 1044);
      a6.put(45, 1069);
      a6.put(47, 1071);
      a6.put(54, 1078);
      a6.put(55, 1079);
      a6.put(56, 1080);
      a6.put(57, 1081);
      a6.put(62, 1086);
      a6.put(63, 1087);
      a6.put(64, 1088);
      a6.put(65, 1089);
      a6.put(67, 1091);
      a6.put(68, 1092);
      a6.put(70, 1094);
      a6.put(71, 1095);
      a6.put(73, 1097);
      a6.put(74, 1098);
      a6.put(75, 1099);
      a6.put(78, 1102);
      a6.put(79, 1103);
      a6.put(80, 1104);
      a6.put(86, 1110);
      a6.put(87, 1111);
      a6.put(90, 1114);
      a6.put(101, 1125);
      a6.put(31748, 3076);
      a6.put(31770, 2074);
   }
}
