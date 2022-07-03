package dev.santa.soft.dto

import dev.santa.soft.constants.AffinityGrade
import dev.santa.soft.constants.ArmorType
import dev.santa.soft.constants.AttackType
import dev.santa.soft.constants.CombatClass
import dev.santa.soft.constants.EquipType
import dev.santa.soft.constants.PlayRole
import dev.santa.soft.constants.Position
import dev.santa.soft.constants.School
import dev.santa.soft.constants.WeaponType
import kotlinx.serialization.Serializable

@Serializable
data class StudentDto(
    val id: String? = null,
    val name: String,
    val baseStar: Int,
    val background: String,
    val school: School,
    val playRole: PlayRole,
    val position: Position,
    val attackType: AttackType,
    val armorType: ArmorType,
    val combatClass: CombatClass,
    val affinity: Map<String, AffinityGrade>,
    val weaponType: WeaponType,
    val equip1: EquipType,
    val equip2: EquipType,
    val equip3: EquipType,
    val fullName: String,
    val age: Int,
    val birthday: String,
    val height: Int,
    val hobbies: String,
    val illustrator: String,
    val voiceActress: String,
    val releaseDate: String,
    val stats: String?,
    val bonusAffection: String?,
    val skills: String?,
    val uniqueWeapon: String?,
    val cafeFurniture: String?,
    val gifts: String?
)
