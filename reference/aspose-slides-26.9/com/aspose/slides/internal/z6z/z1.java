package com.aspose.slides.internal.z6z;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.IDisposable;

public class z1 {
   private static final Dictionary<String, f2> n5 = new Dictionary<>();
   private static final double l6 = com.aspose.slides.internal.n2d.t2.h0(2.0);

   public static String n5(f2 var0) {
      Dictionary$Enumerator var1 = n5.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            f2 var3 = ((f2)var2.getValue()).a6();
            if (com.aspose.slides.internal.n2d.t4.n5(var3.a6(), var0.a6(), l6)) {
               return (String)var2.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return "psk:CustomMediaSize";
   }

   static {
      n5.addItem("psk:ISOA3", new f2(841.85F, 1190.55F));
      n5.addItem("psk:ISOA4", new f2(595.25F, 841.85F));
      n5.addItem("psk:ISOA5", new f2(419.5F, 595.25F));
      n5.addItem("psk:ISOB4", new f2(708.65F, 1000.6F));
      n5.addItem("psk:ISOB5Envelope", new f2(498.85F, 708.65F));
      n5.addItem("psk:PRC5Envelope", new f2(311.8F, 623.6F));
      n5.addItem("psk:NorthAmericaExecutive", new f2(522.0F, 756.0F));
      n5.addItem("psk:OtherMetricFolio", new f2(576.0F, 936.0F));
      n5.addItem("psk:NorthAmerica11x17", new f2(792.0F, 1224.0F));
      n5.addItem("psk:NorthAmericaLegal", new f2(612.0F, 1008.0F));
      n5.addItem("psk:NorthAmericaLetter", new f2(612.0F, 792.0F));
      n5.addItem("psk:NorthAmerica10x14", new f2(720.0F, 1008.0F));
      n5.addItem("psk:NorthAmerica8x10", new f2(576.0F, 720.0F));
      n5.addItem("psk:NorthAmericaStatement", new f2(396.0F, 612.0F));
      n5.addItem("psk:ISODLEnvelope", new f2(311.81F, 623.62F));
      n5.addItem("psk:ISOA5Extra", new f2(493.23F, 666.14F));
      n5.addItem("psk:ISOB10", new f2(87.87F, 124.72F));
      n5.addItem("psk:ISOB9", new f2(124.72F, 175.75F));
      n5.addItem("psk:ISOB8", new f2(175.75F, 249.45F));
      n5.addItem("psk:ISOA10", new f2(73.7F, 104.88F));
      n5.addItem("psk:ISOA9", new f2(104.88F, 147.4F));
      n5.addItem("psk:ISOB7", new f2(249.45F, 354.33F));
      n5.addItem("psk:ISOB1", new f2(2004.09F, 2834.65F));
      n5.addItem("psk:ISOB0", new f2(2834.65F, 4008.19F));
      n5.addItem("psk:ISOB3", new f2(1000.63F, 1417.32F));
      n5.addItem("psk:ISOB2", new f2(1417.32F, 2004.09F));
      n5.addItem("psk:ISOA6", new f2(297.64F, 419.53F));
      n5.addItem("psk:ISOA1", new f2(1683.78F, 2383.94F));
      n5.addItem("psk:ISOA0", new f2(2383.94F, 3370.39F));
      n5.addItem("psk:ISOA2", new f2(1190.55F, 1683.78F));
      n5.addItem("psk:ISOA4Extra", new f2(667.56F, 913.61F));
      n5.addItem("psk:ISOC7", new f2(229.61F, 323.15F));
      n5.addItem("psk:ISOC6", new f2(323.15F, 459.21F));
      n5.addItem("psk:ISOA8", new f2(147.4F, 209.76F));
      n5.addItem("psk:ISOA7", new f2(209.76F, 297.64F));
      n5.addItem("psk:ISOB5Extra", new f2(569.76F, 782.36F));
      n5.addItem("psk:ISOB4Envelope", new f2(708.66F, 1000.63F));
      n5.addItem("psk:ISOA3Extra", new f2(912.76F, 1261.42F));
      n5.addItem("psk:ISOC6C5Envelope", new f2(323.15F, 649.13F));
      n5.addItem("psk:ISOSRA3", new f2(907.09F, 1275.59F));
      n5.addItem("psk:ISOC10", new f2(79.37F, 113.39F));
      n5.addItem("psk:ISOC9", new f2(113.39F, 161.57F));
      n5.addItem("psk:ISOC8", new f2(161.57F, 229.61F));
      n5.addItem("psk:ISOC5", new f2(459.21F, 649.13F));
      n5.addItem("psk:ISOC4", new f2(649.13F, 918.43F));
      n5.addItem("psk:ISOC1", new f2(1836.85F, 2599.37F));
      n5.addItem("psk:ISOC0", new f2(2599.37F, 3676.54F));
      n5.addItem("psk:ISOC3", new f2(918.43F, 1298.27F));
      n5.addItem("psk:ISOC2", new f2(1298.27F, 1836.85F));
      n5.addItem("psk:NorthAmericaNumber14Envelope", new f2(360.0F, 828.0F));
      n5.addItem("psk:NorthAmericaSuperB", new f2(864.57F, 1380.47F));
      n5.addItem("psk:NorthAmericaLetterExtra", new f2(684.0F, 864.0F));
      n5.addItem("psk:NorthAmericaDSheet", new f2(1584.0F, 2448.0F));
      n5.addItem("psk:NorthAmericaNumber12Envelope", new f2(342.0F, 792.0F));
      n5.addItem("psk:NorthAmerica4x6", new f2(288.0F, 432.0F));
      n5.addItem("psk:NorthAmerica4x8", new f2(288.0F, 576.0F));
      n5.addItem("psk:NorthAmericaMonarchEnvelope", new f2(279.0F, 504.0F));
      n5.addItem("psk:NorthAmerica10x11", new f2(720.0F, 792.0F));
      n5.addItem("psk:NorthAmericaPersonalEnvelope", new f2(261.0F, 468.0F));
      n5.addItem("psk:NorthAmericaQuarto", new f2(609.45F, 779.53F));
      n5.addItem("psk:NorthAmericaNumber10Envelope", new f2(297.0F, 684.0F));
      n5.addItem("psk:NorthAmericaNumber11Envelope", new f2(324.0F, 747.0F));
      n5.addItem("psk:NorthAmericaCSheet", new f2(1224.0F, 1584.0F));
      n5.addItem("psk:NorthAmerica9x11", new f2(648.0F, 792.0F));
      n5.addItem("psk:NorthAmerica10x12", new f2(720.0F, 864.0F));
      n5.addItem("psk:NorthAmericaGermanStandardFanfold", new f2(612.0F, 864.0F));
      n5.addItem("psk:NorthAmericaArchitectureDSheet", new f2(1728.0F, 2592.0F));
      n5.addItem("psk:NorthAmericaSuperA", new f2(643.46F, 1009.13F));
      n5.addItem("psk:NorthAmericaArchitectureASheet", new f2(648.0F, 864.0F));
      n5.addItem("psk:NorthAmericaNumber9Envelope", new f2(279.0F, 639.0F));
      n5.addItem("psk:NorthAmericaTabloidExtra", new f2(841.68F, 1296.0F));
      n5.addItem("psk:NorthAmericaLetterPlus", new f2(612.0F, 913.68F));
      n5.addItem("psk:NorthAmerica14x17", new f2(1008.0F, 1224.0F));
      n5.addItem("psk:NorthAmerica5x7", new f2(360.0F, 504.0F));
      n5.addItem("psk:NorthAmericaArchitectureBSheet", new f2(864.0F, 1296.0F));
      n5.addItem("psk:NorthAmericaArchitectureCSheet", new f2(1296.0F, 1728.0F));
      n5.addItem("psk:NorthAmericaGermanLegalFanfold", new f2(612.0F, 936.0F));
      n5.addItem("psk:NorthAmericaArchitectureESheet", new f2(2592.0F, 3456.0F));
      n5.addItem("psk:NorthAmericaESheet", new f2(2448.0F, 3168.0F));
      n5.addItem("psk:PRC2Envelope", new f2(289.13F, 498.9F));
      n5.addItem("psk:PRC7Envelope", new f2(453.54F, 651.97F));
      n5.addItem("psk:PRC8Envelope", new f2(340.16F, 875.91F));
      n5.addItem("psk:PRC6Envelope", new f2(340.16F, 651.97F));
      n5.addItem("psk:PRC4Envelope", new f2(311.81F, 589.61F));
      n5.addItem("psk:PRC1Envelope", new f2(289.13F, 467.72F));
      n5.addItem("psk:PRC16K", new f2(413.86F, 609.45F));
      n5.addItem("psk:PRC32KBig", new f2(274.96F, 428.03F));
      n5.addItem("psk:PRC32K", new f2(274.96F, 428.03F));
      n5.addItem("psk:PRC3Envelope", new f2(354.33F, 498.9F));
      n5.addItem("psk:JapanLPhoto", new f2(252.28F, 360.0F));
      n5.addItem("psk:JapanYou3Envelope", new f2(277.8F, 419.53F));
      n5.addItem("psk:JapanHagakiPostcard", new f2(283.46F, 419.53F));
      n5.addItem("psk:JapanDoubleHagakiPostcard", new f2(566.93F, 419.53F));
      n5.addItem("psk:JapanYou1Envelope", new f2(340.16F, 498.9F));
      n5.addItem("psk:JapanQuadrupleHagakiPostcard", new f2(566.93F, 839.06F));
      n5.addItem("psk:Japan2LPhoto", new f2(360.0F, 504.57F));
      n5.addItem("psk:JapanYou4Envelope", new f2(297.64F, 666.14F));
      n5.addItem("psk:JapanKaku2Envelope", new f2(680.31F, 941.1F));
      n5.addItem("psk:JapanChou4Envelope", new f2(255.12F, 581.1F));
      n5.addItem("psk:JapanKaku3Envelope", new f2(612.28F, 785.2F));
      n5.addItem("psk:JapanChou3Envelope", new f2(340.16F, 666.14F));
      n5.addItem("psk:JapanYou6Envelope", new f2(277.8F, 538.58F));
      n5.addItem("psk:JISB10", new f2(90.71F, 127.56F));
      n5.addItem("psk:JISB8", new f2(181.42F, 257.95F));
      n5.addItem("psk:JISB9", new f2(127.56F, 181.42F));
      n5.addItem("psk:JISB2", new f2(1459.84F, 2063.62F));
      n5.addItem("psk:JISB3", new f2(1031.81F, 1459.84F));
      n5.addItem("psk:JISB0", new f2(2919.69F, 4127.24F));
      n5.addItem("psk:JISB1", new f2(2063.62F, 2919.69F));
      n5.addItem("psk:JISB6", new f2(362.83F, 515.91F));
      n5.addItem("psk:JISB7", new f2(257.95F, 362.83F));
      n5.addItem("psk:JISB4", new f2(728.5F, 1031.81F));
      n5.addItem("psk:JISB5", new f2(515.91F, 728.5F));
      n5.addItem("psk:BusinessCard", new f2(155.91F, 257.95F));
      n5.addItem("psk:OtherMetricA4Plus", new f2(595.28F, 935.43F));
      n5.addItem("psk:CreditCard", new f2(153.07F, 243.78F));
      n5.addItem("psk:OtherMetricInviteEnvelope", new f2(623.62F, 623.62F));
      n5.addItem("psk:OtherMetricA3Plus", new f2(932.6F, 1369.13F));
      n5.addItem("psk:OtherMetricItalianEnvelope", new f2(311.81F, 651.97F));
   }
}
