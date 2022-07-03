package dev.santa.soft.extensions

import dev.santa.soft.dto.StudentDto
import dev.santa.soft.models.Student

fun Student.toDto(): StudentDto =
    StudentDto(
        id = this.id.toString(),
        name = this.name,
        baseStar = this.baseStar,
        background = this.background,
        school = this.school,
        playRole = this.playRole,
        position = this.position,
        attackType = this.attackType,
        armorType = this.armorType,
        combatClass = this.combatClass,
        affinity = this.affinity,
        weaponType = this.weaponType,
        equip1 = this.equip1,
        equip2 = this.equip2,
        equip3 = this.equip3,
        fullName = this.fullName,
        age = this.age,
        birthday = this.birthday,
        height = this.height,
        hobbies = this.hobbies,
        illustrator = this.illustrator,
        voiceActress = this.voiceActress,
        releaseDate = this.releaseDate,
        stats = this.stats.toString(),
        bonusAffection = this.bonusAffection.toString(),
        skills = this.skills.toString(),
        uniqueWeapon = this.uniqueWeapon.toString(),
        cafeFurniture = this.cafeFurniture,
        gifts = this.gifts.toString()
    )

fun StudentDto.toStudent(): Student =
    Student(
        name = this.name,
        baseStar = this.baseStar,
        background = this.background,
        school = this.school,
        playRole = this.playRole,
        position = this.position,
        attackType = this.attackType,
        armorType = this.armorType,
        combatClass = this.combatClass,
        affinity = this.affinity,
        weaponType = this.weaponType,
        equip1 = this.equip1,
        equip2 = this.equip2,
        equip3 = this.equip3,
        fullName = this.fullName,
        age = this.age,
        birthday = this.birthday,
        height = this.height,
        hobbies = this.hobbies,
        illustrator = this.illustrator,
        voiceActress = this.voiceActress,
        releaseDate = this.releaseDate,
        stats = this.stats.toString(),
        bonusAffection = this.bonusAffection.toString(),
        skills = this.skills.toString(),
        uniqueWeapon = this.uniqueWeapon.toString(),
        cafeFurniture = this.cafeFurniture,
        gifts = this.gifts.toString()
    )
