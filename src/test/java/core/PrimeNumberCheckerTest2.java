package core;

import org.testng.annotations.*;

import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeNumberCheckerTest2 {

    @DataProvider(name = "prime number")

    public static Object[][] primeNumbers() {
        return new Object[][] {

            {2, true},
            {3, true},
            {4, false},
            {5, true},
            {6, false},
            {7, true},
            {8, false},
            {9, false},
            {10, false},
            {11, true},
            {12, false},
            {13, true},
            {14, false},
            {15, false},
            {16, false},
            {17, true},
            {18, false},
            {19, true},
            {20, false},
            {21, false},
            {22, false},
            {23, true},
            {24, false},
            {25, false},
            {26, false},
            {27, false},
            {28, false},
            {29, true},
            {30, false},
            {31, true},
            {32, false},
            {33, false},
            {34, false},
            {35, false},
            {36, false},
            {37, true},
            {38, false},
            {39, false},
            {40, false},
            {41, true},
            {42, false},
            {43, true},
            {44, false},
            {45, false},
            {46, false},
            {47, true},
            {48, false},
            {49, false},
            {50, false},
            {51, false},
            {52, false},
            {53, true},
            {54, false},
            {55, false},
            {56, false},
            {57, false},
            {58, false},
            {59, true},
            {60, false},
            {61, true},
            {62, false},
            {63, false},
            {64, false},
            {65, false},
            {66, false},
            {67, true},
            {68, false},
            {69, false},
            {70, false},
            {71, true},
            {72, false},
            {73, true},
            {74, false},
            {75, false},
            {76, false},
            {77, false},
            {78, false},
            {79, true},
            {80, false},
            {81, false},
            {82, false},
            {83, true},
            {84, false},
            {85, false},
            {86, false},
            {87, false},
            {88, false},
            {89, true},
            {90, false},
            {91, false},
            {92, false},
            {93, false},
            {94, false},
            {95, false},
            {96, false},
            {97, true},
            {98, false},
            {99, false},
            {100, false},
            {101, true},
            {102, false},
            {103, true},
            {104, false},
            {105, false},
            {106, false},
            {107, true},
            {108, false},
            {109, true},
            {110, false},
            {111, false},
            {112, false},
            {113, true},
            {114, false},
            {115, false},
            {116, false},
            {117, false},
            {118, false},
            {119, false},
            {120, false},
            {121, false},
            {122, false},
            {123, false},
            {124, false},
            {125, false},
            {126, false},
            {127, true},
            {128, false},
            {129, false},
            {130, false},
            {131, true},
            {132, false},
            {133, false},
            {134, false},
            {135, false},
            {136, false},
            {137, true},
            {138, false},
            {139, true},
            {140, false},
            {141, false},
            {142, false},
            {143, false},
            {144, false},
            {145, false},
            {146, false},
            {147, false},
            {148, false},
            {149, true},
            {150, false},
            {151, true},
            {152, false},
            {153, false},
            {154, false},
            {155, false},
            {156, false},
            {157, true},
            {158, false},
            {159, false},
            {160, false},
            {161, false},
            {162, false},
            {163, true},
            {164, false},
            {165, false},
            {166, false},
            {167, true},
            {168, false},
            {169, false},
            {170, false},
            {171, false},
            {172, false},
            {173, true},
            {174, false},
            {175, false},
            {176, false},
            {177, false},
            {178, false},
            {179, true},
            {180, false},
            {181, true},
            {182, false},
            {183, false},
            {184, false},
            {185, false},
            {186, false},
            {187, false},
            {188, false},
            {189, false},
            {190, false},
            {191, true},
            {192, false},
            {193, true},
            {194, false},
            {195, false},
            {196, false},
            {197, true},
            {198, false},
            {199, true},
            {200, false},
            {201, false},
            {202, false},
            {203, false},
            {204, false},
            {205, false},
            {206, false},
            {207, false},
            {208, false},
            {209, false},
            {210, false},
            {211, true},
            {212, false},
            {213, false},
            {214, false},
            {215, false},
            {216, false},
            {217, false},
            {218, false},
            {219, false},
            {220, false},
            {221, false},
            {222, false},
            {223, true},
            {224, false},
            {225, false},
            {226, false},
            {227, true},
            {228, false},
            {229, true},
            {230, false},
            {231, false},
            {232, false},
            {233, true},
            {234, false},
            {235, false},
            {236, false},
            {237, false},
            {238, false},
            {239, true},
            {240, false},
            {241, true},
            {242, false},
            {243, false},
            {244, false},
            {245, false},
            {246, false},
            {247, false},
            {248, false},
            {249, false},
            {250, false},
            {251, true},
            {252, false},
            {253, false},
            {254, false},
            {255, false},
            {256, false},
            {257, true},
            {258, false},
            {259, false},
            {260, false},
            {261, false},
            {262, false},
            {263, true},
            {264, false},
            {265, false},
            {266, false},
            {267, false},
            {268, false},
            {269, true},
            {270, false},
            {271, true},
            {272, false},
            {273, false},
            {274, false},
            {275, false},
            {276, false},
            {277, true},
            {278, false},
            {279, false},
            {280, false},
            {281, true},
            {282, false},
            {283, true},
            {284, false},
            {285, false},
            {286, false},
            {287, false},
            {288, false},
            {289, false},
            {290, false},
            {291, false},
            {292, false},
            {293, true},
            {294, false},
            {295, false},
            {296, false},
            {297, false},
            {298, false},
            {299, false},
            {300, false},
            {301, false},
            {302, false},
            {303, false},
            {304, false},
            {305, false},
            {306, false},
            {307, true},
            {308, false},
            {309, false},
            {310, false},
            {311, true},
            {312, false},
            {313, true},
            {314, false},
            {315, false},
            {316, false},
            {317, true},
            {318, false},
            {319, false},
            {320, false},
            {321, false},
            {322, false},
            {323, false},
            {324, false},
            {325, false},
            {326, false},
            {327, false},
            {328, false},
            {329, false},
            {330, false},
            {331, true},
            {332, false},
            {333, false},
            {334, false},
            {335, false},
            {336, false},
            {337, true},
            {338, false},
            {339, false},
            {340, false},
            {341, false},
            {342, false},
            {343, false},
            {344, false},
            {345, false},
            {346, false},
            {347, true},
            {348, false},
            {349, true},
            {350, false},
            {351, false},
            {352, false},
            {353, true},
            {354, false},
            {355, false},
            {356, false},
            {357, false},
            {358, false},
            {359, true},
            {360, false},
            {361, false},
            {362, false},
            {363, false},
            {364, false},
            {365, false},
            {366, false},
            {367, true},
            {368, false},
            {369, false},
            {370, false},
            {371, false},
            {372, false},
            {373, true},
            {374, false},
            {375, false},
            {376, false},
            {377, false},
            {378, false},
            {379, true},
            {380, false},
            {381, false},
            {382, false},
            {383, true},
            {384, false},
            {385, false},
            {386, false},
            {387, false},
            {388, false},
            {389, true},
            {390, false},
            {391, false},
            {392, false},
            {393, false},
            {394, false},
            {395, false},
            {396, false},
            {397, true},
            {398, false},
            {399, false},
            {400, false},
            {401, true},
            {402, false},
            {403, false},
            {404, false},
            {405, false},
            {406, false},
            {407, false},
            {408, false},
            {409, true},
            {410, false},
            {411, false},
            {412, false},
            {413, false},
            {414, false},
            {415, false},
            {416, false},
            {417, false},
            {418, false},
            {419, true},
            {420, false},
            {421, true},
            {422, false},
            {423, false},
            {424, false},
            {425, false},
            {426, false},
            {427, false},
            {428, false},
            {429, false},
            {430, false},
            {431, true},
            {432, false},
            {433, true},
            {434, false},
            {435, false},
            {436, false},
            {437, false},
            {438, false},
            {439, true},
            {440, false},
            {441, false},
            {442, false},
            {443, true},
            {444, false},
            {445, false},
            {446, false},
            {447, false},
            {448, false},
            {449, true},
            {450, false},
            {451, false},
            {452, false},
            {453, false},
            {454, false},
            {455, false},
            {456, false},
            {457, true},
            {458, false},
            {459, false},
            {460, false},
            {461, true},
            {462, false},
            {463, true},
            {464, false},
            {465, false},
            {466, false},
            {467, true},
            {468, false},
            {469, false},
            {470, false},
            {471, false},
            {472, false},
            {473, false},
            {474, false},
            {475, false},
            {476, false},
            {477, false},
            {478, false},
            {479, true},
            {480, false},
            {481, false},
            {482, false},
            {483, false},
            {484, false},
            {485, false},
            {486, false},
            {487, true},
            {488, false},
            {489, false},
            {490, false},
            {491, true},
            {492, false},
            {493, false},
            {494, false},
            {495, false},
            {496, false},
            {497, false},
            {498, false},
            {499, true},
            {500, false},
            {501, false},
            {502, false},
            {503, true},
            {504, false},
            {505, false},
            {506, false},
            {507, false},
            {508, false},
            {509, true},
            {510, false},
            {511, false},
            {512, false},
            {513, false},
            {514, false},
            {515, false},
            {516, false},
            {517, false},
            {518, false},
            {519, false},
            {520, false},
            {521, true},
            {522, false},
            {523, true},
            {524, false},
            {525, false},
            {526, false},
            {527, false},
            {528, false},
            {529, false},
            {530, false},
            {531, false},
            {532, false},
            {533, false},
            {534, false},
            {535, false},
            {536, false},
            {537, false},
            {538, false},
            {539, false},
            {540, false},
            {541, true},
            {542, false},
            {543, false},
            {544, false},
            {545, false},
            {546, false},
            {547, true},
            {548, false},
            {549, false},
            {550, false},
            {551, false},
            {552, false},
            {553, false},
            {554, false},
            {555, false},
            {556, false},
            {557, true},
            {558, false},
            {559, false},
            {560, false},
            {561, false},
            {562, false},
            {563, true},
            {564, false},
            {565, false},
            {566, false},
            {567, false},
            {568, false},
            {569, true},
            {570, false},
            {571, true},
            {572, false},
            {573, false},
            {574, false},
            {575, false},
            {576, false},
            {577, true},
            {578, false},
            {579, false},
            {580, false},
            {581, false},
            {582, false},
            {583, false},
            {584, false},
            {585, false},
            {586, false},
            {587, true},
            {588, false},
            {589, false},
            {590, false},
            {591, false},
            {592, false},
            {593, true},
            {594, false},
            {595, false},
            {596, false},
            {597, false},
            {598, false},
            {599, true},
            {600, false},
            {601, true},
            {602, false},
            {603, false},
            {604, false},
            {605, false},
            {606, false},
            {607, true},
            {608, false},
            {609, false},
            {610, false},
            {611, false},
            {612, false},
            {613, true},
            {614, false},
            {615, false},
            {616, false},
            {617, true},
            {618, false},
            {619, true},
            {620, false},
            {621, false},
            {622, false},
            {623, false},
            {624, false},
            {625, false},
            {626, false},
            {627, false},
            {628, false},
            {629, false},
            {630, false},
            {631, true},
            {632, false},
            {633, false},
            {634, false},
            {635, false},
            {636, false},
            {637, false},
            {638, false},
            {639, false},
            {640, false},
            {641, true},
            {642, false},
            {643, true},
            {644, false},
            {645, false},
            {646, false},
            {647, true},
            {648, false},
            {649, false},
            {650, false},
            {651, false},
            {652, false},
            {653, true},
            {654, false},
            {655, false},
            {656, false},
            {657, false},
            {658, false},
            {659, true},
            {660, false},
            {661, true},
            {662, false},
            {663, false},
            {664, false},
            {665, false},
            {666, false},
            {667, false},
            {668, false},
            {669, false},
            {670, false},
            {671, false},
            {672, false},
            {673, true},
            {674, false},
            {675, false},
            {676, false},
            {677, true},
            {678, false},
            {679, false},
            {680, false},
            {681, false},
            {682, false},
            {683, true},
            {684, false},
            {685, false},
            {686, false},
            {687, false},
            {688, false},
            {689, false},
            {690, false},
            {691, true},
            {692, false},
            {693, false},
            {694, false},
            {695, false},
            {696, false},
            {697, false},
            {698, false},
            {699, false},
            {700, false},
            {701, true},
            {702, false},
            {703, false},
            {704, false},
            {705, false},
            {706, false},
            {707, false},
            {708, false},
            {709, true},
            {710, false},
            {711, false},
            {712, false},
            {713, false},
            {714, false},
            {715, false},
            {716, false},
            {717, false},
            {718, false},
            {719, true},
            {720, false},
            {721, false},
            {722, false},
            {723, false},
            {724, false},
            {725, false},
            {726, false},
            {727, true},
            {728, false},
            {729, false},
            {730, false},
            {731, false},
            {732, false},
            {733, true},
            {734, false},
            {735, false},
            {736, false},
            {737, false},
            {738, false},
            {739, true},
            {740, false},
            {741, false},
            {742, false},
            {743, true},
            {744, false},
            {745, false},
            {746, false},
            {747, false},
            {748, false},
            {749, false},
            {750, false},
            {751, true},
            {752, false},
            {753, false},
            {754, false},
            {755, false},
            {756, false},
            {757, true},
            {758, false},
            {759, false},
            {760, false},
            {761, true},
            {762, false},
            {763, false},
            {764, false},
            {765, false},
            {766, false},
            {767, false},
            {768, false},
            {769, true},
            {770, false},
            {771, false},
            {772, false},
            {773, true},
            {774, false},
            {775, false},
            {776, false},
            {777, false},
            {778, false},
            {779, false},
            {780, false},
            {781, false},
            {782, false},
            {783, false},
            {784, false},
            {785, false},
            {786, false},
            {787, true},
            {788, false},
            {789, false},
            {790, false},
            {791, false},
            {792, false},
            {793, false},
            {794, false},
            {795, false},
            {796, false},
            {797, true},
            {798, false},
            {799, false},
            {800, false},
            {801, false},
            {802, false},
            {803, false},
            {804, false},
            {805, false},
            {806, false},
            {807, false},
            {808, false},
            {809, true},
            {810, false},
            {811, true},
            {812, false},
            {813, false},
            {814, false},
            {815, false},
            {816, false},
            {817, false},
            {818, false},
            {819, false},
            {820, false},
            {821, true},
            {822, false},
            {823, true},
            {824, false},
            {825, false},
            {826, false},
            {827, true},
            {828, false},
            {829, true},
            {830, false},
            {831, false},
            {832, false},
            {833, false},
            {834, false},
            {835, false},
            {836, false},
            {837, false},
            {838, false},
            {839, true},
            {840, false},
            {841, false},
            {842, false},
            {843, false},
            {844, false},
            {845, false},
            {846, false},
            {847, false},
            {848, false},
            {849, false},
            {850, false},
            {851, false},
            {852, false},
            {853, true},
            {854, false},
            {855, false},
            {856, false},
            {857, true},
            {858, false},
            {859, true},
            {860, false},
            {861, false},
            {862, false},
            {863, true},
            {864, false},
            {865, false},
            {866, false},
            {867, false},
            {868, false},
            {869, false},
            {870, false},
            {871, false},
            {872, false},
            {873, false},
            {874, false},
            {875, false},
            {876, false},
            {877, true},
            {878, false},
            {879, false},
            {880, false},
            {881, true},
            {882, false},
            {883, true},
            {884, false},
            {885, false},
            {886, false},
            {887, true},
            {888, false},
            {889, false},
            {890, false},
            {891, false},
            {892, false},
            {893, false},
            {894, false},
            {895, false},
            {896, false},
            {897, false},
            {898, false},
            {899, false},
            {900, false},
            {901, false},
            {902, false},
            {903, false},
            {904, false},
            {905, false},
            {906, false},
            {907, true},
            {908, false},
            {909, false},
            {910, false},
            {911, true},
            {912, false},
            {913, false},
            {914, false},
            {915, false},
            {916, false},
            {917, false},
            {918, false},
            {919, true},
            {920, false},
            {921, false},
            {922, false},
            {923, false},
            {924, false},
            {925, false},
            {926, false},
            {927, false},
            {928, false},
            {929, true},
            {930, false},
            {931, false},
            {932, false},
            {933, false},
            {934, false},
            {935, false},
            {936, false},
            {937, true},
            {938, false},
            {939, false},
            {940, false},
            {941, true},
            {942, false},
            {943, false},
            {944, false},
            {945, false},
            {946, false},
            {947, true},
            {948, false},
            {949, false},
            {950, false},
            {951, false},
            {952, false},
            {953, true},
            {954, false},
            {955, false},
            {956, false},
            {957, false},
            {958, false},
            {959, false},
            {960, false},
            {961, false},
            {962, false},
            {963, false},
            {964, false},
            {965, false},
            {966, false},
            {967, true},
            {968, false},
            {969, false},
            {970, false},
            {971, true},
            {972, false},
            {973, false},
            {974, false},
            {975, false},
            {976, false},
            {977, true},
            {978, false},
            {979, false},
            {980, false},
            {981, false},
            {982, false},
            {983, true},
            {984, false},
            {985, false},
            {986, false},
            {987, false},
            {988, false},
            {989, false},
            {990, false},
            {991, true},
            {992, false},
            {993, false},
            {994, false},
            {995, false},
            {996, false},
            {997, true},
            {998, false},
            {999, false},
            {1000, false},
            {1001, false}

        };

    }

    @Test(timeOut = 1000, dataProvider = "prime number", groups = { "qa" })

    public void test(int number, boolean expected) {

        System.out.println(number + (PrimeNumberChecker.validate(number) ? " - Prime number" : " - Not prime number"));

        assertThat(expected, equalTo(PrimeNumberChecker.validate(number)));
    }

}